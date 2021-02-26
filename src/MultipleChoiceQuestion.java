import javax.swing.JOptionPane;

// defines the class "MultipleChoiceQuestion"
public class MultipleChoiceQuestion {
	// class variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// instance variables
	String question;
	String correctAnswer;
	
	// constructor with 7 String parameters
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query+"\n";	// initialize the instance variables
	    question += "A. "+a+"\n";
	    question += "B. "+b+"\n";
	    question += "C. "+c+"\n";
	    question += "D. "+d+"\n";
	    question += "E. "+e+"\n";
	    
	    correctAnswer = answer.toUpperCase(); // converts correct answer to upper case
	}
	
	// method "ask" 
	String ask() {

		while (true) {
			// asks the question and converts to upper case
			String answer = JOptionPane.showInputDialog(question).toUpperCase();
			// checks for a valid answer
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
			// returns a valid answer in upper case
			if (valid) return answer;
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
		}
	}
	
	// method "check"
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
