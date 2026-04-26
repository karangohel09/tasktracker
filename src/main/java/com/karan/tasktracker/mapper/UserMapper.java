package com.karan.tasktracker.mapper;

import com.karan.tasktracker.dto.request.UserRequestDTO;
import com.karan.tasktracker.dto.response.UserResponseDTO;
import com.karan.tasktracker.entity.User;

public class UserMapper {
    public static UserResponseDTO toDTO(User user){
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setRole(user.getRole());
        return dto;
    }

    public static User toEntity(UserRequestDTO dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        return user;
    }
}
