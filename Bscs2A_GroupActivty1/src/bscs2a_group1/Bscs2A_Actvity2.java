// This program uses JOptionPane
// it asks the user to input words and output the same words on the screen

package bscs2a_group1;


import javax.swing.JOptionPane; //import the 'JOptionPane' class from the 'javax.swing' package

public class Bscs2A_Actvity2 {

	public static void main(String[] args) {
		
	String first_word =JOptionPane.showInputDialog("First word: ");   // displays an input dialog box to the user and asks the user for the first word
		
		
	String 	second_word =JOptionPane.showInputDialog("Second word: ");   // displays an input dialog box to the user and asks the user for the second word
		
		
	String	third_word =JOptionPane.showInputDialog("Third word: ");   // displays an input dialog box to the user and asks the user for the third word
		
		
	String three_words ="The Three words is : " + first_word + "," + second_word + "," + third_word;   // concatenate the three words that the user gave
		
		JOptionPane.showMessageDialog(null, three_words);   //displays the three words inside the dialog box
		
 System .exit(0);		//indicates successful termination of the program
	}

}
