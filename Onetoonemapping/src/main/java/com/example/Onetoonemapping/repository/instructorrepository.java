package com.example.Onetoonemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onetoonemapping.model.instructor;

@Repository
public interface instructorrepository extends JpaRepository<instructor,Long> {

}
