package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dto.EmployeeDto;
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
	
	@PutMapping("/{id}/employee")
	String updateEmpDetails(@PathVariable Long id,@RequestBody @Valid EmployeeDto employee) {
		return empSev.updateEmployee(id,employee);
	}
	
	@DeleteMapping("/{empId}")
	String deleteEmpDetails(@PathVariable Long empId) {
		return empSev.deleteEmployee(empId);
	}
}
