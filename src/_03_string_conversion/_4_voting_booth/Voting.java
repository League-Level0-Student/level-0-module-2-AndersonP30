package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("Enter your age");
	int ageint = Integer.parseInt(age);
	if ( ageint >= 18) {
	JOptionPane.showInputDialog("Who will you vote for?");
	}
	else if (ageint <= 17) {
		JOptionPane.showMessageDialog(null, "You aren't old enough");
	}
}
}