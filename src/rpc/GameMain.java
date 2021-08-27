package rpc;

import java.util.Scanner;

import rpc.player.Computer;
import rpc.player.Human;
import strategy.AiLevelOne;
import strategy.Context;

public class GameMain {

	public static void main(String[] args) {
		
		Human playerOne = new Human(new MoveAction());
		Computer playerTwo = new Computer(new MoveAction());
		
		Context stratgy = new Context(new AiLevelOne(), new MoveAction(), playerTwo);
		
		System.out.println("Game Started");
		
		Scanner scanObj = new Scanner(System.in);

	    System.out.println("Enter your move (r or p or s)");
	    
	    String playerOneMove = scanObj.nextLine();
	    
	    String computerMove = stratgy.executeStrategy();
	    
	    System.out.println("Player One Move: " + playerOneMove);
	    System.out.println("Computer Move: " + computerMove);
	    
	    
	    if(computerMove.equals(playerOneMove)) {
	    	System.out.println("DRAW");
	    } else {
	    	
	    	if(computerMove.equals("r")) {
		    	if (playerOneMove.equals("p")) {
		    		System.out.println("Player one win");
		    	} else {
		    		System.out.println("Computer win");
		    	}
		    }
	    	
	    	
	    	if(computerMove.equals("p")) {
		    	if (playerOneMove.equals("s")) {
		    		System.out.println("Player one win");
		    	} else {
		    		System.out.println("Computer win");
		    	}
		    }
	    	
	    	if(computerMove.equals("s")) {
		    	if (playerOneMove.equals("r")) {
		    		System.out.println("Player one win");
		    	} else {
		    		System.out.println("Computer win");
		    	}
		    }
	    	
	    }
	    
	    
	    
	    
	    
	    scanObj.close();
	}
}
