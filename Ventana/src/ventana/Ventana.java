package ventana;

import java.awt.Color;

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

        
        
        JLabel label = new JLabel("click aqui");
        label.setBounds(180, 100, 80, 80);
        panel.add(label);
        
        


        JButton boton = new JButton("Boton");
        boton.setBounds(180, 160, 100, 30);
        panel.add(boton);

        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana(); 
    }
}

