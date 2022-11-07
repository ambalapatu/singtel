package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
