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

		setTitle("Calculador de interes");
	    setSize(1700,750);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    panel.setBackground(new Color(144, 238, 144));
	    add(panel);

	   

	    
	    setVisible(true);


    }

	public void paint(Graphics g) {
	    	super.paint(g);
	    	
	    	Graphics2D g2 = (Graphics2D)g;
	    	
	    	g2.setColor(Color.red);
	    	
	    	g2.drawRect(80, 80,80, 80);
	    	
	    	g2.fillRect(80, 80, 280,280);
	    	
	    	g2.clearRect(80, 80, 80,80);
	    	
	    	g2.drawLine(20, 20,300, 400);
	    	
	    	g2.setStroke(new BasicStroke(20));
	    	
	    	g2.drawOval(650, 200, 30, 30);
	    	
	    	g2.drawOval(730, 200, 30, 30);
	    	
	    	g2.drawString("Hola papus", 800, 500);


	    		

	    	g2.drawArc(600, 200, 200, 200, 1, -180);
	    }
    public static void main(String[] args) {
        new Ventana(); 
    }
}


