package com.example.poc.crud.CRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empSer;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getMapping(){
		return empSer.getDetails();
	}
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return empSer.getDetailsById(id);
	}
	@PostMapping("/postMap")
	public int saveEmployee(@RequestBody Employee em)
	{
		empSer.saveOrUpdate(em);
		return em.getId();
	}
	@DeleteMapping("/deleteMapping/{id}")
	public void deleteEmp(@PathVariable("id") int id){
		 empSer.deleteById(id);
	}
	@PutMapping("/putMap")
	public Employee putEmployee(@RequestBody Employee emp) {
		empSer.saveOrUpdate(emp);
		return emp;
	}
	
	
}
