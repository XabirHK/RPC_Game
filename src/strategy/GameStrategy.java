package strategy;

import rpc.MoveAction;
import rpc.player.Computer;

public interface GameStrategy {
	
	public String takeAction(MoveAction moveAction, Computer computerPlayer);
}
