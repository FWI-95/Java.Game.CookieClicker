package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import code.Player;

public class UpgradePanel extends UIPanel{

	public UpgradePanel(Player parP, JFrame f) {
        super(parP, f);
    }

    @Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Clicked UpgradePanel");
	}

    @Override
    public void resize(JFrame f){
        int panelWidth = f.getWidth() / 3;
		this.setBounds(0, 0, panelWidth, f.getHeight());
    }
}
