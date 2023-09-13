package com.emp.dao;

import org.springframework.data.repository.CrudRepository;

import com.emp.entities.JobDepartment;

public interface JobDepartmentRepository extends CrudRepository<JobDepartment, Integer> {

}
