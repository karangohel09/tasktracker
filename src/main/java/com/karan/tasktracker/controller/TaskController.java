package com.karan.tasktracker.controller;

import com.karan.tasktracker.dto.request.TaskRequestDTO;
import com.karan.tasktracker.dto.response.TaskResponseDTO;
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
    public List<TaskResponseDTO> getAllTasks(){
        return service.getAllTask();
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

    @GetMapping("/status")
    public List<TaskResponseDTO> getTaskByStatus(@RequestParam(required = false) String status){
        return service.getTasksByStatus(status);
    }
}
