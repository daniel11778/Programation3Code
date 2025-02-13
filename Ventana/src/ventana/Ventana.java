package ventana;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 

public class Ventana extends JFrame {

    public Ventana() {
    	
    	
    	setTitle("Ventana");
        setLayout(null);
        setSize(525, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JLabel label = new JLabel("click aqui");
        label.setBounds(230, 100, 60, 60);
        add(label);

        JButton boton = new JButton("Boton");
        boton.setBounds(200, 150, 100, 30);
        add(boton);

        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana(); 
    }
}

