package com.karan.tasktracker.dto.request;

import com.karan.tasktracker.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
    private String username;
    private String password;
    private Role role;
}
