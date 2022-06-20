package com.MainClass;

import com.emailApp.learning.Employee;
import java.util.Scanner;
import com.service.*;


public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Service s = new Service();
		
	Employee emp = new Employee ("Harshit" , "Mehra");
	
	System.out.println("Hello " + emp.getfirstName() + " " + emp.getLastName());
	
	
	
	
	
int department;
	
	do {
		
		System.out.println("");
		System.out.println("Please enter the department from the following");
		System.out.println("");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("5. None");
	
		department = sc.nextInt();
		
		String generateEmail;
		
		
		switch(department) {
		
		case 1:
		
			generateEmail = s.generateEmail(emp.getfirstName().toLowerCase(), emp.getLastName() .toLowerCase()) + "@tech.abc.com";
			
			
			System.out.println("Dear Harshit your email id is:"+ generateEmail);
			System.out.println("");
			s.generatePassword();
			
		
			break;
			
		case 2:
			
			generateEmail = s.generateEmail(emp.getfirstName().toLowerCase(), emp.getLastName() .toLowerCase()) + "@adm.abc.com";
			
			System.out.println("Dear Harshit your email id is:" + generateEmail);
			System.out.println("");
			s.generatePassword();
			
			
			
			break;
			
		case 3:
			
			generateEmail = s.generateEmail(emp.getfirstName().toLowerCase(), emp.getLastName() .toLowerCase()) + "@HR.abc.com";
			
			System.out.println("Dear Harshit your email id is:" + generateEmail);
			System.out.println("");
			s.generatePassword();
			
			
			break;
			
		case 4:
			
			generateEmail = s.generateEmail(emp.getfirstName().toLowerCase(), emp.getLastName() .toLowerCase()) + "@leg.abc.com";
			
			System.out.println("Dear Harshit your email id is:" + generateEmail);
			System.out.println("");
			s.generatePassword();
			
			
			break;
			
		case 5:
			break;
			
			default:
				System.out.println("Enter valid option");
		
		
		}
			
				
	} while(department != 5);
	
	
	}
	
}
