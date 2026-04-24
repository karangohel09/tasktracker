package com.karan.tasktracker.service;

import com.karan.tasktracker.dto.request.TaskRequestDTO;
import com.karan.tasktracker.dto.response.TaskResponseDTO;
import com.karan.tasktracker.enums.TaskStatus;

import java.util.List;

public interface TaskService {
    TaskResponseDTO createTask(TaskRequestDTO dto);
    TaskResponseDTO updateTask(Long id,TaskRequestDTO dto);
    void deleteTask(Long id);
    TaskResponseDTO markInProgress(Long id);
    TaskResponseDTO markDone(Long id);
    List<TaskResponseDTO> getTasks(
            int page,
            int size,
            String sortBy,
            String direction,
            TaskStatus status
    );
}
