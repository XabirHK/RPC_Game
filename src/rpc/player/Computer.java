package rpc.player;

import rpc.MoveAction;

public class Computer implements Player{


	public final String type =  "COMPUTER";
	
	private MoveAction moveAction;
	
	public Computer (MoveAction moveAction) {
		this.moveAction= moveAction;
	}
	
	@Override
	public String action(String playerMove) {
		
		String[] moves = moveAction.getMoves();
		return moveAction.checkAndSetMove(moves, playerMove);
	}

}
