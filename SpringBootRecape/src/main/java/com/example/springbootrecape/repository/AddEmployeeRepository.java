package com.example.springbootrecape.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootrecape.entities.AddEmployee;

public interface AddEmployeeRepository extends JpaRepository<AddEmployee,Integer> {
    
}
