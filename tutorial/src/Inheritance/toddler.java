package Inheritance;

public class toddler extends person {

	String school;
	toddler(String name, int age,String school){
		
		super(name, age);
		this.school=school;
	}
	
void checkstatus() {
	System.out.println("School: "+ school);
	super.checkstatus();
	
}	
	
}
