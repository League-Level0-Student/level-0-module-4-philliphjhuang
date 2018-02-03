import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		double score;
		String s = JOptionPane.showInputDialog("What score did you get for your previous math exam?");
		score = Double.parseDouble(s);
		if (score < 60) {
			JOptionPane.showMessageDialog(null, "You probably did not study at all.");
		} else if (score >= 60 && score < 70) {
			JOptionPane.showMessageDialog(null, "You probably studied, but that is not enough.");
		} else if (score >= 70 && score < 80) {
			JOptionPane.showMessageDialog(null, "You should study MORE.");
		} else if (score >= 80 && score < 90) {
			JOptionPane.showMessageDialog(null, "Keep trying, you are almost there!");
		} else {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}
	}
}
