package rpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAction {
	private final String moves[] = {"r","p","s"}; 
	private String move;
	
	public String[] getMoves() {
		return this.moves;
	}
	
	public String getMove() {
		return this.move;
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	
	public String checkAndSetMove(String[] moves, String move)
	{
		List<String> movesList = new ArrayList<>(Arrays.asList(moves));
		
		if(!movesList.contains(move)) {
			return "ERROR";
		} else {
			this.setMove(move);
			return this.getMove();
		}
	}
}
