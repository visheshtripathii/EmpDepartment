package com.emp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@Column(name="Employee ID")
	private int EmpId;
	
	@Column(name="First name")
	private String fname;
	
	@Column(name="Last name")
	private String lname;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Contact no.")
	private long contact;
	
	@Column(name="Email-Id")
	private String emailId;
	
	@Column(name="Marital Status")
	private String status;


	// GETTERS AND SETTERS
	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	// CONSTRUCTOR
	public Employee(int empId, String fname, String lname, String gender, int age, long contact, String emailId,
			String status) {
		super();
		EmpId = empId;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.emailId = emailId;
		this.status = status;
	}

	
	// DEFAULT CONSTRUCTOR
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// TO STRING METHOD
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age="
				+ age + ", contact=" + contact + ", emailId=" + emailId + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
