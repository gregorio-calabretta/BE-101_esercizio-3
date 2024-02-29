package com.example.esercizio1.service;

import com.example.esercizio1.model.Person;
import com.example.esercizio1.model.Profession;
import com.example.esercizio1.repository.PersonRepository;
import com.example.esercizio1.repository.ProfessionRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfessionService {
    private final ProfessionRepository professionRepository;
    private final PersonRepository personRepository;
    public ProfessionService(ProfessionRepository professionRepository, PersonRepository personRepository) {
        this.professionRepository = professionRepository;
        this.personRepository = personRepository;
    }

    public Profession addProfession(Profession profession){
        return professionRepository.save(profession);
    }



    public Profession findByNameAndSurname(String name, String surname) {
        Person person = personRepository.findByNameAndSurname(name,surname);
        return person.getProfession();
    }

    public Profession getProfessionById(Integer id) {
        return professionRepository.findById(id).orElse(null);
    }
}
