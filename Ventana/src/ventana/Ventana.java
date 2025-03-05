package ventana;



import java.awt.BorderLayout;




import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {

		setTitle("Calculador de interes");
	    setSize(500,550);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    panel.setBackground(new Color(144, 238, 144));
	    add(panel);
	    
	    JLabel title = new JLabel("Calcular Interes");
	    title.setFont(new Font("Arial", Font.BOLD, 18));
	    panel.add(title,BorderLayout.NORTH);
	    title.setHorizontalAlignment(JLabel.CENTER);
	    
	    JPanel panel2 = new JPanel();
	    panel2.setLayout(new GridLayout(4,3,60,80));
	    panel2.setBackground(new Color(144, 238, 144));
	    panel.add(panel2,BorderLayout.CENTER);
	    
	    
	    JLabel capital = new JLabel("Capital");
	    capital.setFont(new Font("Arial", Font.BOLD, 18));
	    capital.setForeground(Color.black);
	    capital.setHorizontalAlignment(JLabel.CENTER);
	    panel2.add(capital);
	    
	    
	    JTextField capitalField = new JTextField();
	    capitalField.setHorizontalAlignment(JTextField.CENTER);

	    panel2.add(capitalField);

	    JLabel tiempo = new JLabel("Interes");
	    tiempo.setFont(new Font("Arial", Font.BOLD, 18));
	    tiempo.setForeground(Color.black);
	    tiempo.setHorizontalAlignment(JLabel.CENTER);
	    panel2.add(tiempo);
	    
	    JTextField tiempoField = new JTextField();
	    tiempoField.setHorizontalAlignment(JTextField.CENTER);
	    panel2.add(tiempoField);
	    
	    JLabel tasaInteres = new JLabel("Capital");
	    tasaInteres.setFont(new Font("Arial", Font.BOLD, 18));
	    tasaInteres.setForeground(Color.black);
	    tasaInteres.setHorizontalAlignment(JLabel.CENTER);
	    panel2.add(tasaInteres);
	    
	    JTextField tasaInteresF = new JTextField();
	    tasaInteresF.setHorizontalAlignment(JTextField.CENTER);
	    panel2.add(tasaInteresF);
	    
	    JButton cancelar = new JButton("Cancelar");
	    cancelar.setFont(new Font("Arial", Font.BOLD, 18));
	    cancelar.setBackground(Color.black);
	    cancelar.setForeground(Color.white);

	    panel2.add(cancelar);
	    
	    JButton aceptar = new JButton("Aceptar");
	    aceptar.setFont(new Font("Arial", Font.BOLD, 18));
	    aceptar.setBackground(Color.black);
	    aceptar.setForeground(Color.white);
	    panel2.add(aceptar);
	    
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2, 2, 60, 100));
        panel3.setBackground(Color.pink); 
        panel.add(panel3, BorderLayout.SOUTH);

   
        JLabel interes = new JLabel("Interés Calculado");
        interes.setFont(new Font("Arial", Font.BOLD, 18));
        interes.setForeground(Color.black);
	    interes.setHorizontalAlignment(JLabel.CENTER);
        panel3.add(interes);

        JTextField interesfield = new JTextField();
        panel3.add(interesfield);

        JLabel monto = new JLabel("Monto Total");
        monto.setFont(new Font("Arial", Font.BOLD, 18));
        monto.setForeground(Color.black);
	    monto.setHorizontalAlignment(JLabel.CENTER);
        panel3.add(monto);

        JTextField montofield = new JTextField();
        panel3.add(montofield);
        


	    
	    setVisible(true);


    }

    public static void main(String[] args) {
        new Ventana(); 
    }
}


