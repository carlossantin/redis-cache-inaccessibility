package com.example.caching.repository;

import com.example.caching.model.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    @Override
    @Cacheable("persons")
    public Person getByName(String name) {
        waitFor(3000);
        return new Person(name);
    }

    private void waitFor(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
