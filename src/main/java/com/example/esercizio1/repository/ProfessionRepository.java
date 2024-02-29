package com.example.esercizio1.repository;

import com.example.esercizio1.model.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession,Integer> {

    Profession findProfessionByPersonNameSurname(String name,String surname);

}
