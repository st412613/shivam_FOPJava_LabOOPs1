package com.greatlearning.labAssignment.service;
import java.util.Random;

import com.greatlearning.labAssignment.model.Employee;
/*Create a separate CredentialService which will have generatePassword,
generateEmailAddress, & showCredentials method.*/

public class CredentialService {
  // password generate method

	public String generatePassword(int length) {
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacter = "~!@#$%^&*[]";
		String number = "1234567890";
		String bigString = capitalLetter + smallLetter + specialCharacter+number;
		Random random = new Random();
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			password[i] =bigString.charAt(random.nextInt(bigString.length()));

		}
		return new String(password);
	}
// email generate method using parameterized :firstName,lastName,Department
	public String generateEmail(String firstName, String lastName,String department) {
		
		return firstName+lastName+"@"+department+".gl.com";
	
	}
//method for show credential 
	public void  showCredentials(Employee emp,String email,String password) {
		System.out.println("Dear "+ emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email--> "+email);
		System.out.println("Password--> "+password);
	}



}
