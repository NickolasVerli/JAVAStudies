package com.verli.school.services;

import com.verli.school.models.School;
import com.verli.school.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SchoolServices {
    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> findAll(){
        return schoolRepository.findAll();
    }
    public School criarEscola(School school){
        return schoolRepository.save(school);
    }

    public void deletarEscola(Long Id){
        schoolRepository.deleteById(Id);
    }


}
