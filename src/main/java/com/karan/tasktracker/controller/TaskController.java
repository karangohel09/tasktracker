package com.karan.tasktracker.controller;

import com.karan.tasktracker.dto.request.TaskRequestDTO;
import com.karan.tasktracker.dto.response.TaskResponseDTO;
import com.karan.tasktracker.enums.TaskStatus;
import com.karan.tasktracker.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaskResponseDTO> getTasks(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction,
            @RequestParam(required = false)TaskStatus status
            ){
            return service.getTasks(page,size,sortBy,direction,status);
    }
    @PostMapping
    public TaskResponseDTO createTask(@Valid @RequestBody TaskRequestDTO dto){
        return service.createTask(dto);
    }

    @PutMapping("/{id}")
    public TaskResponseDTO updateTask(@PathVariable Long id ,@Valid @RequestBody TaskRequestDTO dto){
        return service.updateTask(id , dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        service.deleteTask(id);
    }

    @PatchMapping("/{id}/in-progress")
    public TaskResponseDTO markInProgress(@PathVariable Long id){
        return service.markInProgress(id);
    }

    @PatchMapping("/{id}/done")
    public TaskResponseDTO markDone(@PathVariable Long id){
        return service.markDone(id);
    }

}
