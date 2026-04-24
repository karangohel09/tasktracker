package com.karan.tasktracker.mapper;

import com.karan.tasktracker.dto.request.TaskRequestDTO;
import com.karan.tasktracker.dto.response.TaskResponseDTO;
import com.karan.tasktracker.entity.Task;
import com.karan.tasktracker.enums.TaskStatus;

import java.time.LocalDateTime;

public class TaskMapper {
    public static TaskResponseDTO toDto(Task task){
        TaskResponseDTO dto = new TaskResponseDTO();
        dto.setId(task.getId());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        dto.setCreatedAt(task.getCreatedAt());
        dto.setUpdatedAt(task.getUpdatedAt());
        return  dto;
    }

    public static Task toEntity(TaskRequestDTO dto){
        Task task = new Task();
        task.setDescription(dto.getDescription());
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(LocalDateTime.now());
        task.setStatus(TaskStatus.TODO);
        return task;
    }

    public static void updateEntity(Task task, TaskRequestDTO dto) {
        task.setDescription(dto.getDescription());
        task.setUpdatedAt(LocalDateTime.now());
    }
}
