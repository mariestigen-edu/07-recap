package com.example.devops07springboot.service;

import com.example.devops07springboot.model.Cat;
import com.example.devops07springboot.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    public Cat createCat(Cat cat){
        return catRepository.save(cat);
    }

    public List<Cat> getCatList(){
        return catRepository.findAll();
    }

    public Cat getCatById(int id){
        return catRepository.findById(id).orElse(null);
    }

    public Cat updateCatById(Cat cat){
        Optional<Cat> catFromDb = catRepository.findById(cat.getId());

        if(catFromDb.isPresent()){
            Cat catUpdated = catFromDb.get();
            catUpdated.setName(cat.getName());
            catUpdated.setAge(cat.getAge());
            catUpdated.setColor(cat.getColor());

            return catRepository.save(cat);
        } else {
            return null;
        }
    }

    public String deleteCatById(int id){
        catRepository.deleteById(id);
        return "Cat " + id + " deleted";
    }


}
