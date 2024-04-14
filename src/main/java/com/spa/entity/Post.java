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
    @ManyToOne
    @JoinColumn(name = "parent_post_id")
    private Post parentPost;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private String content;
    @Column(name = "create_date")
    private LocalDateTime date;
    @OneToMany(mappedBy = "parentPost")
    private List<Post> childPosts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getParentPost() {
        return parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<Post> getChildPosts() {
        return childPosts;
    }

    public void setChildPosts(List<Post> childPosts) {
        this.childPosts = childPosts;
    }
}