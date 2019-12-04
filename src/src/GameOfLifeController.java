package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;

public class GameOfLifeController {
	GameOfLifeModel model;
	GameOfLifeView view;
	
	public GameOfLifeController(GameOfLifeModel model, GameOfLifeView view) {
		this.model = model;
		this.view = view;
	}
	
	public void spotClicked(int x, int y, int i) {
			model.setSpot(x,  y,  i);	
//		int x = spot.getSpotX();
//		int y = spot.getSpotY();
//		if (model.getBoard()[x][y] == 0) {
//			model.setSpot(x, y, 1);
//		} else {
//			model.setSpot(x, y, 0);
//		}	
//		view.show(model.getBoard());
	}
	
	public void updateView() {
		view.show(model.getBoard());
	}
	
	public void run(int[][] board, int width, int height, int low_survive, int high_survive, int low_birth, int high_birth) {
		int[][] temp_board = new int[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int counter = 0;
				if (i-1 > -1 && j-1 > -1 && board[i-1][j-1] == 1) {
					counter++;
				}
				if (i-1 > -1 && board[i-1][j] == 1) {
					counter++;
				} 
				if (i-1 > -1 && j+1 < height && board[i-1][j+1] == 1) {
					counter++;
				}
				if (j-1 > -1 && board[i][j-1] == 1) {
					counter++;
				}
				if (j+1 < height && board[i][j+1] == 1) {
					counter++;
				}
				if (i+1 < width && j-1 > -1 && board[i+1][j-1] == 1) {
					counter++;
				}
				if (i+1 < width && board[i+1][j] == 1) {
					counter++;
				}
				if (i+1 < width && j+1 < height && board[i+1][j+1] == 1) {
					counter++;
				}
				if (board[i][j] == 0) {
					if (counter < low_birth) {
						temp_board[i][j] = 0;
					} else if (counter > high_birth) {
						temp_board[i][j] = 0;
					} else {
						temp_board[i][j] = 1;
					}
				} else {
					if (counter < low_survive) {
						temp_board[i][j] = 0;
					} else if (counter > high_survive) {
						temp_board[i][j] = 0;
					} else {
						temp_board[i][j] = 1;
					}
				}
			}
		}
		model.setBoard(temp_board);
		view.show(model.getBoard());
	}

	public void action(GameOfLifeViewEvent e) {
		if (e.isRunEvent()) {
			run(model.getBoard(), model.getWidth(), model.getHeight(), 
					model.getLowSurvive(), model.getHighSurvive(),
					model.getLowBirth(), model.getHighBirth());
		} else if (e.isClearEvent()) {
			int[][] temp_board = new int[model.getWidth()][model.getHeight()];
			for (int i = 0; i < model.getWidth(); i++) {
				for (int j = 0; j < model.getHeight(); j++) {
					temp_board[i][j] = 0;
				}
			}
			model.setBoard(temp_board);
			view.show(temp_board);
		} else if (e.isRandomEvent()) {
			int[][] temp_board = new int[model.getWidth()][model.getHeight()];
			for (int i = 0; i < model.getWidth(); i++) {
				for (int j = 0; j < model.getHeight(); j++) {
					temp_board[i][j] = new Random().nextInt(2);
				}
			}
			model.setBoard(temp_board);
			view.show(temp_board);
//		} else if (e.isHeightSlideEvent() ) {
//			HeightSlideEvent slide = (HeightSlideEvent) e;
//			int x = slide.getValue();
//			model.setTempHeight(x);
//		} else if (e.isWidthSlideEvent() ) {
//			WidthSlideEvent slide = (WidthSlideEvent) e;
//			int x = slide.getValue();
//			model.setTempWidth(x);
//		} else if (e.isLowSurviveSlideEvent() ) {
//			LowSurviveSlideEvent slide = (LowSurviveSlideEvent) e;
//			int x = slide.getValue();
//			model.setTempLowSurvive(x);
//		} else if (e.isHighSurviveSlideEvent() ) {
//			HighSurviveSlideEvent slide = (HighSurviveSlideEvent) e;
//			int x = slide.getValue();
//			model.setTempHighSurvive(x);
//		} else if (e.isLowBirthSlideEvent() ) {
//			LowBirthSlideEvent slide = (LowBirthSlideEvent) e;
//			int x = slide.getValue();
//			model.setTempLowBirth(x);
//		} else if (e.isHighBirthSlideEvent() ) {
//			HighBirthSlideEvent slide = (HighBirthSlideEvent) e;
//			int x = slide.getValue();
//			model.setTempHighBirth(x);
//		} else if (e.isSubmitEvent()) {
//			int width;
//			int height;
//			int low_survive;
//			int high_survive;
//			int low_birth;
//			int high_birth;
//			if (model.getTempWidth() == 1000) {
//				width = 20;
//			} else {
//				width = model.getTempWidth();
//			}
//			if (model.getTempHeight() == 1000) {
//				height = 20;
//			} else {
//				height = model.getTempHeight();
//			}
//			if (model.getTempLowSurvive() == 1000) {
//				low_survive = 2;
//			} else {
//				low_survive = model.getTempLowSurvive();
//			}
//			if (model.getTempHighSurvive() == 1000) {
//				high_survive = 3;
//			} else {
//				high_survive = model.getTempHighSurvive();
//			}
//			if (model.getTempLowBirth() == 1000) {
//				low_birth = 3;
//			} else {
//				low_birth = model.getTempLowBirth();
//			}
//			if (model.getTempHighBirth() == 1000) {
//				high_birth = 3;
//			} else {
//				high_birth = model.getTempHighBirth();
//			}
//			this.view.createBoard(width, height);
//			this.model = new GameOfLifeModel(width, height, low_survive, high_survive, low_birth, high_birth);
//			this.view = new GameOfLifeView(width, height);
//			view.addController(this);
		}
	}
}
