package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import code.Player;

public class Cookie extends JPanel implements MouseListener{

	Player p;
	Rectangle bounds;
	
	public Cookie(Player parP) {
		p = parP;
		
		bounds = new Rectangle();
		
		this.setBounds(100, 100, 50, 50);
		
		this.add(new JLabel("HIER"));
	}

	public Rectangle getBounds() {
		return bounds;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
	}
	
	public void setBounds(int x, int y, int width, int height) {
		bounds.x = x;
		bounds.y = y;
		bounds.width = width;
		bounds.height = height;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		p.Click();		
		System.out.println("Clicked");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
