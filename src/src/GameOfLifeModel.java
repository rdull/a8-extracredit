package src;

public class GameOfLifeModel {
	private int width;
	private int height;
	private int low_survive;
	private int high_survive;
	private int low_birth;
	private int high_birth;
	private int temp_width;
	private int temp_height;
	private int temp_low_survive;
	private int temp_high_survive;
	private int temp_low_birth;
	private int temp_high_birth;
	private int[][] board;
	
	public GameOfLifeModel() {
		this.width = 20;
		this.height = 20;
		this.low_survive = 2;
		this.high_survive = 3;
		this.low_birth = 3;
		this.high_birth = 3;
		this.board = new int[20][20];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board[i][j] = 0;
			}
		}
		this.temp_width = 1000;
		this.temp_height = 1000;
		this.temp_low_survive = 1000;
		this.temp_high_survive = 1000;
		this.temp_low_birth = 1000;
		this.temp_high_birth = 1000;
	}
	
	public GameOfLifeModel(int width, int height) {
		this.width = width;
		this.height = height;
		this.low_survive = 3;
		this.high_survive = 3;
		this.low_birth = 2;
		this.high_birth = 3;
		this.board = new int[10][10];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board[i][j] = 0;
			}
		}
		this.temp_width = 1000;
		this.temp_height = 1000;
		this.temp_low_survive = 1000;
		this.temp_high_survive = 1000;
		this.temp_low_birth = 1000;
		this.temp_high_birth = 1000;
	}
	
	public GameOfLifeModel(int low_survive, int high_survive, 
			int low_birth, int high_birth) {
		this.width = 100;
		this.height = 100;
		this.low_survive = low_survive;
		this.high_survive = high_survive;
		this.low_birth = low_birth;
		this.high_birth = high_birth;
		this.board = new int[10][10];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board[i][j] = 0;
			}
		}
		this.temp_width = 1000;
		this.temp_height = 1000;
		this.temp_low_survive = 1000;
		this.temp_high_survive = 1000;
		this.temp_low_birth = 1000;
		this.temp_high_birth = 1000;
	}
	
	public GameOfLifeModel(int width, int height, int low_survive, 
			int high_survive, int low_birth, int high_birth) {
		this.width = width;
		this.height = height;
		this.low_survive = low_survive;
		this.high_survive = high_survive;
		this.low_birth = low_birth;
		this.high_birth = high_birth;
		this.board = new int[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board[i][j] = 0;
			}
		}
		this.temp_width = 1000;
		this.temp_height = 1000;
		this.temp_low_survive = 1000;
		this.temp_high_survive = 1000;
		this.temp_low_birth = 1000;
		this.temp_high_birth = 1000;
	}
	
	public int[][] getBoard() {
		return this.board;
	}
	
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	public void setSpot(int x, int y, int i) {
		board[x][y] = i;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int x) {
		this.width = x;
		this.board = new int[width][height];
		for(int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board[i][j] = 0;
			}
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int x) {
		this.height = x;
		this.board = new int[width][height];
		for(int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board[i][j] = 0;
			}
		}
	}
	
	public int getLowSurvive() {
		return low_survive;
	}
	
	public void setLowSurvive(int x) {
		this.low_survive = x;
	}
	
	public int getHighSurvive() {
		return high_survive;
	}
	
	public void setHighSurvive(int x) {
		this.high_survive = x;
	}
	
	public int getLowBirth() {
		return low_birth;
	}
	
	public void setLowBirth(int x) {
		this.low_birth = x;
	}
	
	public int getHighBirth() {
		return high_birth;
	}
	
	public void setHighBirth(int x) {
		this.high_birth = x;
	}

	public int getTempWidth() {
		return temp_width;
	}

	public void setTempWidth(int temp_width) {
		this.temp_width = temp_width;
	}

	public int getTempHeight() {
		return temp_height;
	}

	public void setTempHeight(int temp_height) {
		this.temp_height = temp_height;
	}

	public int getTempLowSurvive() {
		return temp_low_survive;
	}

	public void setTempLowSurvive(int temp_low_survive) {
		this.temp_low_survive = temp_low_survive;
	}

	public int getTempHighSurvive() {
		return temp_high_survive;
	}

	public void setTempHighSurvive(int temp_high_survive) {
		this.temp_high_survive = temp_high_survive;
	}

	public int getTempLowBirth() {
		return temp_low_birth;
	}

	public void setTempLowBirth(int temp_low_birth) {
		this.temp_low_birth = temp_low_birth;
	}

	public int getTempHighBirth() {
		return temp_high_birth;
	}

	public void setTempHighBirth(int temp_high_birth) {
		this.temp_high_birth = temp_high_birth;
	}
	
	
}
