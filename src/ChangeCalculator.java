//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		double Ni;
		double Di;
		double Qu;
		// Ask the user how many nickels they have
		String n = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an integer using Integer.parseInt()
		Ni = Integer.parseInt(n);

		// Ask the user how many dimes they have, and convert their answer
		String d = JOptionPane.showInputDialog("How many dimes do you have?");
		Di = Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
		String q = JOptionPane.showInputDialog("How many quarters do you have?");
		Qu = Integer.parseInt(q);
		// Calculate how much money the user has and save it in a double variable
		Ni *= 0.05;
		Di *= 0.1;
		Qu *= 0.25;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + (Ni + Di + Qu) + ".");
	}
}
