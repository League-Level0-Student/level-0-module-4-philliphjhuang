import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		int one = JOptionPane.YES_NO_OPTION;
		one = JOptionPane.showConfirmDialog(null, "Bob is in a forest and he is hungry. Shall he eat the mushroom next to him or not?","",one);
		if(one == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Bob died. Game Over");
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "Bob survived.");
			one = JOptionPane.showConfirmDialog(null, "Bob sees a lion in a bush. Shall he hunt the lion and eat it?","",one);
			if(one == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Bob became the food of the lion. Game Over");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "Bob survived.");
				one = JOptionPane.showConfirmDialog(null, "Bob sees a caterpillar. Shall he grab the caterpillar and eat it?","",one);
				if(one == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Bob died because he starved to death. Game Over");
					System.exit(0);
				} else { 
					JOptionPane.showMessageDialog(null, "Bob survived.");
					JOptionPane.showMessageDialog(null, "Congratulations! Bob survived through this forest!");
					System.exit(0);
				}
			}
		}
	}
}
