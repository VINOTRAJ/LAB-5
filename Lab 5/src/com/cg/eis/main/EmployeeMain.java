package com.cg.eis.main;

import java.util.Scanner;

import javax.naming.InvalidNameException;

import com.cg.eis.DAOimpl.EmployeeDAOimpl;
import com.cg.eis.domain.Employee;
import com.cg.eis.exception.InvalidAgeException;
import com.cg.eis.exception.InvalidSalaryException;

public class EmployeeMain {
	public static void main(String[] args) throws InvalidNameException, InvalidAgeException, InvalidSalaryException {
		Scanner sc=new Scanner(System.in);
		Employee empl=new Employee();
		EmployeeDAOimpl employee=new EmployeeDAOimpl();
		System.out.println("Enter Your name:");
		String name=sc.nextLine();
		empl.setName(name);
		System.out.println("Enter Your age:");
		empl.setAge(sc.nextInt());
		System.out.println("Enter Your Salary:");
		empl.setSalary(sc.nextInt());
		

		try
		{
			
			employee.checkEmployee(empl.getName(),empl.getAge(),empl.getSalary())  ;
		}
		catch(InvalidNameException e)
		{
		System.out.println(e.getMessage());
     	}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}
		}


}
