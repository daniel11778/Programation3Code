package ventana;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ventana extends JFrame {

	public ventana() {

		
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
        
        
        
        JButton boton = new JButton("Iniciar sesión");
        boton.setBounds(150, 160, 150, 30);
        panel.add(boton);
        

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	boolean flag1 = false,flag2 = false;
            	if (passwordField.getPassword().length == 0) 
            	{  	
            	    passwordField.setBorder(BorderFactory.createLineBorder(Color.red));
            	} 
            	else 
            	{
            	    passwordField.setBorder(BorderFactory.createLineBorder(Color.green));
            	                	    
            	    if (String.valueOf(passwordField.getPassword()).equals("elPepe"))   
            	    {
            	    	 flag1 = true;
            	    }
            	}
            	if(emailField.getText().isEmpty()) 
            	{
            		emailField.setBorder(BorderFactory.createLineBorder(Color.red));
            	}
            	else
            	{
            		emailField.setBorder(BorderFactory.createLineBorder(Color.green));
            		if(emailField.getText().equals("danielCorreo@gmail.com"))
            		{
            			 flag2 = true;
            		}
                    if (flag1 && flag2) {
                        JOptionPane.showMessageDialog(null, "Acceso concedido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                    }
            		
            	}
            }
        });

   
        frame.setVisible(true);
        }
	
public static void main(String[] args) {
    new ventana(); 
}
}
