package strategy;

import rpc.MoveAction;
import rpc.player.Computer;


public class Context {
	private GameStrategy strategy;
	private MoveAction moveAction;
	private Computer computerPlayer;

	public Context(GameStrategy strategy, MoveAction moveAction, Computer computerPlayer){
       this.strategy = strategy;
       this.moveAction = moveAction;
       this.computerPlayer = computerPlayer;
    }

    public String executeStrategy(){
		return strategy.takeAction(this.moveAction, this.computerPlayer);
    }

}
