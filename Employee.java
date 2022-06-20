package com.emailApp.learning;



public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee (String firstName , String lastName){
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	

	
public void setFirstName(String firstName) {
		
	this.firstName = firstName;
	}
	
	public String getfirstName() {
		
		return firstName;
	}
	
public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public String getLastName() {
		
		return lastName;
	}

}
