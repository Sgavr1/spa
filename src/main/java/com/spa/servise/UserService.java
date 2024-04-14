package com.spa.servise;

import com.spa.dto.UserCreateDto;
import com.spa.dto.UserDto;
import com.spa.mapper.UserMapper;
import com.spa.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    public UserService(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    public UserDto getUser(Long id) {
        return mapper.toDto(userRepository.findById(id).get());
    }

    public List<UserDto> getUsers() {
        List<UserDto> users = new ArrayList<>();

        userRepository.findAll().forEach(user -> users.add(mapper.toDto(user)));

        return users;
    }

    public UserDto create(UserCreateDto user) {
        return mapper.toDto(userRepository.save(mapper.toEntity(user)));
    }
}
