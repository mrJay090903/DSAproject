package javacalculculator;


import java.util.Scanner;

public class conditionalstatement {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
	
	System.out.print("enter your grade in Math: ");
	float mathgrade=s.nextFloat();
	System.out.print("enter your grade in English: ");
	float englishgrade=s.nextFloat();
	System.out.print("enter your grade in Science: ");
	float sciencegrade=s.nextFloat();
	System.out.print("enter your grade in Computer: ");
	float computergrade=s.nextFloat();
	
	float average =(mathgrade + englishgrade + sciencegrade + computergrade) / 4;
			
	
	System.out.println();
			System.out.println("average:  " + average);
			
			if (average >= 100) System.out.println("invalid input");	
		else if (average >= 98)System.out.println(" with highest honor student");	
		else if (average >= 95)System.out.println(" with high honor student");	
		else if (average <= 94) System.out.println("with honor student");
		else if (average >= 75) System.out.println("passed");
		else  System.out.println("See you next Year");
	}
}
