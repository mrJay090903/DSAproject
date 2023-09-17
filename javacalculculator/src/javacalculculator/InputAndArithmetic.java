package javacalculculator;

import java.util.Scanner;

public class InputAndArithmetic {

	public static void main(String[] args) {
		
		float x;
		float y;
		float result;
		Scanner scan = new Scanner(System.in);
				
		System.out.print(" enter a Number:");
		x= scan.nextFloat();
		
		System.out.print(" enter a second Number:");
		y= scan.nextFloat();
		
		result = x * y;
		
		System.out.println("The sum is:"+ result );
		
		
		
	}
	
	
			
			
			
	
	
}
