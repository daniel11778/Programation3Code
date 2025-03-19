package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class ventana extends JFrame {



	    JPanel panel;
	    JButton botonInicial;
	    Random random = new Random();

	    String[] textos = {"Click me!", "...", "Presióname"};

	    public ventana() {
	        setTitle("Botones Aleatorios");
	        setSize(800, 600);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        panel = new JPanel();
	        panel.setBackground(new Color(0, 153, 76));
	        panel.setLayout(null); 
	        add(panel);

	        botonInicial = new JButton("Presióname");
	        botonInicial.setBounds(350, 250, 120, 50);
	        panel.add(botonInicial);
	        
	        botonInicial.addActionListener(e -> crearBotonAleatorio());
	
	        setVisible(true);
	    }

	    private void crearBotonAleatorio() {
	    	
	        JButton nuevoBoton = new JButton(textos[random.nextInt(textos.length)]);

	        int ancho = random.nextInt(150); 
	        int alto = random.nextInt(100);
	        int x = random.nextInt(panel.getWidth());
	        int y = random.nextInt(panel.getHeight());
	        nuevoBoton.setBounds(x, y, ancho, alto);

	        Color colorAleatorio = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	        nuevoBoton.setBackground(colorAleatorio);
	        nuevoBoton.setOpaque(true);
	        nuevoBoton.setBorderPainted(false);

	        nuevoBoton.addActionListener(e -> {
	            int eliminar = JOptionPane.showConfirmDialog(panel,"¿Deseas eliminar este botón?","Confirmar eliminación",JOptionPane.YES_OPTION);
	            if (eliminar == JOptionPane.YES_OPTION) 
	            {
	            	panel.remove(nuevoBoton);
	                panel.repaint(); 
	            }
	        });

	        panel.add(nuevoBoton);
	        panel.repaint();
	    }

	    public static void main(String[] args) {
	        new ventana();
	    }
	}



