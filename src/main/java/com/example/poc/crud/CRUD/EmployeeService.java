package com.example.poc.crud.CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRep empRes;
	
	//To show all the data
	public List<Employee> getDetails(){
		ArrayList<Employee> em=new ArrayList<Employee>();
		empRes.findAll().forEach(e->em.add(e));
		return em;
	}
	//To get record data from id
	public  Employee getDetailsById(int id){
		
		return empRes.findById((long) id).get();
		 
	}
	//To save all the data into table
	public void saveOrUpdate(Employee em) {
		empRes.save(em);
	}
	//to delete table
	public void deleteById(int id) {
		empRes.deleteById((long) id);
	}
}
