package com.example.tomcat_spring_demo.repository;

import com.example.tomcat_spring_demo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
