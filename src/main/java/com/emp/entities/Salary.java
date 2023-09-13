package com.emp.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Salary {
	@Id
	@Column(name="Salary ID")
	private int SalId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Employee ID")
	private Employee EmpId;
	
	private String Amount;
	

	// GETTER AND SETTER
	public int getSalId() {
		return SalId;
	}

	public void setSalId(int salId) {
		SalId = salId;
	}

	public Employee getEmpId() {
		return EmpId;
	}

	public void setEmpId(Employee empId) {
		EmpId = empId;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	
	// CONSTRUCTOR
	public Salary(int salId, Employee empId, String amount) {
		super();
		SalId = salId;
		EmpId = empId;
		Amount = amount;
	}

	
	// DEFAULT CONSTRUCTOR 
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// TO STRING MEHTOD
	@Override
	public String toString() {
		return "Salary [SalId=" + SalId + ", EmpId=" + EmpId + ", Amount=" + Amount + "]";
	}

	

}
