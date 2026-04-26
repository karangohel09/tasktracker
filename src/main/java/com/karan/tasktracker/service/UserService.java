package com.karan.tasktracker.service;

import com.karan.tasktracker.dto.request.UserRequestDTO;
import com.karan.tasktracker.dto.response.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO register(UserRequestDTO dto);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO getUserById(Long id);
    void deleteUser(Long id);
}
