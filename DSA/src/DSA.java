
import java.util.Scanner;



public class DSA {

	public static void main(String[] args) {
		
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int op;
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter 1 for odd numbers or 2 for even numbers: ");
        
        op = scanner.nextInt();
        
        Operation operation = new Operation();
        
        if (op == 1) {
            System.out.print("Odd numbers: ");
            
            for (int i = 0; i < arr.length; i++) {
            	
                operation.oddNum(arr[i]);
                
            }
        } else if (op == 2) {
        	
            System.out.print("Even numbers: ");
            
            for (int i = 0; i < arr.length; i++) {
            	
                operation.evenNum(arr[i]);
            }
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
        }

    
    }
}