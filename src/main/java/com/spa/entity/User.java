package com.spa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String login;
    @Column
    private String email;
    @Column
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
