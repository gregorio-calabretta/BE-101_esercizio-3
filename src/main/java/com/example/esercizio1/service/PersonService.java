package com.example.esercizio1.service;

import com.example.esercizio1.dto.PersonDto;
import com.example.esercizio1.model.Profession;
import com.example.esercizio1.repository.PersonRepository;
import com.example.esercizio1.model.Person;
import com.example.esercizio1.repository.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final ProfessionRepository professionRepository;

    public PersonService(PersonRepository personRepository, ProfessionRepository professionRepository) {
        this.personRepository = personRepository;
        this.professionRepository = professionRepository;
    }

    public Person addPerson(PersonDto personDto){
        Person person = new Person(personDto.getName(),personDto.getSurname());
        Profession profession = professionRepository.findByName(personDto.getProfession());
        person.addProfession(profession);
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
