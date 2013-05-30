// main class
// tp

package dakitoto.tictactoe;

import dakitoto.tictactoe.board.board;
import dakitoto.tictactoe.control.multiplayer;
import dakitoto.tictactoe.control.singleplayer;
import dakitoto.tictactoe.control.player;
import dakitoto.tictactoe.gui.gui;

public class Main {
	public static void main(String[] args){
		board board= new board();
		player player= new multiplayer(board);
		player= new singleplayer(board);
		
		gui gui= new gui();
		
		
		int winningPlayer=0;
		while ((winningPlayer=player.nextTurn())==0){
			
			System.out.println("----------------------");
			
			System.out.println("|--"+board.valueAt(6)+"---|---"+board.valueAt(7)+"---|--"+board.valueAt(8)+"--|");
			
			System.out.println("|------|-------|-----|");
			
			System.out.println("|--"+board.valueAt(3)+"---|---"+board.valueAt(4)+"---|--"+board.valueAt(5)+"--|");
			
			System.out.println("|------|-------|-----|");
			
			System.out.println("|--"+board.valueAt(0)+"---|---"+board.valueAt(1)+"---|--"+board.valueAt(2)+"--|");
			
			System.out.println("----------------------");
		}
		
		System.out.println("Sieg von Spieler "+ winningPlayer);
		
		
		
	}
}
