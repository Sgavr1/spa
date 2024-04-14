package com.spa.mapper;

import com.spa.dto.PostDto;
import com.spa.entity.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    PostDto toDto(Post post);

    Post toEntity(PostDto dto);
}
