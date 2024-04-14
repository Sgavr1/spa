package com.spa.servise;

import com.spa.dto.PostDto;
import com.spa.mapper.PostMapper;
import com.spa.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper mapper;

    public PostService(PostRepository postRepository, PostMapper mapper) {
        this.postRepository = postRepository;
        this.mapper = mapper;
    }

    public PostDto getPost(Long id) {
        return mapper.toDto(postRepository.findById(id).get());
    }

    public List<PostDto> getPosts() {
        List<PostDto> posts = new ArrayList();

        postRepository.findAllPost().forEach(post -> System.out.println(post.getDate().toString()));

        postRepository.findAllPost().forEach(post -> posts.add(mapper.toDto(post)));

        return posts;
    }

    public List<PostDto> getAll(){
        List<PostDto> posts = new ArrayList();

        postRepository.findAll().forEach(post -> posts.add(mapper.toDto(post)));

        return posts;
    }

    public PostDto create(PostDto post) {
        return mapper.toDto(postRepository.save(mapper.toEntity(post)));
    }
}