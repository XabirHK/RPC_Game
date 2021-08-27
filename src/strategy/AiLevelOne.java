package strategy;

import rpc.MoveAction;
import rpc.player.Computer;


public class AiLevelOne implements GameStrategy{

	@Override
	public String takeAction(MoveAction moveAction, Computer computerPlayer) {
		
		String[] moves = moveAction.getMoves();
		
		int limitMax = moves.length;
        int limitMin = 0;
        int range = limitMax - limitMin;
		
		int randomMove = (int)(Math.random() * range) + limitMin;
		
		System.out.println(randomMove);
		return computerPlayer.action(moves[randomMove]);
	}
	
	

}
