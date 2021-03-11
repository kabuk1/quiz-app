import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	@Override
	String ask() {
		while (true) {
			// asks the question and converts to upper case
			String answer = JOptionPane.showInputDialog(question).toUpperCase();
			// checks for a valid answer
			boolean valid = (
					answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO") ||
					answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES"));
			// returns a valid TRUE or FALSE in upper case
			if (valid) return (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) ? "FALSE" : "TRUE";

			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
		}
	}
	
	TrueFalseQuestion(String question, String answer) { 
		this.question = "TRUE or FALSE: "+question; 
		this.correctAnswer = answer; 
		
		// correct answer is initialized to only "TRUE" or "FALSE"
		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) 
			correctAnswer = "TRUE";
		if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) 
			correctAnswer = "FALSE";
	}

}
