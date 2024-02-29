package com.example.esercizio1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.name = name;
        this.id = id;
    }
    public Person() {
    }
    public UUID getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}
