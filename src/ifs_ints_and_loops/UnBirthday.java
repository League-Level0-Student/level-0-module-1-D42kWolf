package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("When is your Birthday?");
		System.out.println(message); 
		if(message.equals("03/07")) {
			JOptionPane.showMessageDialog(null,"Happy Birthday");
		}
		
		else{JOptionPane.showMessageDialog(null,"Merry UnBirthday");
		}
		
		
		
	}}
