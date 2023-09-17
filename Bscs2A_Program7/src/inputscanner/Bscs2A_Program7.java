

package inputscanner;
import java.util.*;

public class Bscs2A_Program7 {
	
	 public static void main(String[] args) throws Exception {
    
   Scanner user_input= new Scanner(System.in);
	
	String first_name,last_name;
	
	System.out.printf("Enter your first name: ");
	first_name= user_input.next();
	
	System.out.printf("Enter your last name: ");
	last_name= user_input.next();

	
 String full_name = first_name +  " " + last_name;
 
 System.out.println( "You are:"+ full_name);
   }
}