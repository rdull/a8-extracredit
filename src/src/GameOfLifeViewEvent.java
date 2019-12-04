package src;

abstract public class GameOfLifeViewEvent {
	public boolean isRandomEvent() {
		return false;
	}

	public boolean isRunEvent() {
		return false;
	}
	
	public boolean isClearEvent() {
		return false;
	}

	public boolean isTorusEvent() {
		return false;
	}
	
	public boolean isHeightSlideEvent() {
		return false;
	}
	
	public boolean isWidthSlideEvent() {
		return false;
	}
	
	public boolean isLowSurviveSlideEvent() {
		return false;
	}
	
	public boolean isHighSurviveSlideEvent() {
		return false;
	}
	
	public boolean isLowBirthSlideEvent() {
		return false;
	}
	
	public boolean isHighBirthSlideEvent() {
		return false;
	}
	
	public boolean isSubmitEvent() {
		return false;
	}
}

class RandomEvent extends GameOfLifeViewEvent {
	private String s;
	
	public RandomEvent(String s) {
		this.s = s;
	}
	
	public String getString() {
		return s;
	}
	
	public boolean isRandomEvent() {
		return true;
	}
}

class RunEvent extends GameOfLifeViewEvent {
	
	private String s;
	
	public RunEvent(String s) {
		this.s = s;
	}
	
	public String getString() {
		return s;
	}
	
	public boolean isRunEvent() {
		return true;
	}
}

class ClearEvent extends GameOfLifeViewEvent {
	
	private String s;
	
	public ClearEvent(String s) {
		this.s = s;
	}
	
	public String getString() {
		return s;
	}
	
	public boolean isClearEvent() {
		return true;
	}
}

class TorusEvent extends GameOfLifeViewEvent {
	
	private String s;
	
	public TorusEvent(String s) {
		this.s = s;
	}
	
	public String getString() {
		return s;
	}
	
	public boolean isTorusEvent() {
		return true;
	}
}

class SubmitEvent extends GameOfLifeViewEvent {
	
	private String s;
	
	public SubmitEvent(String s) {
		this.s = s;
	}
	
	public String getString() {
		return s;
	}
	
	public boolean isSubmitEvent() {
		return true;
	}
}

class HeightSlideEvent extends GameOfLifeViewEvent {
	
	private String s;
	private int x;
	
	public HeightSlideEvent(int x) {
		this.x = x;
	}
	
	public int getValue() {
		return x;
	}
	
	public boolean isHeightSlideEvent() {
		return true;
	}
}

class WidthSlideEvent extends GameOfLifeViewEvent {
	
	private String s;
	private int x;
	
	public WidthSlideEvent(int x) {
		this.x = x;
	}
	
	public int getValue() {
		return x;
	}
	
	public boolean isWidthSlideEvent() {
		return true;
	}
}

class LowSurviveSlideEvent extends GameOfLifeViewEvent {
	
	private String s;
	private int x;
	
	public LowSurviveSlideEvent(int x) {
		this.x = x;
	}
	
	public int getValue() {
		return x;
	}
	
	public boolean isLowSurviveSlideEvent() {
		return true;
	}
}

class HighSurviveSlideEvent extends GameOfLifeViewEvent {
	
	private String s;
	private int x;
	
	public HighSurviveSlideEvent(int x) {
		this.x = x;
	}
	
	public int getValue() {
		return x;
	}
	
	public boolean isHighSurviveSlideEvent() {
		return true;
	}
}

class LowBirthSlideEvent extends GameOfLifeViewEvent {
	
	private String s;
	private int x;
	
	public LowBirthSlideEvent(int x) {
		this.x = x;
	}
	
	public int getValue() {
		return x;
	}
	
	public boolean isLowBirthSlideEvent() {
		return true;
	}
}

class HighBirthSlideEvent extends GameOfLifeViewEvent {
	
	private String s;
	private int x;
	
	public HighBirthSlideEvent(int x) {
		this.x = x;
	}
	
	public int getValue() {
		return x;
	}
	
	public boolean isHighBirthSlideEvent() {
		return true;
	}
}