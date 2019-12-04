package src;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameOfLifeGame {
	public static void main(String[] args) {
		
		JFrame main_frame = new JFrame();
		main_frame.setTitle("Game of Life");
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel top_panel = new JPanel();
		top_panel.setLayout(new BorderLayout());
		main_frame.setContentPane(top_panel);

		GameOfLifeWidget ttt = new GameOfLifeWidget();
		top_panel.add(ttt, BorderLayout.CENTER);
		
		main_frame.pack();
		main_frame.setVisible(true);
	}
}
