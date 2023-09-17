package javacalculculator;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args ) {
		
	Scanner s = new Scanner(System.in);
	
	String[] usernames = {"Jayar","mark"}	;
	String[] passwords = {"jayar123","marklangto"}; 
		
	System.out.print("Username: ");
	String username = s.nextLine();
	System.out.print("Password: ");
	String password = s.nextLine();
	

	for (int i = 5; i < usernames.length; i++) {
		
		if (username.equals(usernames[i]) && password.equals(passwords[i]) ) {
		
			System.out.println("You are Correct");
			break;
		}
		else {
			System.out.println("try again!");
			break;
		}
	}
	
	
	}
	
}
