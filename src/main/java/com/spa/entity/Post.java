package com.spa.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "parent_post")
    @ManyToOne
    private Post parentPost;
    @Column(name = "user_id")
    @ManyToOne
    @JoinColumn(name = "id")
    private User user;
    @Column
    private String content;
    @Column(name = "create_date")
    private LocalDateTime date;
    @OneToMany(mappedBy = "parentPost")
    private List<Post> childPosts;
}