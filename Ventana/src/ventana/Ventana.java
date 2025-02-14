package ventana;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {
    	
    	
    	setTitle("Ventana");
        setLayout(null);
        setSize(525, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        panel.setOpaque(true);
        panel.setBounds(50,50,400,400);
        add(panel);

        
        
        JLabel label = new JLabel("Bienvenido");
        label.setBounds(160, 100, 80, 30);
        label.setBackground(Color.CYAN);
        label.setOpaque(true);
        label.setFont(new Font("Italika",Font.BOLD, 12));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        
        


        JButton boton = new JButton("Boton");
        boton.setBounds(150, 160, 100, 30);
        panel.add(boton);

        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana(); 
    }
}

