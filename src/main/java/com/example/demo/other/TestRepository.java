package com.example.demo.other;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TestRepository extends CrudRepository<TestEntity, Integer> {
    TestEntity getById(Integer id);
}
