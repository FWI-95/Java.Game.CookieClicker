package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import code.Player;

public class Game extends JFrame{
	Player p;
	Cookie c;
	
	Font Arial;
	
	private BufferStrategy strat;
	
	public Game(Player parP) {
		p = parP;
		this.setSize(800,600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setTitle("Cookie Clicker");
		
		this.setLayout(null);
		
		this.setVisible(true);
		
		try {
			//Load image
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Arial = new Font("Arial", Font.BOLD, 20);
		
		c = new Cookie(p);
		this.getContentPane().add(c);
	}
	
	public void makeStrat() {
		createBufferStrategy(2);
		strat = getBufferStrategy();
	}
	
	public void repaintScreen() {
		Graphics g = strat.getDrawGraphics();
		draw(g);
		g.dispose();
		strat.show();
	}
	
	public void draw(Graphics g) {		
		c.repaint();
//		g.setColor(Color.BLACK);
//		g.fillRect(c.getBounds().x, c.getBounds().y, c.getBounds().width, c.getBounds().height);
//		g.setFont(Arial);
//		g.drawString(p.GetScoreAsString(), 0, 0);
	}
	

}
