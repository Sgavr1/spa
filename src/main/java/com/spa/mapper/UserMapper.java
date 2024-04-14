package com.spa.mapper;

import com.spa.dto.UserCreateDto;
import com.spa.dto.UserDto;
import com.spa.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(UserDto dto);

    User toEntity(UserCreateDto dto);
}