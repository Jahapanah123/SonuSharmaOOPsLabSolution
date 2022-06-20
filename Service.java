package com.service;
import java.util.Random;
import com.emailApp.learning.*;
import com.MainClass.*;


public class Service{
	String firstName;
	String lastName;
	String departement;
	
	public String generateEmail(String firstName , String lastName ){
		
	return firstName+lastName;
		
	}
	
	public void generatePassword() {
		
		String upper = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String lower = "qwertyuiopasdfghjklzxcvbnm";
		String num = "0123456789";
		String specialChars = "@!#$%^&*()<>";
		
		String result = upper+lower+num+specialChars;

	    int len = 8;
	    char[] password = new char[len];
	    
	    Random r = new Random();
	    
	    for (int i=0; i<len;i++) {
	    	
	    	password[i] = result.charAt(r.nextInt(result.length()));	
	    
	    }
	     
	    System.out.println("your new password is:"+new String(password));
		
		
	}
		
}

