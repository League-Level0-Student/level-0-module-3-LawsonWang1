
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(100);
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		for (int count = 1; count > 0; count++) {
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(252,3,3);
		} else if (color.equalsIgnoreCase("orange")) {
			rob.setPenColor(252,119,3);
		} else if (color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(252,227,3);
		} else if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(3,252,7);
		} else if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(3,73,253);
		} else if (color.equalsIgnoreCase("purple")) {
			rob.setPenColor(115,0,191);
		} else if (color.equalsIgnoreCase("pink")) {
			rob.setPenColor(247,119,255);
		} else rob.setRandomPenColor();
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Random random = new Random();
		int x = random.nextInt(501)+1;
		int y = random.nextInt(501)+1;
		
		for (int turn = 0; turn < 4; turn++) {
			rob.move(100);
			rob.turn(90);
			}
		rob.setX(x);
		rob.setY(y);
		}

		



	}
}
