package com.example.poc.crud.CRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@Table(name="Employee")
public class Employee {
	@Id
	private int id;
	private String name;
	private String course;
	public Employee(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
