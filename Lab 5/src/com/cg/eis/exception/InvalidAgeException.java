package com.cg.eis.exception;

public class InvalidAgeException extends Exception {
	public InvalidAgeException()
	{
		
	}
	public InvalidAgeException(String age)
	{
		super(age);
	}

}
