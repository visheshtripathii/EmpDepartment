package com.emp.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class JobDepartment {
	@Id
	@Column(name="Job ID")
	private int JobId;
	
	@OneToOne
	@JoinColumn(name="Employee ID")
	private Employee EmpId;
	
	@Column(name="Job Description")
	private String JobDescription;

	
	// GETTER AND SETTER
	public int getJobId() {
		return JobId;
	}

	public void setJobId(int jobId) {
		JobId = jobId;
	}

	public Employee getEmpId() {
		return EmpId;
	}

	public void setEmpId(Employee empId) {
		EmpId = empId;
	}

	public String getJobDescription() {
		return JobDescription;
	}

	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}

	
	//CONSTRUCTOR
	public JobDepartment(int jobId, Employee empId, String jobDescription) {
		super();
		JobId = jobId;
		EmpId = empId;
		JobDescription = jobDescription;
	}

	
	// DEFAULT CONSTRUCTOR 
	public JobDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// TO STRING METHOD
	@Override
	public String toString() {
		return "JobDepartment [JobId=" + JobId + ", EmpId=" + EmpId + ", JobDescription=" + JobDescription + "]";
	}
	
	

	

}
