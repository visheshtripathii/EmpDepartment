package com.emp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PayRoll {
	@Id
	@Column(name=("PayRoll ID"))
	private int PayRollId;
	
	@OneToOne
	@JoinColumn(name="Employee ID")
	private Employee EmpId;
	
	@OneToOne
	@JoinColumn(name="Job ID")
	private JobDepartment JobId;
	
	@OneToOne
	@JoinColumn(name="Salary ID")
	private Salary SalId;
	
	@OneToOne
	@JoinColumn(name="Qualification ID")
	private Qualification QualId;
	
	@Column(name="Total Amount")
	private String TotalAmount;

	
	//GETTER AND SETTER
	public int getPayRollId() {
		return PayRollId;
	}

	public void setPayRollId(int payRollId) {
		PayRollId = payRollId;
	}

	public Employee getEmpId() {
		return EmpId;
	}

	public void setEmpId(Employee empId) {
		EmpId = empId;
	}

	public JobDepartment getJobId() {
		return JobId;
	}

	public void setJobId(JobDepartment jobId) {
		JobId = jobId;
	}

	public Salary getSalId() {
		return SalId;
	}

	public void setSalId(Salary salId) {
		SalId = salId;
	}

	public Qualification getQualId() {
		return QualId;
	}

	public void setQualId(Qualification qualId) {
		QualId = qualId;
	}

	public String getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}

	
	// CONSTRUCTOR
	public PayRoll(int payRollId, Employee empId, JobDepartment jobId, Salary salId, Qualification qualId,
			String totalAmount) {
		super();
		PayRollId = payRollId;
		EmpId = empId;
		JobId = jobId;
		SalId = salId;
		QualId = qualId;
		TotalAmount = totalAmount;
	}

	
	// DEFAULT CONSTRUCTOR
	public PayRoll() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// TO STRING MEHTOD
	@Override
	public String toString() {
		return "PayRoll [PayRollId=" + PayRollId + ", EmpId=" + EmpId + ", JobId=" + JobId + ", SalId=" + SalId
				+ ", QualId=" + QualId + ", TotalAmount=" + TotalAmount + "]";
	}

	
	
	
	
	
}
