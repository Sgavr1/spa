package com.spa.controller;

import com.spa.dto.PostDto;
import com.spa.servise.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/post/all")
    public List<PostDto> getPost(){
        return postService.getPosts();
    }
}
