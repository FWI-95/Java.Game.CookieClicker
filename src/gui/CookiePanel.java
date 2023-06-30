package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import code.Player;

public class CookiePanel extends UIPanel{

	public CookiePanel(Player parP, JFrame f) {
		super(parP, f);
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
		// g.fillRect(0, 0, bounds.width, bounds.height);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		p.Click();
		System.out.println("Clicked Cookie");
	}

	@Override
	public void resize(JFrame f) {
		int panelWidth = 50;
		int panelHeight = 50;
		
		this.setBounds((f.getWidth() / 2) - (panelWidth / 2), (f.getHeight() / 2) - (panelHeight / 2), panelWidth, panelHeight);
		
		// this.setLocation(0, 0);
		// this.setSize(50, 50);
	}

}
