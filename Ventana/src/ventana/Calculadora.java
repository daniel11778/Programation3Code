package ventana;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    JTextField pantalla;
    int x = 10, y = 10;

    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.DARK_GRAY);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.DARK_GRAY);
        add(panel);
        
        JLabel pantalla = new JLabel("0");
        pantalla.setFont(new Font("Arial", Font.BOLD, 50));  
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        pantalla.setBorder(BorderFactory.createLineBorder(Color.white));
        panel.add(pantalla,BorderLayout.NORTH);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4,4));
        panel.add(panel2,BorderLayout.CENTER);
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
                
                boton.setFont(new Font("Arial", Font.BOLD, 20));
                
                if ("/*-+=.".contains(botones[i][j])) {
                    boton.setBackground(new Color(255, 140, 0)); 
                    boton.setForeground(Color.BLACK);
                } else {
                    boton.setBackground(Color.DARK_GRAY);
                    boton.setForeground(Color.WHITE);
                }
                panel2.add(boton);
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
