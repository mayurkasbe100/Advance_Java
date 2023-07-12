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
import com.app.service.EmpService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmpService empSev;
	
	@GetMapping("/{department}")
	List<Employee> getAllEmpDetails(@PathVariable String department){
		return empSev.getAllEmployees(department);
	}
	
	@PostMapping("/add")
	String addEmpDetails(@RequestBody Employee emp) {
		return empSev.addEmployee(emp);
	}
	
	@PutMapping("/{id}/{department}")
	String updateEmpDetails(@PathVariable Long id,@PathVariable String department) {
		return empSev.updateEmployee(id,department);
	}
	
	@DeleteMapping("/{empId}")
	String deleteEmpDetails(@PathVariable Long empId) {
		return empSev.deleteEmployee(empId);
	}
}
