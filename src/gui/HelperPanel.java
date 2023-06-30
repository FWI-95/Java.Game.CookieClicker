package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import code.Player;

public class HelperPanel extends UIPanel{

	public HelperPanel(Player parP, JFrame f) {
        super(parP, f);
    }

    @Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Clicked HelperPanel");
	}

}
