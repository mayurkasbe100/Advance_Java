package com.app.Dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDto {

	@NotBlank
	private String name;
	@NotBlank
	private String department;
	@NotBlank
	private String location;
	@NotBlank
	private LocalDate joindate;
	@NotBlank
	private double salary;
}
