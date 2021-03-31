package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class _01_random_6_lottery_numbers {

	public static void main(String[] args) {
		
String lotto = "";
		
	int num = 0;
	
	Random ran = new Random();

	for (int i=0; i<6; i++) {
	num = ran.nextInt(99 + 0 + 1);
	lotto += num + " ";
		}
	JOptionPane.showMessageDialog(null, lotto);
	}

}
