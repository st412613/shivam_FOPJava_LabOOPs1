package com.greatlearning.labAssignment.application;

import java.util.Scanner;

import com.greatlearning.labAssignment.model.Employee;
import com.greatlearning.labAssignment.service.CredentialService;

//driver class 
public class Application {
	public static void main(String[] args) {
		CredentialService cs = new CredentialService();
		Employee emp = new Employee("shivam", "tiwari");
		String generatedEmail;
		String generatedPassword;
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		// switch for option
		switch (input) {

		case 1: {
			generatedEmail = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "tech");
			generatedPassword = (String) cs.generatePassword(8);
			cs.showCredentials(emp, generatedEmail, generatedPassword);// Display the generated credentials
			break;
		}
		case 2: {
			generatedEmail = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "admin");
			generatedPassword = (String) cs.generatePassword(8);
			cs.showCredentials(emp, generatedEmail, generatedPassword);// Display the generated credentials
			break;

		}
		case 3: {
			generatedEmail = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "hr");
			generatedPassword = cs.generatePassword(8);
			cs.showCredentials(emp, generatedEmail, generatedPassword);// Display the generated credentials
			break;

		}
		case 4: {
			generatedEmail = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "Legal");
			generatedPassword = cs.generatePassword(8);
			cs.showCredentials(emp, generatedEmail, generatedPassword);// Display the generated credentials
			break;

		}
		default: {
			System.out.println("Your Department is invalid please choose correct Department ");
		}
		}

	}
}
