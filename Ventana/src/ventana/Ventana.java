package ventana;



import java.awt.BorderLayout;




import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {

		setTitle("Dibujo");
	    setSize(1100,750);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    panel.setBackground(Color.cyan);
	    add(panel);

	   

	    
	    setVisible(true);


    }

	public void paint(Graphics g) {
	    	super.paint(g);
	    	
	    	Graphics2D g2 = (Graphics2D)g;
	    	
	    	//Cuadro de la casa
	    	g2.setColor(Color.ORANGE);		    	
	    	g2.fillRect(400, 280, 280,280);
	    	//Pasto 
	    	g2.setColor(Color.green);
	    	g2.fillRect(0, 500, 1100, 30);
	    	//Lodo
	    	g2.setColor(new Color(139, 69, 19));
	    	g2.fillRect(0, 530, 1100, 212);
	    	
	    	//sol
	    	g2.setColor(Color.yellow);	    	
	    	g2.drawOval(100, 50, 150, 150);
	    	g2.fillOval(100, 50, 150, 150);

	    	//Triangulo del techo
	    	Polygon triangulo = new Polygon();
	    	triangulo.addPoint(380, 280); 
	    	triangulo.addPoint(700, 280);
	    	triangulo.addPoint(540, 180); 
	    	
	    	g2.setColor(new Color(139, 69, 19));
	    	g2.drawPolygon(triangulo);
	    	g2.fillPolygon(triangulo);
	    	
	    	//Puerta
	    	g2.setColor(new Color(139, 69, 19));	    	
	    	g2.fillRect(430, 340, 80,160);
	    	g2.setColor(Color.white);
	    	g2.drawOval(490,410, 10, 10);
	    	g2.fillOval(490,410, 10, 10);
	    	
	    	//Ventana
	    	g2.setColor(Color.white);
	    	g2.drawArc(565, 330, 70, 140, 0, 180);
	    	g2.fillArc(565, 330, 70, 140, 0, 180);
	    	
	    	g2.setColor(Color.black);
	    	g2.drawLine(600, 330, 600,400 );
	    	g2.drawLine(568, 370, 632,370 );
	    	
	    	//vaya
	    	g2.setColor(new Color(255, 165, 0)); 
	    	int x = 380;
	    	for (int i = 0; i < 8; i++) {
	    	    g2.fillRect(x, 340, 40, 160);
	    	    Polygon punta = new Polygon();
	    	    punta.addPoint(x, 340);
	    	    punta.addPoint(x + 40, 340);
	    	    punta.addPoint(x + 20, 300);
	    	    g2.fillPolygon(punta);
	    	    x -= 50;
	    	}

	    	// Barrotes
	    	g2.setColor(new Color(204, 119, 34));
	    	g2.fillRect(25, 370, 400, 10);
	    	g2.fillRect(25, 430, 400, 10);
	    	
	    	//Arbol
	    	g2.drawRect(900, 276, 60, 223);
	    	g2.fillRect(900, 276, 60, 223);
	    	
	    	g2.setColor(new Color(0, 128, 0));
	    	g2.drawOval(830, 240, 100, 100);
	    	g2.fillOval(830, 240, 100, 100);
	    	g2.fillOval(970, 180, 100, 100);
	    	g2.fillOval(840, 180, 100, 100);
	    	g2.fillOval(900, 180, 100, 100);
	    	g2.fillOval(900, 230, 100, 100);
	    	g2.fillOval(950, 250, 100, 100);

	    	
	    	

	         
	    }
    public static void main(String[] args) {
        new Ventana(); 
    }
}


