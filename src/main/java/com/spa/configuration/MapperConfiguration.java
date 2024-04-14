package com.spa.configuration;

import com.spa.mapper.PostMapper;
import com.spa.mapper.UserMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {
    @Bean
    public UserMapper getUserMapper() {
        return Mappers.getMapper(UserMapper.class);
    }

    @Bean
    public PostMapper getPostMapper() {
        return Mappers.getMapper(PostMapper.class);
    }
}