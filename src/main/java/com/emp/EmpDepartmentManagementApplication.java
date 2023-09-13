package com.emp;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.aspectj.asm.internal.ProgramElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.emp.dao.EmployeeRepository;
import com.emp.dao.JobDepartmentRepository;
import com.emp.entities.Employee;
import com.emp.entities.JobDepartment;
import com.emp.entities.PayRoll;
import com.emp.entities.Qualification;
import com.emp.entities.Salary;


@SpringBootApplication
public class EmpDepartmentManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(EmpDepartmentManagementApplication.class, args);
		EmployeeRepository employeeRepository= context.getBean(EmployeeRepository.class);
//		JobDepartmentRepository jobDepartmentRepository=context.getBean(JobDepartmentRepository.class);
		
		//**************************** CRUD OPERATIONS *****************************
		
		//******************************** CREATE **********************************
		
		/* 1) For creating object we have to make object of entity class and then we have to store the data
		      in that object using setter method which is defined in entity class.
		   2) After saving the data in object now you have to save this object in EmployeeRepository using
		      save() or saveAll() method.
		*/
//		// saving single object in EmployeeRepository
//		Employee emp_1=employeeRepository.save(emp1);
//		System.out.println(emp_1);
//		
//		// saving multiple object in EmployeeRepository
//		
//	    List<Employee> employees= List.of(emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,
//	    		                          emp10,emp11,emp12,emp13,emp14,emp15,emp16);
//	    Iterable<Employee> allEmps = employeeRepository.saveAll(employees);
//	    
//	    allEmps.forEach(employee ->{
//	    	System.out.println(employee);
//	    });
//		
//	    System.out.println("All employees are added successfully :)");
		
		//******************************** READ ****************************************
		// Now we want to read the details of employee of id 16.
		/*
		 1) We will use employeeRepository to find the user by its id by calling the method findbyId().
		 2) Then we will use the get method present in optional class.
		 */
		
//		Optional<Employee> optional = employeeRepository.findById(16);
//		Employee employee = optional.get();
//		System.out.println(employee);
		
		// now we want to read the details of all the employees
		/*
		 1) We will use employeeRepository to find all the employees by calling the method findAll().
		 2) Store it in Iterable<Employee> class by making its object.
		 3) use lamda functions by using for each loop
		*/
		
//		Iterable<Employee> allEmps = employeeRepository.findAll();
//		
//		allEmps.forEach(employee ->{
//	    	System.out.println(employee);
//		});
		//******************************** UPDATE **********************************
		
		/*
		 Now we want to read the details of employee of id 16.
		 1) First, We will use employeeRepository to find the user by its id.
		 2) Then we will use the get method present in optional class.
		 3) Now we will update the employee by using setter methods present in Employee class.
		 */
		
//		Optional<Employee> optional = employeeRepository.findById(16);
//		Employee employee = optional.get();
//		System.out.println("Employee to be changed : "+employee);
//		
//		
//		employee.setFname("Cristiano");
//		employee.setLname("Ronaldo");
//		employee.setGender("Male");
//		employee.setAge(39);
//		employee.setContact(987654321);
//		employee.setEmailId("cristiano.ronaldo@paytm.com");
//		employee.setStatus("Unmarried");
//		
//		Employee employee_updated = employeeRepository.save(employee);
//		System.out.println("Changed employee : "+employee_updated);
		
		//******************************** DELETE **********************************
		
		// Delete the employee by its id.
		/*
		 1) We will use employeeRepository to to call the delete method
		 */
		
