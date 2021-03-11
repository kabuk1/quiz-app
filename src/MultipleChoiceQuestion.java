import javax.swing.JOptionPane;

// defines the class "MultipleChoiceQuestion" as a subclass of "Question"
public class MultipleChoiceQuestion extends Question {
	
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
	
}
