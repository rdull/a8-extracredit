package src;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOfLifeWidget extends JPanel implements ActionListener, SpotListener {
	
	private JSpotBoard board;
	private int width;
	private int height;
	private int low_survive;
	private int high_survive;
	private int low_birth;
	private int high_birth;
	
public GameOfLifeWidget() {
	
		this.width = 10;
		this.height = 10;
		this.low_birth = 3;
		this.high_birth = 3;
		this.low_survive = 2;
		this.high_survive = 3;
		this.board = new JSpotBoard(width, height);
		setLayout(new BorderLayout());
		add(board, BorderLayout.CENTER);		
		JPanel reset_message_panel = new JPanel();
		reset_message_panel.setLayout(new BorderLayout());
		JButton reset_button = new JButton("Restart");
		reset_button.addActionListener(this);
		reset_message_panel.add(reset_button, BorderLayout.EAST);
		add(reset_message_panel, BorderLayout.SOUTH);
		board.addSpotListener(this);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board.getSpotAt(i, j).setBackground(Color.WHITE);
			}
		}
//		board.getSpotAt(5, 4).setBackground(Color.BLACK);
//		board.getSpotAt(5, 5).setBackground(Color.BLACK);
//		board.getSpotAt(5, 6).setBackground(Color.BLACK);
//		resetGame();
		
	}

	private void resetGame() {
		
//		for (Spot s : board) {
//			s.clearSpot();
//		}
//		for (int i = 0; i < width; i++) {
//			for (int j = 0; j < height; j++) {
//				board.getSpotAt(i, j).setBackground(Color.WHITE);
//			}
////		}
//		board.getSpotAt(5, 4).setBackground(Color.BLACK);
//		board.getSpotAt(5, 5).setBackground(Color.BLACK);
//		board.getSpotAt(5, 6).setBackground(Color.BLACK);
		run();
	}
	@Override
	public void spotClicked(Spot spot) {
		if (spot.getBackground() == Color.WHITE) {
			spot.setBackground(Color.BLACK);
		} else {
			spot.setBackground(Color.WHITE);
		}
		return;		
	}
	

	@Override
	public void spotEntered(Spot spot) {
		return;
	}

	public void spotExited(Spot spot) {
		spot.unhighlightSpot();
	}

	public void actionPerformed(ActionEvent e) {
		resetGame();		
	}
	
	public void run() {
		int[][] board_array = new int[width][height]; 
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (board.getSpotAt(i, j).getBackground() == Color.WHITE) {
					board_array[i][j] = 0;
				} else {
					board_array[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int counter = 0;
				if (i-1 > -1 && j-1 > -1 && board.getSpotAt(i-1, j-1).getBackground() == Color.BLACK) {
					counter++;
				}
				if (i-1 > -1 && board.getSpotAt(i-1, j).getBackground() == Color.BLACK) {
					counter++;
				} 
				if (i-1 > -1 && j+1 < height 
						&& board.getSpotAt(i-1, j+1).getBackground() == Color.BLACK) {
					counter++;
				}
				if (j-1 > -1 && board.getSpotAt(i, j-1).getBackground() == Color.BLACK) {
					counter++;
				}
				if (j+1 < height && board.getSpotAt(i, j+1).getBackground() == Color.BLACK) {
					counter++;
				}
				if (i+1 < width && j-1 > -1 && 
						board.getSpotAt(i+1, j-1).getBackground() == Color.BLACK) {
					counter++;
				}
				if (i+1 < width && board.getSpotAt(i+1, j).getBackground() == Color.BLACK) {
					counter++;
				}
				if (i+1 < width && j+1 < height &&
						board.getSpotAt(i+1, j+1).getBackground() == Color.BLACK) {
					counter++;
				}
				if (board.getSpotAt(i, j).getBackground() == Color.WHITE) {
					if (counter < low_birth) {
					} else if (counter > high_birth) {
					} else {
						board_array[i][j] = 1;
					}
				} else {
					if (counter < low_survive) {
						board_array[i][j] = 0;
					} else if (counter > high_survive) {
						board_array[i][j] = 0;
					} else {
						board_array[i][j] = 1;
					}
				}
			
			}
		}
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (board_array[i][j] == 0) {
					board.getSpotAt(i, j).setBackground(Color.WHITE);
				} else {
					board.getSpotAt(i, j).setBackground(Color.BLACK);
				}
			}
		}
		return;
	}
}
