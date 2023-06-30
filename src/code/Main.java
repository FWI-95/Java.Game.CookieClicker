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
		long lastTick = System.currentTimeMillis();
		while(true) {
			if ((System.currentTimeMillis() - lastTick) > 1000) {
				player.Tick();
				lastTick = System.currentTimeMillis();
			}			

			if ((System.currentTimeMillis() - lastUpdate) > Speed) {
				game.repaintScreen();
				lastUpdate = System.currentTimeMillis();
			}
			
		}
	}

}
