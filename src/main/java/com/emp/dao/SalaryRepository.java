package com.emp.dao;

import org.springframework.data.repository.CrudRepository;

import com.emp.entities.Salary;

public interface SalaryRepository extends CrudRepository<Salary, Integer> {

}
