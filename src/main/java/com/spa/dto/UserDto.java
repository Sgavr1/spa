package com.spa.dto;

import java.util.List;

public class UserDto {
    private Long id;
    private String login;
    private String email;
    private List<PostDto> posts;

    public UserDto() {
    }

    public UserDto(Long id, String login, String email, List<PostDto> posts) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PostDto> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDto> posts) {
        this.posts = posts;
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String login;
        private String email;
        private List<PostDto> posts;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPosts(List<PostDto> posts) {
            this.posts = posts;
            return this;
        }

        public UserDto build() {
            return new UserDto(id, login, email, posts);
        }
    }
}
