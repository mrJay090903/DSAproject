package username.login.main;

public class FindOddNum {

	 public static void findAndPrintOddNumbers(int[]numbers) {
		        System.out.println("Odd numbers in the array:");
		        for (int num : numbers) {
		            if (num % 2 != 0) {
		                System.out.print(num + " ");
		            }
		        }
		    }
		}