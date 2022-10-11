package com.example.devops07springboot.repository;

import com.example.devops07springboot.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Integer> {
}
