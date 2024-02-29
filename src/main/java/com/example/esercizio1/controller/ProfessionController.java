package com.example.esercizio1.controller;

import com.example.esercizio1.model.Person;
import com.example.esercizio1.model.Profession;
import com.example.esercizio1.service.PersonService;
import com.example.esercizio1.service.ProfessionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/professions")
public class ProfessionController {

    private final ProfessionService professionService;

    public ProfessionController(ProfessionService professionService) {
        this.professionService = professionService;
    }
   /*
    @GetMapping
    public Profession findProfessionByPersonNameSurname(){
        return new Profession();
    }
    */


}
