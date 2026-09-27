package com.example.springbootrecape.service;

import java.util.List;

import com.example.springbootrecape.entities.AddEmployee;

public interface AddEmployeeService {
    AddEmployee addEmployee(AddEmployee addEmployee);    
    AddEmployee getEmployee(Integer id);
    List<AddEmployee> getAllEmployee();
}
