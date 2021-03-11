public class Quiz {

	public static void main(String[] args) {
<<<<<<< Updated upstream
		// Create strings for question and choices
		String question = "Which mascot represents the Philadelphia 76ers?\n";
		question += "A. Phillie Phanatic\n";
		question += "B. Gritty\n";
		question += "C. Franklin\n";  // correct answer
		question += "D. Swoop\n";
		question += "E. Phang\n";
		
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			// Check for valid input
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				// If valid answer, check if answer is correct
				if (answer.equals("C")) {
					JOptionPane.showMessageDialog(null,"Correct!");
					break;
					
				} else {
					JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
					continue;
					
				}
			} else {
				// Notify user of invalid answer
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D or E.");
			}
		}
=======
		//"Question" constructor for "MultipleChoiceQuestion
		// question 1
		Question questionOne = new MultipleChoiceQuestion (
				"Which mascot represents the Philadelphia 76ers?",
				"Phillie Phanatic",
				"Gritty",
				"Franklin", //correct answer c
				"Swoop",
				"Phang",
				"c");
					
		// question 2
		Question questionTwo = new MultipleChoiceQuestion (
				"Which professional sports team in Philadelphia were known as the Broad Street Bullies?",
				"Flyers", // correct answer a
				"Eagles",
				"76ers",
				"Union",
				"Phillies",
				"a");		
							
		// question 3
		Question questionThree = new MultipleChoiceQuestion (
				"In the film Invincible, which Philadelphia team did Vince Papale play for?",
				"Phillies",
				"Flyers",
				"Union", 
				"Eagles", //correct answer d
				"76ers",
				"d");		
		
		// question 4
		Question questionFour = new MultipleChoiceQuestion (
				"Which Philadelphia sports team won a championship in 1983?",
				"Phillies",
				"Flyers",
				"Union", 
				"Eagles", 
				"76ers",  //correct answer e
				"e");
				
		// question 5
		Question questionFive = new MultipleChoiceQuestion (
				"World B. Free was the legal name of a player on which 1970s Philly sports team?",
				"Phillies",
				"76ers",  //correct answer b
				"Union", 
				"Eagles", 
				"Flyers",
				"b");
		
		// question 6
		Question questionSix = new TrueFalseQuestion (
				"Despite the name, there are actually no eagles in Philadelphia.",
				"FALSE");
		
		// question 7
		Question questionSeven = new TrueFalseQuestion (
				"In 1943, the Eagles and the Steelers combined teams and competed as 'The Steagles' for one season.",
				"TRUE");
		
		// question 8
		Question questionEight = new TrueFalseQuestion (
				"The Philadelphia Union were part of the original MLS (pre-expansion).",
				"FALSE");
		
		// question 9
		Question questionNine = new TrueFalseQuestion (
				"The movie The Natural was based on a member of the Philadelphia Phillies.",
				"TRUE");
		
		// question 10
		Question questionTen = new TrueFalseQuestion (
				"Philadelphia is home to teams in five major sports leagues (NBA, MLB, NHL, NFL and MLS)\n"
				+ "with all having their venues located within the city limits.",
				"FALSE");
		
		
		// use a "Question" object to call the "check" method
		// Ask all questions and check answers
		questionOne.check();
		questionTwo.check();
		questionThree.check();
		questionFour.check();
		questionFive.check();
		questionSix.check();
		questionSeven.check();
		questionEight.check();
		questionNine.check();
		questionTen.check();
		
		// uses the "MultipleChoiceQuestion" class to call the "showResults" class method
		// Show results after all questions are answered
		Question.showResults();

>>>>>>> Stashed changes
	}
}