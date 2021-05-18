import java.awt.*;
import javax.swing.*;
public class HangmanDrawing extends JPanel {
	private HangmanWording w;
	int width,height;
	public HangmanDrawing(int m, int n, HangmanWording word) {    
		width = m;
		height = n;
		w=word;
		JFrame frame = new JFrame();
		frame.getContentPane().add(this);
		frame.setSize(width, height);
		frame.setTitle("Hangman");
		frame.setVisible(true);
	}
	public void paintComponent(Graphics g) {{
		super.paintComponent(g);
		drawing(g);
		if (w.mistakes == 1)                       
			{	super.paintComponent(g);
				drawing(g);
				firstMistake(g);
			}	
		if (w.mistakes == 2) 
			{	super.paintComponent(g);
				drawing(g);
				firstMistake(g);
				secondMistake(g);
			}
		if (w.mistakes == 3) 
			{	super.paintComponent(g);
				drawing(g);
				firstMistake(g);
				secondMistake(g);
				thirdMistake(g);
			}
		if (w.mistakes == 4) 
			{	super.paintComponent(g);
				drawing(g);
				firstMistake(g);
				secondMistake(g);
				thirdMistake(g);
				fourthMistake(g);
			}
		if (w.mistakes == 5) 
			{	super.paintComponent(g);
				drawing(g);
				firstMistake(g);
				secondMistake(g);
				thirdMistake(g);
				fourthMistake(g);
				fifthMistake(g);
			}
		if (w.mistakes == 6)
			{	super.paintComponent(g);
				drawing(g);
				firstMistake(g);
				secondMistake(g);
				thirdMistake(g);
				fourthMistake(g);
				fifthMistake(g);
				sixthMistake(g);
			}
		if (w.sum == (w.wordLength * (w.wordLength-1))/2) 
			{g.drawString("Congratulations, you guessed the word correctly! ", 60, 300);}
		this.repaint();
		}
	}	
	
		public void drawing(Graphics g) {
			g.drawLine(50, 200, 50, 50);
			g.drawLine(50, 50, 120, 50);
			g.drawLine(120, 50, 120, 85);
			for (int i = 0 ; i < w.wordLength ; i++ ) 
			{g.drawLine(30 + i * 40, 250, 50 + i * 40, 250);}
			for (int i = 0 ; i < w.wordLength ; i++ ) {
				for (int j = 0; j < w.lettersChosenNum; j++) {	
				if (w.chosenLetters.charAt(j) == w.word.charAt(i)) 
					{g.drawString("" + w.word.charAt(i), 36 + i * 40, 245);
					}
				}
			}
		}
	
		private void firstMistake(Graphics pen) 
			{pen.drawOval(110, 85, 20, 20);}
		
		private void secondMistake(Graphics pen) 
			{pen.drawLine(120, 105, 120, 160);}
		
		private void thirdMistake(Graphics pen) 
			{pen.drawLine(120, 115, 100, 120);}  
			
		private void fourthMistake(Graphics pen) 
			{pen.drawLine(120, 115, 140, 120);}  	
		
		private void fifthMistake(Graphics pen) 
			{pen.drawLine(120, 160, 100, 180);}  
		
		private void sixthMistake(Graphics pen) {
			pen.drawLine(120, 160, 140, 180);  
			pen.drawString("You lost, the word was " + w.word, 60, 300);
		}
}

