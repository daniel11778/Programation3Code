package ventana;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {

        setTitle("Registro");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 500);
        panel.setBackground(Color.WHITE);
        add(panel);


        JLabel titulo = new JLabel("SIGN UP", SwingConstants.CENTER);
        titulo.setBounds(50, 20, 300, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(44, 62, 80)); // Color de texto oscuro
        panel.add(titulo);

        // Campo NOMBRE DE USUARIO 
        JLabel nombreLabel = new JLabel("NOMBRE DE USUARIO:", SwingConstants.LEFT);
        nombreLabel.setBounds(50, 80, 300, 20);
        nombreLabel.setForeground(new Color(44, 62, 80));
        panel.add(nombreLabel);

        JTextField nombreField = new JTextField();
        nombreField.setBounds(50, 105, 300, 25);
        nombreField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.add(nombreField);

        // Campo BIO
        JLabel bioLabel = new JLabel("BIO", SwingConstants.LEFT);
        bioLabel.setBounds(50, 140, 300, 20);
        bioLabel.setForeground(new Color(44, 62, 80));
        panel.add(bioLabel);

        JTextArea bioArea = new JTextArea();
        bioArea.setBounds(50, 165, 300, 60);
        bioArea.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
        panel.add(bioArea);

        // Campo PREFERENCIAS 
        JLabel prefLabel = new JLabel("PREFERENCIAS", SwingConstants.LEFT);
        prefLabel.setBounds(50, 235, 300, 20);
        prefLabel.setForeground(new Color(44, 62, 80));
        panel.add(prefLabel);

        JCheckBox dulces = new JCheckBox("Dulces");
        dulces.setBounds(50, 260, 80, 20);
        dulces.setBackground(Color.WHITE);
        JCheckBox salado = new JCheckBox("Salado");
        salado.setBounds(140, 260, 80, 20);
        salado.setBackground(Color.WHITE);
        JCheckBox saludable = new JCheckBox("Saludable");
        saludable.setBounds(230, 260, 100, 20);
        saludable.setBackground(Color.WHITE);

        panel.add(dulces);
        panel.add(salado);
        panel.add(saludable);

        // Campo "TERMINOS" (subido)
        JLabel terminosLabel = new JLabel("TERMINOS", SwingConstants.LEFT);
        terminosLabel.setBounds(50, 290, 300, 20); 
        terminosLabel.setForeground(new Color(44, 62, 80));
        panel.add(terminosLabel);

        JRadioButton aceptar = new JRadioButton("Acepto los términos");
        aceptar.setBounds(50, 315, 150, 20);
        aceptar.setBackground(Color.WHITE);

        JRadioButton noAceptar = new JRadioButton("No acepto los términos");
        noAceptar.setBounds(200, 315, 170, 20); 
        noAceptar.setBackground(Color.WHITE);

        ButtonGroup grupoTerminos = new ButtonGroup();
        grupoTerminos.add(aceptar);
        grupoTerminos.add(noAceptar);

        panel.add(aceptar);
        panel.add(noAceptar);

        // Botón Crear cuenta
        JButton boton = new JButton("Crear cuenta");
        boton.setBounds(50, 350, 300, 40); 
        boton.setBackground(new Color(39, 174, 96)); // Verde del pennyB
        boton.setForeground(Color.WHITE);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(boton);

        // Panel derecho (imagen)
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(400, 0, 600, 500); 
        panel2.setBackground(new Color(12, 147, 68));

        // Cargar la imagen
        ImageIcon pennyB = new ImageIcon("PennyB.jpg");
        JLabel etqPennyB = new JLabel();
        etqPennyB.setBounds(50, 50, 500, 400); 
        etqPennyB.setIcon(new ImageIcon(pennyB.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH)));
        panel2.add(etqPennyB);
        add(panel2);
        add(panel);
        setVisible(true);
      //sintantoscoments
    }

    public static void main(String[] args) {
        new Ventana(); 
    }
}


