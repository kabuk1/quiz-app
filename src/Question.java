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
		String answer = ask();
		
		if (answer.equals(correctAnswer)) {
			nCorrect ++; // increment correct answers
			JOptionPane.showMessageDialog(null,"Correct!");
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
			
	}
	// class method "showResults"
	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + ".");
	}

}
