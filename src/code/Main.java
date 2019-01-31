package code;

import java.awt.Graphics;

import gui.Game;

public class Main {

	static long Speed = 300;
	
	public static void main(String[] args) {
		Player player = new Player();
		
		Game game = new Game(player);
		game.makeStrat();
		
		long lastUpdate = System.currentTimeMillis();
		while(true) {
			if ((System.currentTimeMillis() - lastUpdate) > Speed) {
				game.repaintScreen();
				lastUpdate = System.currentTimeMillis();
			}
			
		}
		
		
	}

}
