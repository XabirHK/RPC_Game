package rpc;

public class GameSettings {
	
	public int numberOfRound;
	public int lavel;
	public boolean isOponantComputer;
	
	public boolean isOponantComputer() {
		return isOponantComputer;
	}
	
	public void setOponantComputer(boolean isOponantComputer) {
		this.isOponantComputer = isOponantComputer;
	}
	
	public int getNumberOfRound() {
		return numberOfRound;
	}
	
	public int getLavel() {
		return lavel;
	}
	
	public void setLavel(int lavel) {
		this.lavel = lavel;
	}
	
	public void setNumberOfRound(int numberOfRound) {
		this.numberOfRound = numberOfRound;
	}
	
	
}
