package checkpoint;



import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
public static void main(String[] args) {
	String color = 
JOptionPane.showInputDialog("Whats your faviorite color?");
JOptionPane.showMessageDialog(null, "Your favorite color is " + color);

Robot robot = new Robot();
robot.hide();
robot.penDown();
if (color.equals("red")) {
	
robot.setPenColor(Color.RED);
}
for (int i = 0; i < 3; i++) {
robot.move(100);
robot.turn(120);
}}}
