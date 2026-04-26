package com.karan.tasktracker.dto.response;

import com.karan.tasktracker.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private Long id;
    private String username;
    private Role role;
}
