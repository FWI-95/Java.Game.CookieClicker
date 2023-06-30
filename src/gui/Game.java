package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Helpers.Helper;
import code.Player;

public class Game extends JFrame implements ComponentListener{
	Player p;
	ArrayList<UIPanel> panels;
	
	Font Arial;
	
	private BufferStrategy strat;
	
	public Game(Player parP) {
		p = parP;
		panels = new ArrayList<UIPanel>();

		this.setSize(800,600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setTitle("Cookie Clicker");
		
		this.getContentPane().setLayout(null);
		this.setLayout(null);
		
		try {
			//Load image
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Arial = new Font("Arial", Font.BOLD, 20);
		
		panels.add(new CookiePanel(p, this));
		// panels.add(new HelperPanel(p, this));
		// panels.add(new UpgradePanel(p, this));

		for(int i = 0; i < panels.size(); i++){
			this.getContentPane().add(panels.get(i));
			this.addMouseListener(panels.get(i));
		}

		this.setVisible(true);
	}
	
	public void makeStrat() {
		createBufferStrategy(2);
		strat = getBufferStrategy();
	}
	
	public void repaintScreen() {
		do {
			Graphics g;
			g = strat.getDrawGraphics();
			render(g);
			g.dispose();
			strat.show();
		} while (strat.contentsLost());
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < panels.size(); i++){
			panels.get(i).render(g);
		}
		// g.setColor(Color.BLACK);
		// g.fillRect(c.getBounds().x, c.getBounds().y, c.getBounds().width, c.getBounds().height);
//		g.setFont(Arial);
//		g.drawString(p.GetScoreAsString(), 0, 0);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
