package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("What's your name?");
		System.out.println(message);
		String ayden = "Y0u funny boi";
		if (message.equals("ayden")) {
			JOptionPane.showMessageDialog(null, ayden);
		} else if (message.equals("jacob")) {
			String jacob = "Your special in your own way";

			JOptionPane.showMessageDialog(null, jacob);
		} else if (message.equals("carlos")) {
			String carlos = "Look honeybager behide you";

			JOptionPane.showMessageDialog(null, carlos);

		}

	}

}
