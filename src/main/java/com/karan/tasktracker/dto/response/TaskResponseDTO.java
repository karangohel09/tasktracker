package com.karan.tasktracker.dto.response;

import com.karan.tasktracker.enums.TaskStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TaskResponseDTO {
    private Long id;

    private String description;

    private TaskStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
