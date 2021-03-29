import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	QuestionDialog question;
	String correctAnswer;
	
	//constructor that initializes instance variable "question"
	public Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1)); //single-column grid layout,
		this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));  //adds a text label 
	}
	
	// method "initQuestionDialog" 
	void initQuestionDialog() {
		this.question.setModal(true);  //instance variable "question" modal
		this.question.pack();  //sets its size with "pack"
		this.question.setLocationRelativeTo(null);  //positions it in the center of the screen
	}

	// "ask" method
	String ask() {
		question.setVisible(true);  //instance variable "question" visible 
		return question.answer;  //returns the value "question.answer"
	}
	
	void check () {
		nQuestions ++;
		// calls the "ask" method
		String answer = ask();
		
		if (answer.equals(correctAnswer)) {
			nCorrect ++;
			JOptionPane.showMessageDialog(null,"Correct!");
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
			
	}
	
	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + ".");
	}

}
