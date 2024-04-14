package com.spa.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PostDto {
    private Long id;
    private UserDto user;
    private String context;
    private PostDto parent;
    private List<PostDto> comments;
    private LocalDateTime createDate;

    public PostDto() {
    }

    public PostDto(Long id, UserDto user, String context, PostDto parent, List<PostDto> comments, LocalDateTime createDate) {
        this.id = id;
        this.user = user;
        this.context = context;
        this.parent = parent;
        this.comments = comments;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public PostDto getParent() {
        return parent;
    }

    public void setParent(PostDto parent) {
        this.parent = parent;
    }

    public List<PostDto> getComments() {
        return comments;
    }

    public void setComments(List<PostDto> comments) {
        this.comments = comments;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private UserDto user;
        private String context;
        private PostDto parent;
        private List<PostDto> comments;
        private LocalDateTime createDate;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUser(UserDto user) {
            this.user = user;
            return this;
        }

        public Builder setContext(String context) {
            this.context = context;
            return this;
        }

        public Builder setParent(PostDto parent) {
            this.parent = parent;
            return this;
        }

        public Builder setComments(List<PostDto> comments) {
            this.comments = comments;
            return this;
        }

        public Builder setCreateDate(LocalDateTime createDate) {
            this.createDate = createDate;
            return this;
        }

        public PostDto build() {
            return new PostDto(id, user, context, parent, comments, createDate);
        }
    }
}
