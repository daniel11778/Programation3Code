package ventana;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    JTextField pantalla;
    int x = 10, y = 10; //iniciales

    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.DARK_GRAY);

        pantalla = new JTextField();
        pantalla.setBounds(10, 10, 265, 50);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.BLACK);
        pantalla.setForeground(Color.WHITE);
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        add(pantalla);

        JButton botonCE = new JButton("CE");
        botonCE.setBounds(10, 70, 265, 40);
        botonCE.setFont(new Font("Arial", Font.BOLD, 20));
        botonCE.setBackground(Color.GRAY);
        botonCE.setForeground(Color.BLACK);
        add(botonCE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(10, 120, 265, 280);
        add(panel);

        // Matriz de botones
        String[][] botones = {
            {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"0", ".", "=", "+"}
        };

        // Ciclo for para crear los botones
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton boton = new JButton(botones[i][j]);
                boton.setBounds(x, y, 60, 50);
                boton.setFont(new Font("Arial", Font.BOLD, 20));
                
                if ("/*-+=.".contains(botones[i][j])) {
                    boton.setBackground(new Color(255, 140, 0)); 
                    boton.setForeground(Color.BLACK);
                } else {
                    boton.setBackground(Color.DARK_GRAY);
                    boton.setForeground(Color.WHITE);
                }
                panel.add(boton);
                x += 65;
            }
            x = 10;
            y += 55;
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
