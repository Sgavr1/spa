package com.spa.mapper;

import com.spa.dto.PostDto;
import com.spa.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PostMapper {
    @Mapping(target = "user.posts", ignore = true)
    @Mapping(target = "parent.user.posts", ignore = true)
    @Mapping(target = "parent.comments", ignore = true)
    @Mapping(source = "date", target = "createDate")
    @Mapping(source = "childPosts", target = "comments")
    @Mapping(source = "parentPost", target = "parent")
    PostDto toDto(Post post);

    @Mapping(source = "createDate", target = "date")
    @Mapping(source = "comments", target = "childPosts")
    @Mapping(source = "parent", target = "parentPost")
    Post toEntity(PostDto dto);
}
