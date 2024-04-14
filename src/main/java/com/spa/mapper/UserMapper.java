package com.spa.mapper;

import com.spa.dto.UserCreateDto;
import com.spa.dto.UserDto;
import com.spa.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    @Mapping(target = "posts.user", ignore = true)
    UserDto toDto(User user);

    @Mapping(target = "posts.user", ignore = true)
    User toEntity(UserDto dto);

    User toEntity(UserCreateDto dto);
}