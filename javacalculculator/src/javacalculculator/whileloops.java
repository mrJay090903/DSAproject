package javacalculculator;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class whileloops {

	public static void main(String [] args) {
	
		Scanner s = new Scanner(System.in);
	
		String[] Name= {"jayar","deo","mark"};
		
		System.out.print("search your name: ");

		String list = s.nextLine();
		
	 int i = 0;
		
		while (i < Name.length) {
			
			if (Name[i].equalsIgnoreCase(list))
		{
				System.out.println("valid");
			i++;
						}else {
				System.out.println("invalid");
				
		break;
				}
		
			}
			
		}
		
		}
	

