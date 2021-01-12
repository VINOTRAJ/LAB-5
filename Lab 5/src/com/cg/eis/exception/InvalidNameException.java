package com.cg.eis.exception;

public class InvalidNameException extends Exception {
	

	public InvalidNameException()
	{
		
	}
	public InvalidNameException(String name)
	{
		super(name);
	}

}
