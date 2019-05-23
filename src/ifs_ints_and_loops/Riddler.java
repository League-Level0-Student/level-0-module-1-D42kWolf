package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		int score = 0;

		String answer = JOptionPane.showInputDialog("What is greater than God,\n" + "more evil than the devil,\n"
				+ "the poor have it,\n" + "the rich need it,\n" + "and if you eat it, you'll die? ");

		if (answer.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong... The answer is nothing!");
		}
		answer = JOptionPane.showInputDialog("Feed me and I live, yet give me a drink and I die.");

		if (answer.equals("fire")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong... The answer is Fire!");

		}
		answer = JOptionPane.showInputDialog("magine you are in a dark room. How do you get out?");

		if (answer.equals("stop imagining")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong... Its stop imagining!!");
		}
		JOptionPane.showMessageDialog(null, "You scored " + score);
	}
}