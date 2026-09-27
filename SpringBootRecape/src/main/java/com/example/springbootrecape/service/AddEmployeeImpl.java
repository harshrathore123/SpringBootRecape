package com.example.springbootrecape.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springbootrecape.entities.AddContact;
import com.example.springbootrecape.entities.AddEmployee;
import com.example.springbootrecape.repository.AddEmployeeRepository;

import lombok.AllArgsConstructor;

@Service
public class AddEmployeeImpl implements AddEmployeeService {
	private final AddEmployeeRepository addEmplyoeeRepository;

	public AddEmployeeImpl(AddEmployeeRepository addEmplyoeeRepository) {
		super();
		this.addEmplyoeeRepository = addEmplyoeeRepository;
	}

	public AddEmployee addEmployee(AddEmployee addEmployee) {
		return addEmplyoeeRepository.save(addEmployee);
	}

	@Override
	public AddEmployee getEmployee(Integer id) {
		Optional<AddEmployee> employee = this.addEmplyoeeRepository.findById(id);

		if (employee.isPresent()) {
			AddEmployee emp = employee.get();
			return emp;
		}

		return null;
	}

	@Override
	public List<AddEmployee> getAllEmployee() {
		List<AddEmployee> emp = this.addEmplyoeeRepository.findAll();
		return emp;
	}
}
