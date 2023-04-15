package com.example.caching.repository;

import com.example.caching.model.Person;

public interface PersonRepository {

    Person getByName(String name);
}
