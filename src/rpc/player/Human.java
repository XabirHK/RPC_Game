package rpc.player;

import rpc.MoveAction;

public class Human implements Player{
	
	public final String type =  "HUMAN";
	
	private MoveAction moveAction;
	
	public Human (MoveAction moveAction) {
		this.moveAction= moveAction;
	}
	
	@Override
	public String action(String playerMove) {
		
		String[] moves = moveAction.getMoves();
		return moveAction.checkAndSetMove(moves, playerMove);
	}
}
