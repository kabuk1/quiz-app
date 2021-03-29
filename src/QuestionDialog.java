import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	String answer;
	
	@Override
	//method "actionPerformed"
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand(); //set the instance variable "answer"
		dispose();  //calls the inherited "dispose" method
		
	}

}