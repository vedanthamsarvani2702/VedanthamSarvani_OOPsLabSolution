package com.OOPsLabSolution.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String companyName;
	public Employee(){
		this.companyName="abc";
		
	}
	public Employee(String firstName,String lastName) {
		this();
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	

}
