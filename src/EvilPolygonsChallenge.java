import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot Mitch = new Robot();
		//2. Set the speed to 100
Mitch.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, null, "Choose a color please", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Red", "Green"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		if (colorChoice==0) {
			Mitch.setPenColor(0,0,255);
		}
		if (colorChoice==1) {
			Mitch.setPenColor(255,0,0);
		}
		if (colorChoice==2) {
			Mitch.setPenColor(0,255,0);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String numOfPoly = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		int g = Integer.parseInt(numOfPoly);
		//5. Use the robot to draw the number of polygons the user requested.
		Mitch.penDown();
		Mitch.hide();
		Mitch.setX(10);
		Mitch.setY(10);
		Mitch.turn(90);
		for (int i = 0; i < g; i++) {

		Mitch.move(5);
		Mitch.turn(90);
		Mitch.move(5);
		Mitch.turn(90);
		Mitch.move(5);
		Mitch.turn(90);
		Mitch.move(5);
		Mitch.turn(90);
		Mitch.penUp();
		Mitch.move(10);
		Mitch.penDown();
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

