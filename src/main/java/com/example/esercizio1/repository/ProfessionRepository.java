package com.example.esercizio1.repository;

import com.example.esercizio1.model.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession,Integer> {

    Profession save(Profession profession);
    List<Profession> findAll();

    Profession findByName(String profession);
}