//		employeeRepository.deleteById(16);
//		System.out.println("This employee is now deleted from the database. ");
//		System.out.println("Thank you :)");

		
//********************** Taking user input to feed data in Data Base using Scanner class **********************************************8		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to the Employee Department Management Module :)");
		System.out.println("Enter 1 to CREATE a new employee");
		System.out.println("Enter 2 to READ the information of an employee");
		System.out.println("Enter 3 to UPDATE an already existing Employee");
		System.out.println("Enter 4 to DELETE an Employee");
		System.out.print("Enter number :");
		
		int num=sc.nextInt();
		
		switch(num) {
		case 1: 
			Employee emp=new Employee();
			
			System.out.print("Enter ID : ");
			int empid=sc.nextInt();
			emp.setEmpId(empid);
			
			System.out.print("Enter First Name : ");
			String fname=sc.next();
			emp.setFname(fname);
			
			System.out.print("Enter Last Name : ");
			String lname=sc.next();
			emp.setLname(lname);
			
			System.out.print("Enter Gender : ");
			String gender=sc.next();
			emp.setGender(gender);
			
			System.out.print("Enter Age : ");
			int age=sc.nextInt();
			emp.setAge(age);
			
			System.out.print("Enter Contact Number : ");
			int phone=(int) sc.nextLong();
			emp.setContact(phone);
			
			System.out.println("Enter E-mail ID : ");
			String email=sc.next();
			emp.setEmailId(email);
			
			System.out.println("Enter Marital Status : ");
			String status=sc.next();
			emp.setStatus(status);
			
			// Saving the user data in EmployeeRepository.
			Employee emp_=employeeRepository.save(emp);
			System.out.println("Your data has been sucessfully saved :) ");
			System.out.println(emp_);
			
			break;
		
		case 2 : 
			
			System.out.print("Enter the Employee ID of the Employee which you want to read : ");
			
			try {
				Integer read_empid=sc.nextInt();
				Optional<Employee> optional = employeeRepository.findById(read_empid);
				Employee employee = optional.get();
				System.out.println(employee);
				
				break;
				
			} catch (Exception e) {
				
				System.out.println("Entity not found, please re-check the Employee-ID which you have entered");
				System.out.println("Exception : "+e);
			}
			
			break;
			
		case 3 :
			
			System.out.println("Enter the Employee ID of the Employee which you want to update : ");
			
//			Integer read_emp_id=sc.nextInt();
//			Optional<Employee> optionall = employeeRepository.findById(read_emp_id);
//			Employee update_employee = optionall.get();
//			System.out.println(update_employee);
			
			int delete_this_empid=sc.nextInt();
			employeeRepository.deleteById(delete_this_empid);
			
			System.out.println("Now enter the details of new Employee : ");
			
			Employee update_emp=new Employee();
			
			System.out.print("Enter ID : ");
			int update_empid=sc.nextInt();
			update_emp.setEmpId(update_empid);
			
			System.out.print("Enter First Name : ");
			String update_fname=sc.next();
			update_emp.setFname(update_fname);
			
			System.out.print("Enter Last Name : ");
			String update_lname=sc.next();
			update_emp.setLname(update_lname);
			
			System.out.print("Enter Gender : ");
			String update_gender=sc.next();
			update_emp.setGender(update_gender);
			
			System.out.print("Enter Age : ");
			int update_age=sc.nextInt();
			update_emp.setAge(update_age);
			
			System.out.print("Enter Contact Number : ");
			int update_phone=sc.nextInt();
			update_emp.setContact(update_phone);
			
			System.out.println("Enter E-mail ID : ");
			String update_email=sc.next();
			update_emp.setEmailId(update_email);
			
			System.out.println("Enter Marital Status : ");
			String update_status=sc.next();
			update_emp.setStatus(update_status);
			
			Employee employee_updated = employeeRepository.save(update_emp);
			System.out.println("Changed employee : "+employee_updated);
			
			break;
			
		case 4 :
			
			System.out.println("Enter the Employee ID of the Employee which you want to delete : ");
			
			try {
				int delete_empid=sc.nextInt();
				employeeRepository.deleteById(delete_empid);
				System.out.println("This employee is now deleted from the database. ");
				System.out.println("Thank you :)");
				
				break;
				
			} catch (Exception x) {
				System.out.println("Entity not found, please re-check the Employee ID which you have entered. ");
				System.out.println("Exception : "+x);
			}
			
			
		default :
			
			System.out.println("Hey, I guess you entered the wrong number.. Try again! ");
			
		}
		
		System.out.println("Thank you for using this program, have a nice day. ");
		System.out.println("Employee Department Management Module is now closed. ");
		
		

	}

}
