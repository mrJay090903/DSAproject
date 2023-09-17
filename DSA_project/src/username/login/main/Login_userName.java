package username.login.main;
import java.util.Scanner;
import java.io.IOException;

public class Login_userName {

	public static void main(String[] args) {
		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        String enteredUsername = "";
        String enteredPassword = "";

        do {
            if (loggedIn) {
                clearScreen(); // Clear the screen if logged in
                System.out.println("Welcome, " + enteredUsername + "!");
            }

            // Prompt the user for username and password
            System.out.print("Enter username: ");
            enteredUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();

            // Check if the entered username and password are valid
            loggedIn = UserCred.login(enteredUsername, enteredPassword);

            if (!loggedIn) {
                clearScreen(); // Clear the screen if login is incorrect
                System.out.println("Login failed. Invalid username or password.");
            }
        } while (!loggedIn);

        // Display the menu options
        System.out.println("<1> Search Odd Numbers");
        System.out.println("<2> Search Even Numbers");
        System.out.println("<3> Swap Odd numbers and Even numbers");
        System.out.println("<4> Search Largest numbers");
        System.out.println("<5> Search Smallest numbers");
        System.out.println("<6> Swap Largest numbers and Smallest numbers");
        System.out.println("<7> Delete nth element");
        System.out.println("<8> Insertion of elements");
        System.out.println("<9> Delete elements divisible by 3");
        System.out.println("<10> Delete elements divisible by user input");
        System.out.println("Enter < -1 > to Quit");

        int choice;
        do {
            System.out.print("Select Operation: ");
            choice = scanner.nextInt();
            OperationHandler.performOperation(choice, null); // Pass null for now
        } while (choice != -1);

        // Close the scanner
        scanner.close();
    }

    // Function to clear the screen (Windows specific)
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}