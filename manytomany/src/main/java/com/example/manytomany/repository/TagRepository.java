package com.example.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.model.Post;

@Repository
public interface TagRepository extends JpaRepository<Post,Long> {

}
