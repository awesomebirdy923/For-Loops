import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;
	int minusTortoiseSpeed = -5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.setAngle(-180);
		Tortoise.move(minusTortoiseSpeed);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.setAngle(180);
		Tortoise.move(tortoiseSpeed);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(-90);
		Tortoise.move(tortoiseSpeed);
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(tortoiseSpeed);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		Point point = new Point(tortoiseLocationX, tortoiseLocationY);

		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
		System.out.println(tortoiseLocationX + " " + tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,

		// make the variables for tortoiseLocationX and tortoiseLocationY

		if (point.distance(505, 305) <= 50) {
			JOptionPane.showMessageDialog(null, "Please go to the blue pirate thing");
		}

		if (point.distance(410, 295) <= 60) {
			JOptionPane.showMessageDialog(null, "go to the skull's right eye and you will see what will happen next" + "\n" + "\n" + "HA HA HAAAAA");
		}

		if (point.distance(140, 45) <= 40) {
			JOptionPane.showMessageDialog(null, "You go into the skull's eye and fall down and die, the end");
			System.exit(0);
		}

		// 6. If tortoie a pop-up tell the Tortoise where to go next

		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)

	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point
		 * to it like: new ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}
