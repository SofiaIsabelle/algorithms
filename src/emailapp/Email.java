package emailapp;

import java.util.*;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "cgi.com";
	
	//Constructor to recieve firstName and lastName
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Ask for department
		//Call a method asking for the department - return the department
		
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine Elements to Generate Email
		
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department + "." + companySuffix;
		System.out.println("Your email is:\n" + email);
		
	}
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code :");
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		}else if(depChoice == 2){
			return "development";
		}else if(depChoice == 3){
			return "accounting";
		}else {
			return "";
			
		}
	}

	
	//Generate a random Password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
		char[] password = new char[length];
		for(int i = 0; i < length; i++){
		int rand = 	(int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		
		}
		
		return new String(password);
	}
	
	//Set the mail box capacity
	public void setMailboxCapacity(int capacity){
		this.mailBoxCapacity = capacity;
	}
	
	//Set alternate email
	
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	//Change the Password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity(){ 
		return mailBoxCapacity; 
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo(){
		return "Display Name: " + firstName + " " + lastName + "\n" + "Company Email: " + email + "\n" + "Mailbox Capacity: " + mailBoxCapacity +"eb";
	}
}
