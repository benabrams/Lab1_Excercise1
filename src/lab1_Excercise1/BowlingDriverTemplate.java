//package BowlingTemplate;
package lab1_Excercise1;

import javax.swing.JOptionPane;

public class BowlingDriverTemplate {
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Please enter a name for a bowler: ");
		//BowlingTemplate g = new BowlingTemplate(n);
		Lab1_Excercise1_Abrams g = new Lab1_Excercise1_Abrams(n);
		int pins;
			do{
				pins = Integer.parseInt(JOptionPane.showInputDialog("Enter the pins knocked over for frame " + (g.getFrame()+1) + " :"));
				g.shot(pins);
				g.computeScoreFrame();
			}while( g.getFrame() < 10);
			//g.computeScoreFrame();
			JOptionPane.showMessageDialog(null, g);
		JOptionPane.showMessageDialog(null, "The bowler's score is: " + g.getScore());	
	}
}
