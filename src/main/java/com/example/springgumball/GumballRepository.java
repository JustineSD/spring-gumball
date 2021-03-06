package com.example.springgumball;

import org.springframework.data.repository.CrudRepository;

import com.example.springgumball.GumballModel;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GumballRepository extends CrudRepository<GumballModel, String> {
    
}