package com.example.poc.crud.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRep extends JpaRepository<Employee,Long> {

}
