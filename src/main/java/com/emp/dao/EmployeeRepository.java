package com.emp.dao;

import org.springframework.data.repository.CrudRepository;

import com.emp.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
