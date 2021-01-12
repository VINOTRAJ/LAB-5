package com.cg.eis.DAO;

import javax.naming.InvalidNameException;

import com.cg.eis.exception.InvalidAgeException;
import com.cg.eis.exception.InvalidSalaryException;

public interface EmployeeDAO {
	
	
	void checkEmployee(String name,int age,int salary) throws InvalidNameException,InvalidAgeException,InvalidSalaryException;


}
