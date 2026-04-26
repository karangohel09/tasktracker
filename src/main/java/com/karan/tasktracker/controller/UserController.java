package com.karan.tasktracker.controller;

import com.karan.tasktracker.dto.request.UserRequestDTO;
import com.karan.tasktracker.dto.response.UserResponseDTO;
import com.karan.tasktracker.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserResponseDTO> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping
    public UserResponseDTO register(UserRequestDTO dto){
        return service.register(dto);
    }

    @GetMapping("/{id}")
    public UserResponseDTO getUserByID(@PathVariable Long id){
        return service.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteUser(id);
    }
}
