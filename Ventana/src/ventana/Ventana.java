package ventana;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {
    	
    	
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
    }

    public static void main(String[] args) {
        new Ventana(); 
    }
}

