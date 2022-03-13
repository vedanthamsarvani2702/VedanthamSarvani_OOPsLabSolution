package com.OOPsLabSolution.app;

import java.util.Scanner;

import com.OOPsLabSolution.model.Employee;
import com.OOPsLabSolution.service.CredentialService;

public class DriverApplication {
	public static void main(String args[])
	{
		
		System.out.println("Please enter the department from the folloing");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc= new Scanner(System.in);
		int selection=sc.nextInt();
		Employee employee;
		CredentialService credentialService;
		
		
		switch(selection) {
		case 1:
			employee=new Employee("Sarvani","Vedantham");
			credentialService = new CredentialService();
		    credentialService.showCredentials(employee,credentialService.generateEmailAddress(employee, "tech"),credentialService.generatePassword());
			
		    break;
		case 2:
			
			employee=new Employee("Sarvani","Vedantham");
			credentialService = new CredentialService();
			credentialService.showCredentials(employee,credentialService.generateEmailAddress(employee, "admin"),credentialService.generatePassword());
			
			break;
			
		case 3:
			employee=new Employee("Sarvani","Vedantham");
			credentialService = new CredentialService();
			credentialService.showCredentials(employee,credentialService.generateEmailAddress(employee, "hr"),credentialService.generatePassword());
			
			break;
		case 4:
			employee=new Employee("Sarvani","Vedantham");
			credentialService = new CredentialService();
			credentialService.showCredentials(employee,credentialService.generateEmailAddress(employee, "legal"),credentialService.generatePassword());
			
			break;
			
			
			
			
			
			default:
				System.out.println("Not a valid Input");
				
		}
		
		
		}

}
