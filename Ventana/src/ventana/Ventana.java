package ventana;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {
    	
    	/*
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 250);
        frame.add(panel);
        
        JLabel titleLabel = new JLabel("Iniciar sesión");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(130, 10, 200, 30);
        panel.add(titleLabel);
        //Etiqueta correo
        JLabel emailLabel = new JLabel("Correo:");
        emailLabel.setBounds(50, 50, 100, 25);
        panel.add(emailLabel);
        //Field del correo
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 50, 200, 25);
        panel.add(emailField);
        
        // Etiqueta contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 90, 100, 25);
        panel.add(passwordLabel);
        //Password
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 90, 200, 25);
        panel.add(passwordField);
        
        
        
        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(150, 160, 150, 30);
        panel.add(loginButton);
        
        
   
        frame.setVisible(true);
        */
		
        setTitle("Registro");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 500);
        panel.setBackground(Color.GRAY);
        add(panel);

        JLabel titulo = new JLabel("REGISTRO", SwingConstants.CENTER);
        titulo.setBounds(50, 10, 300, 40);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(41, 128, 185)); // Azul
        titulo.setForeground(Color.WHITE);
        panel.add(titulo);

        JLabel nombreLabel = new JLabel("NOMBRE DE USUARIO:", SwingConstants.CENTER);
        nombreLabel.setBounds(50, 60, 300, 20);
        nombreLabel.setOpaque(true);
        nombreLabel.setBackground(new Color(255, 223, 186)); 
        nombreLabel.setForeground(new Color(44, 62, 80)); 
        nombreLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.black));

        panel.add(nombreLabel);

        panel.add(nombreLabel);

        JTextField nombreField = new JTextField();
        nombreField.setBounds(50, 85, 300, 25);
        nombreField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.black));

        panel.add(nombreField);

        JLabel bioLabel = new JLabel("BIO", SwingConstants.CENTER);
        bioLabel.setBounds(50, 120, 300, 20);
        bioLabel.setOpaque(true);
        bioLabel.setBackground(new Color(255, 223, 186)); 
        bioLabel.setForeground(new Color(44, 62, 80));        
        bioLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.black));

        panel.add(bioLabel);

        JTextArea bioArea = new JTextArea();
        bioArea.setBounds(50, 145, 300, 60);
        bioArea.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.black));
        panel.add(bioArea);

        JLabel prefLabel = new JLabel("PREFERENCIAS", SwingConstants.CENTER);
        prefLabel.setBounds(50, 215, 300, 20);
        prefLabel.setOpaque(true);
        prefLabel.setBackground(new Color(255, 223, 186)); 
        prefLabel.setForeground(new Color(44, 62, 80)); 
        prefLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.black));
        panel.add(prefLabel);

        JCheckBox dulces = new JCheckBox("Dulces");
        dulces.setBounds(50, 240, 80, 20);
        dulces.setBackground(getForeground());
        JCheckBox salado = new JCheckBox("Salado");
        salado.setBounds(140, 240, 80, 20);
        salado.setBackground(getForeground());
        JCheckBox saludable = new JCheckBox("Saludable");
        saludable.setBounds(230, 240, 100, 20);
        saludable.setBackground(getForeground());

        ButtonGroup grupoPreferencias = new ButtonGroup();
        grupoPreferencias.add(dulces);
        grupoPreferencias.add(salado);
        grupoPreferencias.add(saludable);

        panel.add(dulces);
        panel.add(salado);
        panel.add(saludable);

        JLabel terminosLabel = new JLabel("TERMINOS", SwingConstants.CENTER);
        terminosLabel.setBounds(50, 270, 300, 20);
        terminosLabel.setOpaque(true);
        terminosLabel.setBackground(new Color(255, 223, 186)); 
        terminosLabel.setForeground(new Color(44, 62, 80));        
        terminosLabel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.black));
        panel.add(terminosLabel);

        JRadioButton aceptar = new JRadioButton("Acepto los términos");
        aceptar.setBounds(50, 295, 150, 20);
        aceptar.setBackground(getForeground());

        JRadioButton noAceptar = new JRadioButton("No acepto los términos");
        noAceptar.setBounds(200, 295, 170, 20);
        noAceptar.setBackground(getForeground());


        ButtonGroup grupoTerminos = new ButtonGroup();
        grupoTerminos.add(aceptar);
        grupoTerminos.add(noAceptar);

        panel.add(aceptar);
        panel.add(noAceptar);

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Camino Real", "Progreso", "Miramar", "Mi casa"});
        comboBox.setBounds(50, 320, 300, 25);
        panel.add(comboBox);

        JButton boton = new JButton("Crear cuenta");
        boton.setBounds(50, 360, 300, 40);
        boton.setBackground(new Color(39, 174, 96));
        boton.setForeground(Color.WHITE); 
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(boton);

        
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana(); 
    }
}

