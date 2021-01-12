package com.cg.eis.DAOimpl;

import javax.naming.InvalidNameException;

import com.cg.eis.DAO.EmployeeDAO;
import com.cg.eis.domain.Employee;
import com.cg.eis.exception.InvalidAgeException;
import com.cg.eis.exception.InvalidSalaryException;

public class EmployeeDAOimpl implements EmployeeDAO {
	
	

	@Override
	public void checkEmployee( String name,int age,int salary) throws InvalidNameException,InvalidAgeException,InvalidSalaryException
	{
		String[] val=name.split(" ");
		Employee obj=new Employee();
	if(name.contains("A-Za-z+"))
//		if((!val[0].contains("[A-Za-z]+"))&&(!val[1].contains("[A-Za-z]+")))
		{
			throw new InvalidNameException("Sorry! Your name is invalid.Enter Correct Format.Thank You.");
		}
		System.out.println("Your name is "+name);
		 if(age<15)
		{
			throw new InvalidAgeException("Sorry! Your age is invalid.Enter Correct Format.Thank You.");
		}
		 System.out.println("Your age is "+age);
		 if (salary<3000)
		{
			throw new InvalidSalaryException("Sorry!Your Salary is less than the limit.");
		}
		System.out.println("Your Salary is "+salary);
	}

}
