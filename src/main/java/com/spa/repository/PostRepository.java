package com.spa.repository;

import com.spa.entity.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Query(value = "Select p from Post p Where p.parentPost is null")
    public Iterable<Post> findAllPost();
}