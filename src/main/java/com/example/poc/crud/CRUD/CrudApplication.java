package com.example.poc.crud.CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRep empRep;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> ls=empRep.findAll();
		ls.forEach(System.out::println);
		
	}

}
