package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	

	// 1) Make a main method that includes all the steps below…. 
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		String height = JOptionPane.showInputDialog("Enter your height in inches");
		int heightint = Integer.parseInt(height);
		
		//int height = Integer.parseInt(JOptionePane.showInputDialog(""));
		
		// Uncomment the line below...
		if( heightint >= 42 ) { 
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
		JOptionPane.showMessageDialog(null, "You may ride");
		
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
		}
		else if (heightint < 42) {
			JOptionPane.showMessageDialog(null, "You aren't tall enough");
		}
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
}
} 
