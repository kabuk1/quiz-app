import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		super(query); //constructor that calls its superclass constructor with its first parameter
	    
		//calls "addChoice" using its next five parameters
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);
		
		//calls "initQuestionDialog"
		initQuestionDialog(); 
	    
		//initializes the instance variable "correctAnswer"
	    correctAnswer = answer.toUpperCase(); 
	}
	
	//method "addChoice" 
	void addChoice(String name, String label) {
		//creates a panel with a border layout
		JPanel choice = new JPanel(new BorderLayout());  
			
		//creates a button using its first String parameter
		JButton button = new JButton(name);  
			
		//adds the instance variable "question" as a listener for that button
		button.addActionListener(question); 
			
		//adds the button to the left side of the panel
		choice.add(button,BorderLayout.WEST); 
			
		//adds a label to the center of the panel using its second String parameter
		choice.add(new JLabel(label+" ",JLabel.LEFT),BorderLayout.CENTER);  
			
		//adds the panel to the instance variable "question"
		question.add(choice);
	}
	
}
