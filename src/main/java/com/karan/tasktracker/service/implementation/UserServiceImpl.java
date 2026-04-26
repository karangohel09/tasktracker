package com.karan.tasktracker.service.implementation;

import com.karan.tasktracker.dto.request.UserRequestDTO;
import com.karan.tasktracker.dto.response.UserResponseDTO;
import com.karan.tasktracker.entity.User;
import com.karan.tasktracker.mapper.UserMapper;
import com.karan.tasktracker.repository.UserRepo;
import com.karan.tasktracker.service.UserService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo repo;
    private final PasswordEncoder encoder;

    public UserServiceImpl(UserRepo repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @Override
    public UserResponseDTO register(UserRequestDTO dto) {
        User user = UserMapper.toEntity(dto);
        user.setPassword(encoder.encode(dto.getPassword()));
        User savedUser = repo.save(user);
        return UserMapper.toDTO(savedUser);
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return repo
                .findAll()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        User user = repo.findById(id).orElseThrow(()->new UsernameNotFoundException("User not found with id"+id));
        return UserMapper.toDTO(user);
    }

    @Override
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
