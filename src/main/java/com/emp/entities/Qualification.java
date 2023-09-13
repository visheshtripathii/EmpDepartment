package com.emp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Qualification {
	@Id
	@Column(name="Qualification ID")
	private int QualId;
	
	@OneToOne
	@JoinColumn(name="Employee ID")
	private Employee EmpId;
	
	private String Qualification;
	
	@Column(name="Start Date")
	private String startDate;
	
	@Column(name="End Date")
	private String EndDate;

	
	//  GETTER AND SETTER
	public int getQualId() {
		return QualId;
	}

	public void setQualId(int qualId) {
		QualId = qualId;
	}

	public Employee getEmpId() {
		return EmpId;
	}

	public void setEmpId(Employee empId) {
		EmpId = empId;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	
	// CONSTRUCTOR
	public Qualification(int qualId, Employee empId, String qualification, String startDate, String endDate) {
		super();
		QualId = qualId;
		EmpId = empId;
		Qualification = qualification;
		this.startDate = startDate;
		EndDate = endDate;
	}

	
	// DEFAULT CONSTRUCTOR
	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// TO STRING MEHTOD
	@Override
	public String toString() {
		return "Qualification [QualId=" + QualId + ", EmpId=" + EmpId + ", Qualification=" + Qualification
				+ ", startDate=" + startDate + ", EndDate=" + EndDate + "]";
	}
	
	
	
	
	
}
