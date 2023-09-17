package username.login.main;

public class OperationHandler {
	public static void performOperation(int choice, int[] numbers) {
        switch (choice) {
            case 1:
                // Perform operation 1: Search Odd Numbers
                System.out.println("Performing operation 1: Search Odd Numbers");
                FindOddNum.findAndPrintOddNumbers(numbers); // Call the FindOddNum method
                break;
            case 2:
                // Perform operation 2: Search Even Numbers
                System.out.println("Performing operation 2: Search Even Numbers");
                // Add your code for this operation here
                break;
            // ... (other operations)
            case -1:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}