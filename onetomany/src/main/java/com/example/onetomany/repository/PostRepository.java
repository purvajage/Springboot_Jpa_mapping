package com.example.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
