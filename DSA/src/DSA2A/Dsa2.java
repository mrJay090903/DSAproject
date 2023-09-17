package DSA2A;
import java.util.Scanner;

import dsaAct2.Swap;


	
	
	 static void display(int arr[]) {
		

	        Swap swapper = new Swap();
	        int largest = swapper.big(arr);
	        int smallest = swapper.small(arr);
	        
	        System.out.print("Input Array: ");
	        for (int num : inputArr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        System.out.print("Output Array: ");
	        for (int num : outputArr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}
	
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		final int size = 10;
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
        }
        
        display (arr);
        
	}

}
