package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="emp")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee extends BaseEntity{

	@Column(length = 30)
	private String name;
	@Column(length = 30)
	@Enumerated(EnumType.STRING)
	private Department department;
	@Column(length = 30)
	private String location;
	@Column(name="join_date")
	private LocalDate joindate;
	private double salary;
	
	
}
