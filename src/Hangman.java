import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;

import javax.swing.JFrame;


public class Hangman extends JFrame implements MouseListener, ActionListener
{
	//X  be a window 
	//X draw a gallows and lines for letters 
	//X draw letters and make them invisible 
	//X  create array of correct letters 
	//read user guesses
	//compare guess against array
	//if match, make visible the invisible letter
	//if not match, print letter in "wrong" section
	//if not match, draw part of hung man
	//set max # of allowable guesses
	//if max # reached, print "you lose"
	//if all letters guessed before max # reached, print "you win" 
	private static final int WIDTH = 300;
	private static final int HEIGHT = 400;
	private String guess; 
	private String wrongAnswers;
	private String[] WORD = {"b", "a", "r", "f"};
	
	public Hangman()
	{
		super("Hangman");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		addMouseListener(this);			
	}
	
	public void paint(Graphics g)
	{	
		//guess box 
		g.drawLine(20, 350, 280, 350); 
		g.drawLine(280, 350, 280, 390);
		g.drawLine(280, 390, 20, 390); 
		g.drawLine(20, 390,20, 350); 
		
		//gallows
		g.drawLine(120, 90, 120, 80); 
		g.drawLine(120, 80, 200, 80);
		g.drawLine(200, 80, 200, 180); 
		g.drawLine(80, 180, 220, 180);
		
		//blank spaces
		g.drawLine(70, 250, 95, 250); 
		g.drawLine(115, 250, 140, 250);
		g.drawLine(160, 250, 185, 250); 
		g.drawLine(205, 250, 230, 250);
		
		//hung man
		g.drawOval(110, 90, 20, 20);
		g.drawOval(113, 95, 5, 5);
		g.drawOval(121, 95, 5, 5);
		g.drawOval(116, 100, 7, 7);
		g.drawLine(120, 110, 120, 140); 
		g.drawLine(100, 120, 140, 120);
		g.drawLine(120, 140, 110, 170); 
		g.drawLine(120, 140, 130, 170);
		
		//correct answers
		g.drawString("B", 75, 250);
		g.drawString("A", 120, 250);
		g.drawString("R", 165, 250);
		g.drawString("F", 210, 250);
		
		//wrong answers
		wrongAnswers += guess + " ";
		g.drawString(wrongAnswers, 25, 370);
	}

	public void actionPerformed(ActionEvent arg0) {}

	public void mouseClicked(MouseEvent arg0) {}

	public void mouseEntered(MouseEvent arg0) {}

	public void mouseExited(MouseEvent arg0) {}

	public void mousePressed(MouseEvent arg0) {}

	public void mouseReleased(MouseEvent arg0) {}
	
	public static void main(String[] args){
		Hangman window = new Hangman();
		window.setVisible(true);
	}

	
}
