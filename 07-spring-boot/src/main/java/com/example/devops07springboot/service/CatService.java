package com.example.devops07springboot.service;

import com.example.devops07springboot.model.Cat;
import com.example.devops07springboot.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    public Cat createCat(Cat cat){
        return catRepository.save(cat);
    }

    public


}
