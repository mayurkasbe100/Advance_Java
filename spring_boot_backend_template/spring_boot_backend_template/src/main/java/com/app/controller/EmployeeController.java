package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/employees")
@NoArgsConstructor
public class EmployeeController {

	
	@Autowired
	private EmployeeService empServ;

	
	
	
	@GetMapping
	List<Employee> getAllemployees() {

		return empServ.allEmpDetails();
	}

	
	
	
	@PostMapping("/addemp")
	String addEmpDetails(@RequestBody Employee emp) {

		return empServ.addEmpData(emp);
	}

	
	
	
	@PutMapping("/update")
	String updateEmpDetails(@RequestBody Employee emp) {

		return empServ.updateEmpData(emp);
	}

	
	
	@DeleteMapping("/{empId}")
	
	String deleteEmpDetails(@PathVariable Long empId) {

		return empServ.deleteEmpData(empId);
	}
	
	
	
	
	
	
	
}
