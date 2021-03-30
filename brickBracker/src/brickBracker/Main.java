package brickBracker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 700, 600); // Fereastra
		obj.setTitle("Breakout Ball"); // Numele Ferestrei
		obj.setResizable(false); // Nu se poate schimba dimensiunea ferestrei
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

	}

}
