package com.example.esercizio1.service;

import com.example.esercizio1.repository.PersonRepository;
import com.example.esercizio1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService( PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(Person person){
        return personRepository.save(person);
    }
    public List<Person> selectAllPeople(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(UUID id){
        return personRepository.findById(id);
    }
    public void deletePerson(UUID id){
         personRepository.deleteById(id);
    }

}
