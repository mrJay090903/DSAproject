package Inheritance;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
	
	person p= new person("jayar",12);
	toddler t = new toddler("cope",14,"Bicol University");
	
	
	p.checkstatus();
	t.checkstatus();
	
	}

}
