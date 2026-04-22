package com.karan.tasktracker.service.implementation;

import com.karan.tasktracker.dto.request.TaskRequestDTO;
import com.karan.tasktracker.dto.response.TaskResponseDTO;
import com.karan.tasktracker.entity.Task;
import com.karan.tasktracker.enums.TaskStatus;
import com.karan.tasktracker.exception.TaskNotFoundException;
import com.karan.tasktracker.mapper.TaskMapper;
import com.karan.tasktracker.repository.TaskRepo;
import com.karan.tasktracker.service.TaskService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepo repo;

    public TaskServiceImpl(TaskRepo repo) {
        this.repo = repo;
    }

    @Override
    public TaskResponseDTO createTask(TaskRequestDTO dto) {
        Task task = TaskMapper.toEntity(dto);
        Task savedTask = repo.save(task);
        return TaskMapper.toDto(savedTask);
    }

    @Override
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO dto) {
        Task task = repo.findById(id).orElseThrow(()->new TaskNotFoundException("Task not found with id "+id));
        TaskMapper.updateEntity(task,dto);
        Task updatedTask = repo.save(task);
        return TaskMapper.toDto(updatedTask);
    }

    @Override
    public void deleteTask(Long id) {
        Task task = repo.findById(id).orElseThrow(()->new TaskNotFoundException("Task not found with id"+id));
        repo.deleteById(id);
    }

    @Override
    public List<TaskResponseDTO> getAllTask(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page,size,Sort.by(sortBy));
        return repo
                .findAll(pageable)
                .stream()
                .map(TaskMapper::toDto)
                .toList();
    }

    @Override
    public TaskResponseDTO markInProgress(Long id) {
        Task task = repo.findById(id).orElseThrow(()->
                new TaskNotFoundException("Task not found with id"+id));

        task.setStatus(TaskStatus.IN_PROGRESS);
        task.setUpdatedAt(LocalDateTime.now());

        Task updatedTask = repo.save(task);

        return TaskMapper.toDto(updatedTask);
    }

    @Override
    public TaskResponseDTO markDone(Long id) {
        Task task = repo.findById(id).orElseThrow(()->
                new TaskNotFoundException("Task not found with id"+id));
        task.setStatus(TaskStatus.DONE);
        task.setUpdatedAt(LocalDateTime.now());
        Task updatedTask = repo.save(task);
        return TaskMapper.toDto(updatedTask);
    }

    @Override
    public List<TaskResponseDTO> getTasksByStatus(String status) {

        String formattedStatus = status.toUpperCase().replace("-", "_");

        return repo.findByStatus(formattedStatus)
                .stream()
                .map(TaskMapper::toDto)
                .toList();
    }
}
