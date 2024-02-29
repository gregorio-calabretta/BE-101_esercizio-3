package com.example.esercizio1.service;

import com.example.esercizio1.model.Person;
import com.example.esercizio1.model.Profession;
import com.example.esercizio1.repository.PersonRepository;
import com.example.esercizio1.repository.ProfessionRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfessionService {
    private final ProfessionRepository professionRepository;

    public ProfessionService( ProfessionRepository professionRepository) {
        this.professionRepository = professionRepository;
    }

    public Profession (Person person){
      return  professionRepository.findProfessionByPersonNameSurname(person.getName(), person.getSurname());
    }



}
