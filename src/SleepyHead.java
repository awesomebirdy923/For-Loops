
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		int input = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);

		if (input == 0) {
			JOptionPane.showMessageDialog(null, "sleep in");
		} else if (input == 1) {
			int input2 = JOptionPane.showConfirmDialog(null, "are you on vacation?", "", JOptionPane.YES_NO_OPTION);
			if (input == 0) {
				JOptionPane.showMessageDialog(null, "sleep in");
			} else if (input == 1) {
				JOptionPane.showMessageDialog(null, "get up lazybones");
			}
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print “get up lazybones!” If it is a
		 * weekday, and we are on vacation, print “sleep in”.
		 */
	}
}
