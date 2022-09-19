package com.greatlearning.labAssignment.model;
//create employee class;
public class Employee {
	private String firstName;//first name of employee
	private String lastName;//last name of employee
	//constructor :Use parameterized constructor of class Employee, to pass firstName, lastName;
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//getter and setter method
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
}
