package com.example.devops07springboot.controller;

import com.example.devops07springboot.model.Cat;
import com.example.devops07springboot.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @GetMapping("/all")
    public ResponseEntity<List<Cat>> getAllCats(){
        return ResponseEntity.ok(catService.getCatList());
    }

    @GetMapping("/cat/{id}")
    public ResponseEntity<Cat> getUserById(@PathVariable int id){
        return ResponseEntity.ok().body(this.catService.getCatById(id));
    }

    @PostMapping("/new")
    public ResponseEntity<Cat> addCat(@RequestBody Cat cat) {
        return ResponseEntity.ok(this.catService.createCat(cat));
    }

    @PutMapping("/update")
    public ResponseEntity<Cat> updateCat(@RequestBody Cat cat) {
        return ResponseEntity.ok().body(this.catService.updateCatById(cat));
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteCat(@PathVariable int id){
        this.catService.deleteCatById(id);
        return HttpStatus.OK;
    }
}
