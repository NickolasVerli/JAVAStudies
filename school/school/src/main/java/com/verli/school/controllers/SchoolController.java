package com.verli.school.controllers;

import com.verli.school.models.School;
import com.verli.school.services.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {
    @Autowired
    private SchoolServices schoolServices;
    @GetMapping
    public List<School> findAll(){
        return schoolServices.findAll();
    }
    @PostMapping
    public School criarEscola(@RequestBody School school){
        return  schoolServices.criarEscola(school);
    }
    @DeleteMapping
    public void deletar(@PathVariable Long id){
        schoolServices.deletarEscola(id);
    }
}
