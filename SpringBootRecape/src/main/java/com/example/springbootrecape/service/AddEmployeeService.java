package com.example.springbootrecape.service;

import com.example.springbootrecape.entities.AddEmployee;

public interface AddEmployeeService {
    AddEmployee addEmployee(AddEmployee addEmployee);    
    AddEmployee getEmployee(Integer id);
}
