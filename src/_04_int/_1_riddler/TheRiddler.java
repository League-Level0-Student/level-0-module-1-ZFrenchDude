package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	
String answer = JOptionPane.showInputDialog("What walks on 4 legs in the morning, two legs during the day, and three legs at night?");	
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equalsIgnoreCase("man")) {
		JOptionPane.showMessageDialog(null, "Correct!!");
		score++;
		}
		
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
		JOptionPane.showMessageDialog(null, "Incorrect.");
		
			}
		// 6. Add some more riddles
		String answer2 = JOptionPane.showInputDialog("What runs but never walks, has a bed but never sleeps, and has a mouth that never eats?");	
		
		if(answer2.equalsIgnoreCase("a river")) {
		JOptionPane.showMessageDialog(null, "Correct!!");
		score++;
		}
		
		else {
		JOptionPane.showMessageDialog(null, "Incorrect.");
		
		}
		
String answer3 = JOptionPane.showInputDialog("What is in seasons, seconds, centuries, and minutes but not in decades, years, or days?");	
		
		if(answer3.equalsIgnoreCase("n")) {
		JOptionPane.showMessageDialog(null, "Correct!!");
		score++;
		}
		
		
		else {
		JOptionPane.showMessageDialog(null, "Incorrect.");
	}
		
		// 2. Make a pop up to show the score.
				JOptionPane.showMessageDialog(null, "You got " + score + "!");
			}
		}

