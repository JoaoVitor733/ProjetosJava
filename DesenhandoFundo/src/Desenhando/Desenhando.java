package Desenhando;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Desenhando extends JPanel{
	

	public void paint(Graphics g) {
	
		g.setColor(Color.GRAY);
		g.fillRect(0,450,600,450); // desenhando um ratângulo de cor cinza
		
	
		g.setColor(Color.BLACK);
		for(int i = 0; i < 590; i += 40) {
			g.fillRect(i, 550, 20, 10); 
		}
		
		Color corAzul = new Color(94,179,255);
		g.setColor(corAzul);
		g.fillRect(0, 0, 600, 350); //desenhando um retângulo de cor azul
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 350, 600, 100);
		
		g.setColor(Color.yellow);
		g.fillOval(400, 50, 100, 100); //desenhando uma circunferência amarela
		g.fillRect(0,450,600,10);
		g.fillRect(0,650,600,10);
		
		g.setColor(Color.WHITE);
		for(int x = 100; x < 190; x += 20) {		
				g.drawLine(x, x, x+10, x+10);
     			g.drawLine(x+10, x+10, x+20, x);
		}
		
		ImageIcon predio = new ImageIcon(getClass().getResource("Predio.png"));
		for(int i = 10; i < 460; i += 145)
			g.drawImage(predio.getImage(),i,240,90,110,this);
		
		ImageIcon arvore = new ImageIcon(getClass().getResource("Arvore.png"));
		for(int i = 90; i < 460; i += 145)
			g.drawImage(arvore.getImage(), i, 270, 100,100,this);
	}

}
