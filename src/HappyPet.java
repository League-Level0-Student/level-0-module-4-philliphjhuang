//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i <= 3; i++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			Object[] options = { "Pet", "Feed", "Eat your pet", "Play" };

			int option = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?",
					"Choose an option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
					options[0]);

			System.out.print(option);

			// 5. Use user input to call the appropriate method created in step 4.
			if (option == 0) {
				pet1();
			} else if (option == 1) {
				feed();
			} else if (option == 2) {
				eatyourpet();
			} else if (option == 3) {
				play();
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 30) {
				JOptionPane.showMessageDialog(null, "You really love your pet.");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void pet1() {
		JOptionPane.showMessageDialog(null, "Your pet is really happy and wants to stay with you.");
		happinessLevel = happinessLevel + 10;
	}

	static void feed() {
		JOptionPane.showMessageDialog(null, "Your pet is really happy and wants to stay with you.");
		happinessLevel = happinessLevel + 10;
	}

	static void eatyourpet() {
		JOptionPane.showMessageDialog(null, "Your pet is really sad.");
		happinessLevel = happinessLevel - 10;
	}

	static void play() {
		JOptionPane.showMessageDialog(null, "Your pet is really happy and wants to stay with you.");
		happinessLevel = happinessLevel + 10;
	}

}
