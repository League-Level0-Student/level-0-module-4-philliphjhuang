
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int vacation = JOptionPane.YES_NO_OPTION;
		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */

		dialogButton = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "SleepyHead", dialogButton);

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
		if (dialogButton == JOptionPane.YES_OPTION) {
			vacation = JOptionPane.showConfirmDialog(null, "Are you on a vacation?", "SleepyHead", vacation);
			if (vacation == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "sleep in");
			} else if (vacation == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "get up lazybones");
			}
		} else if (dialogButton == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}

	}
}
