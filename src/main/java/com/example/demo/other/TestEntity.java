package com.example.demo.other;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestEntity {
    @Id
    private Integer id;

    private String name;


    public Integer getId() {
        return id;
    }

    public TestEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TestEntity setName(String name) {
        this.name = name;
        return this;
    }

    public TestEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public TestEntity() {}
}
