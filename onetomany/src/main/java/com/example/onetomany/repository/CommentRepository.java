package com.example.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

}
