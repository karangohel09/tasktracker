package com.karan.tasktracker.service;

import com.karan.tasktracker.dto.request.TaskRequestDTO;
import com.karan.tasktracker.dto.response.TaskResponseDTO;

import java.util.List;

public interface TaskService {
    TaskResponseDTO createTask(TaskRequestDTO dto);
    TaskResponseDTO updateTask(Long id,TaskRequestDTO dto);
    void deleteTask(Long id);
    List<TaskResponseDTO> getAllTask();
    TaskResponseDTO markInProgress(Long id);
    TaskResponseDTO markDone(Long id);
    List<TaskResponseDTO> getTasksByStatus(String status);
}
