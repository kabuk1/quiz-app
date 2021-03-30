import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	TrueFalseQuestion(String question, String answer) { 
		super(question);  //constructor that calls its superclass constructor
		JPanel buttons = new JPanel();
		
		//calls "addButton" to add "TRUE" and "FALSE" buttons to a panel
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		
		//adds that panel to the instance variable "question"
		this.question.add(buttons);
		
		//calls "initQuestionDialog"
		initQuestionDialog();  
		
		//initializes the instance variable "correctAnswer"
		answer = answer.toUpperCase();  
		
		// correct answer is initialized to only "TRUE" or "FALSE"
		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) 
			correctAnswer = "TRUE";
		if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) 
			correctAnswer = "FALSE";
	}
	
		//method "addButton" 
		void addButton(JPanel buttons, String label) {
			JButton button = new JButton(label);
			button.addActionListener(question);  //adds the instance variable "question" as a listener
			buttons.add(button);  //adds the button to its "JPanel" parameter
		}

}
