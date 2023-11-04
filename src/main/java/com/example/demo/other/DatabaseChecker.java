package com.example.demo.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseChecker {
    @Autowired
    public TestRepository repository;


    public DatabaseChecker() {}

    public void saveEntity(TestEntity entity) {
        repository.save(entity);
    }

    public TestEntity getEntity(Integer id) {
        return repository.getById(id);
    }
}
