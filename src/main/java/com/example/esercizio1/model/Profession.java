package com.example.esercizio1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "profession")
public class Profession {
    @Id
    private Integer id;
    private String name;


    public Profession(@JsonProperty Integer id,@JsonProperty String name) {
        this.id = id;
        this.name = name;
    }

    public Profession(){};

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Person> person;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
