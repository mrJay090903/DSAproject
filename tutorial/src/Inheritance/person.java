package Inheritance;
import java.util.Scanner;
public class person {
	
	Scanner sc = new Scanner (System.in);
	String name;
	int age;
	

	 person(String name,int age) {
		this.name=name;
		this.age=age;
		 
		 
		 // TODO Auto-generated constructor stub
	}
	
	
void checkstatus() {

System.out.println("Enter your name: " + name );
System.out.println("Enter your age: " + age );


}
}