import javax.swing.JOptionPane;

public abstract class Question {
	// class variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// instance variables
	String question;
	String correctAnswer;
	
	// abstract declaration
	abstract String ask();
	
	// instance method "check"
	void check () {
		nQuestions ++; //increment question
		// calls the "ask" method
		String answer = ask();
		
		if (answer.equals(correctAnswer)) {
			nCorrect ++; // increment correct answers
			// displays message for correct answers 
			JOptionPane.showMessageDialog(null,"Correct!");
		} else {
			// displays message for incorrect answers
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
			
	}
	// class method "showResults"
	static void showResults() {
		// displays the number of questions and the number of correct answers 
		// using the class member variables
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + ".");
	}

}
