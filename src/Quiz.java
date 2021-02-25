import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// Create strings for question and choices
		String question = "Which mascot represents the Philadelphia 76ers?\n";
		question += "A. Phillie Phanatic\n";
		question += "B. Gritty\n";
		question += "C. Franklin\n";  // correct answer
		question += "D. Swoop\n";
		question += "E. Phang\n";
		
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			// Check for valid input
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				// If valid answer, check if answer is correct
				if (answer.equals("C")) {
					JOptionPane.showMessageDialog(null,"Correct!");
					break;
					
				} else {
					JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
					continue;
					
				}
			} else {
				// Notify user of invalid answer
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D or E.");
			}
		}
	}
}