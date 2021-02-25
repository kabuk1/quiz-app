import javax.swing.JOptionPane;

public class Quiz {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	static String question;

	public static void main(String[] args) {
		// question 1
		String question = "Which mascot represents the Philadelphia 76ers?\n";
		question += "A. Phillie Phanatic\n";
		question += "B. Gritty\n";
		question += "C. Franklin\n";  // correct answer
		question += "D. Swoop\n";
		question += "E. Phang\n";
		
		check(question, "C");
		
		// question 2
		question = "Which professional sports team in Philadelphia were known as the Broad Street Bullies?\n";
		question += "A. Flyers\n"; // correct answer
		question += "B. Eagles\n";
		question += "C. 76ers\n";
		question += "D. Union\n";
		question += "E. Phillies\n";
		
		check(question, "A");
		
		// question 3
		question = "In the film Invincible, which Philadelphia team did Vince Papale play for?\n";
		question += "A. Phillies\n";
		question += "B. Flyers\n";
		question += "C. Union\n"; 
		question += "D. Eagles\n"; //correct answer
		question += "E. 76ers\n";
		
		check(question, "D");

		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + ".");
		
	}
	
	// method asks question until a valid answer is received
	static String ask(String question) {
		
		while (true) {
			String answer = JOptionPane.showInputDialog(question).toUpperCase();
			
			// Check for valid input
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
			if (valid) return answer; 
			// Notify user of invalid answer
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D or E.");
		}
	}
	
	// method checks if the answer is correct
	static void check (String question, String correctAnswer) {
		nQuestions ++; // increment question
		String answer = ask(question);
		
		if(answer.equals(correctAnswer)) {
			nCorrect ++; // increment correct answers
			JOptionPane.showMessageDialog(null,"Correct!");	
		} else {
			JOptionPane.showMessageDialog(null,"The correct answer is " + correctAnswer + ".");	
		}
		
	}
	
}