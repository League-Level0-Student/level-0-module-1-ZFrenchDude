package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badgersong {

	public static void main(String[] args) {
	for (int j = 0; j < 2; j++) {
		for (int i = 0; i < 12; i++) {
			System.out.print("Badger,");
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.print("Mushroom,");
		}
		System.out.println();
	}
	System.out.print("A snake!");
}
}
