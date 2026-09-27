package com.example.springbootrecape.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootrecape.entities.AddContact;
import com.example.springbootrecape.entities.AddEmployee;
import com.example.springbootrecape.service.AddEmployeeService;

import lombok.AllArgsConstructor;

@RestController 
public class EmployeeController {
    private final AddEmployeeService addEmployeeService;

    public EmployeeController(AddEmployeeService addEmployeeService) {
		super();
		this.addEmployeeService = addEmployeeService;
	}

	@PostMapping ("/addEmployee")
    public AddEmployee addEmployee(@RequestBody AddEmployee addEmployee){
        return addEmployeeService.addEmployee(addEmployee);
    }
	
	@GetMapping("/getEmployee/{id}")
    public AddEmployee getEmployee(@PathVariable("id") Integer id) {
    	return this.addEmployeeService.getEmployee(id);
    }
}
