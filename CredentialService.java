package com.OOPsLabSolution.service;

import java.util.Random;

import com.OOPsLabSolution.model.Employee;

public class CredentialService {
	
	
	
	public String generateEmailAddress(Employee employee,String selection)
	
	{
		String emailAddress;
		emailAddress=employee.getFirstName().toLowerCase() + "" + employee.getLastName().toLowerCase() + "@" + selection + "." + employee.getCompanyName() + ".com";
		return emailAddress;
		
		
	}
	public char[] generatePassword()
	
	{
		char[] password=new char[8];
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
        String specialCharacters="!@#$%^&*-_+?/";
		
		String values=capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random=new Random();
		for(int i=0; i<8; i++) {
		password[i]=values.charAt(random.nextInt(values.length()));
		
			
		}
		
		return password;
		
	}
	public void showCredentials(Employee employee,String emailAddress,char[] password) {
		
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email      --------->    " + emailAddress);
		System.out.println("Password   --------->    " + new String(password));
		
	}

}
