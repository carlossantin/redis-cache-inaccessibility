package com.example.caching.controller;

import com.example.caching.model.Person;
import com.example.caching.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public List<Person> getAllPerson() {
        return List.of(
                personRepository.getByName("Carlos"),
                personRepository.getByName("Eduardo")
        );
    }
}
