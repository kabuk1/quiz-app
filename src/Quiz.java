import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		//"MultipleChoiceQuestion" constructor with 5 quiz questions
				// question 1
				MultipleChoiceQuestion question1 = new MultipleChoiceQuestion (
						"Which mascot represents the Philadelphia 76ers?",
						"Phillie Phanatic",
						"Gritty",
						"Franklin", //correct answer c
						"Swoop",
						"Phang",
						"c");
				
				// question 2
				MultipleChoiceQuestion question2 = new MultipleChoiceQuestion (
						"Which professional sports team in Philadelphia were known as the Broad Street Bullies?",
						"Flyers", // correct answer a
						"Eagles",
						"76ers",
						"Union",
						"Phillies",
						"a");		
						
				// question 3
				MultipleChoiceQuestion question3 = new MultipleChoiceQuestion (
						"In the film Invincible, which Philadelphia team did Vince Papale play for?",
						"Phillies",
						"Flyers",
						"Union", 
						"Eagles", //correct answer d
						"76ers",
						"d");		
				
				// question 3
				MultipleChoiceQuestion question4 = new MultipleChoiceQuestion (
						"Which Philadelphia sports team won a championship in 1983?",
						"Phillies",
						"Flyers",
						"Union", 
						"Eagles", 
						"76ers",  //correct answer e
						"e");
						
				// question 3
				MultipleChoiceQuestion question5 = new MultipleChoiceQuestion (
						"World B. Free was the legal name of a player on which 1970s Philly sports team?",
						"Phillies",
						"76ers",  //correct answer b
						"Union", 
						"Eagles", 
						"Flyers",
						"b");
				
				// use a "MultipleChoiceQuestion" object to call the "check" method
				// Ask all questions and check answers
				question1.check();
				question2.check();
				question3.check();
				question4.check();
				question5.check();
				
				// uses the "MultipleChoiceQuestion" class to call the "showResults" class method
				// Show results after all questions are answered
				MultipleChoiceQuestion.showResults();
		
	}
}
	