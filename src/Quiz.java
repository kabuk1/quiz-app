public class Quiz {

	public static void main(String[] args) {

		// question 1
		Question question = new MultipleChoiceQuestion (
				"Which mascot represents the Philadelphia 76ers?",
				"Phillie Phanatic",
				"Gritty",
				"Franklin", //correct answer c
				"Swoop",
				"Phang",
				"c");
		
		question.check();
					
		// question 2
		question = new MultipleChoiceQuestion (
				"Which professional sports team in Philadelphia were known as the Broad Street Bullies?",
				"Flyers", // correct answer a
				"Eagles",
				"76ers",
				"Union",
				"Phillies",
				"a");	
		
		question.check();
							
		// question 3
		question = new MultipleChoiceQuestion (
				"In the film Invincible, which Philadelphia team did Vince Papale play for?",
				"Phillies",
				"Flyers",
				"Union", 
				"Eagles", //correct answer d
				"76ers",
				"d");		
		
		question.check();
		
		// question 4
		question = new MultipleChoiceQuestion (
				"Which Philadelphia sports team won a championship in 1983?",
				"Phillies",
				"Flyers",
				"Union", 
				"Eagles", 
				"76ers",  //correct answer e
				"e");
				
		// question 5
		question = new MultipleChoiceQuestion (
				"World B. Free was the legal name of a player on which 1970s Philly sports team?",
				"Phillies",
				"76ers",  //correct answer b
				"Union", 
				"Eagles", 
				"Flyers",
				"b");
		
		question.check();
		
		// question 6
		question = new TrueFalseQuestion (
				"Despite the name, there are actually no eagles in Philadelphia.",
				"FALSE");
		
		question.check();
		
		// question 7
		question = new TrueFalseQuestion (
				"In 1943, the Eagles and the Steelers combined teams and competed as 'The Steagles' for one season.",
				"TRUE");
		
		question.check();
		
		// question 8
		question = new TrueFalseQuestion (
				"The Philadelphia Union were part of the original MLS (pre-expansion).",
				"FALSE");
		
		question.check();
		
		// question 9
		question = new TrueFalseQuestion (
				"The movie The Natural was based on a member of the Philadelphia Phillies.",
				"TRUE");
		
		question.check();
		
		// question 10
		question = new TrueFalseQuestion (
				"Philadelphia is home to teams in five major sports leagues (NBA, MLB, NHL, NFL and MLS)\n"
				+ "with all having their venues located within the city limits.",
				"FALSE");
		
		question.check();
		
		Question.showResults();

	}
}