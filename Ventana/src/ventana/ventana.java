package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.BorderLayout;

import javax.swing.*;

public class ventana extends JFrame {
	
	int contadorX = 0;
	int contadorO = 0;
	JLabel contadorXLabel = new JLabel("Victorias X: 0");
	JLabel contadorOLabel = new JLabel("Victorias O: 0");
    boolean endgame = false;
    boolean player = true;
    JButton resetButton = new JButton("Reiniciar");
    JButton boton1 = new JButton("");
    JButton boton2 = new JButton("");
    JButton boton3 = new JButton("");
    JButton boton4 = new JButton("");
    JButton boton5 = new JButton("");
    JButton boton6 = new JButton("");
    JButton boton7 = new JButton("");
    JButton boton8 = new JButton("");
    JButton boton9 = new JButton("");

    public ventana() {
    	


        setTitle("Registro");
        setSize(1000, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 3,10,10));
        panel2.setBackground(new Color(32, 165, 165));

        resetButton.addActionListener(e -> resetGame());

        boton1.setBackground(new Color(37, 191, 191));
        boton1.addActionListener(e -> {
            if (endgame) return;
            if (player == true) {
            	
                boton1.setText("X");
                boton1.setFont(new Font("Arial", Font.BOLD, 50));
                boton1.setForeground(new Color(78, 78, 78));
                
                validation();
                player = false;
            } else if (player == false) {
                boton1.setText("O");
                boton1.setFont(new Font("Arial", Font.BOLD, 50));
                boton1.setForeground(new Color(254, 243, 192));                
                validation();
                player = true;
            }
            boton1.setEnabled(false);
        });
        
        boton2.setBackground(new Color(37, 191, 191));
        boton2.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton2.setText("X");
                boton2.setFont(new Font("Arial", Font.BOLD, 50));
                boton2.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton2.setText("O");
                boton2.setFont(new Font("Arial", Font.BOLD, 50));
                boton2.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton2.setEnabled(false);
        });

        boton3.setBackground(new Color(37, 191, 191));
        boton3.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton3.setText("X");
                boton3.setFont(new Font("Arial", Font.BOLD, 50));
                boton3.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton3.setText("O");
                boton3.setFont(new Font("Arial", Font.BOLD, 50));
                boton3.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton3.setEnabled(false);
        });

        boton4.setBackground(new Color(37, 191, 191));
        boton4.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton4.setText("X");
                boton4.setFont(new Font("Arial", Font.BOLD, 50));
                boton4.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton4.setText("O");
                boton4.setFont(new Font("Arial", Font.BOLD, 50));
                boton4.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton4.setEnabled(false);
        });

        boton5.setBackground(new Color(37, 191, 191));
        boton5.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton5.setText("X");
                boton5.setFont(new Font("Arial", Font.BOLD, 50));
                boton5.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton5.setText("O");
                boton5.setFont(new Font("Arial", Font.BOLD, 50));
                boton5.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton5.setEnabled(false);
        });

        boton6.setBackground(new Color(37, 191, 191));
        boton6.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton6.setText("X");
                boton6.setFont(new Font("Arial", Font.BOLD, 50));
                boton6.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton6.setText("O");
                boton6.setFont(new Font("Arial", Font.BOLD, 50));
                boton6.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton6.setEnabled(false);
        });

        boton7.setBackground(new Color(37, 191, 191));
        boton7.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton7.setText("X");
                boton7.setFont(new Font("Arial", Font.BOLD, 50));
                boton7.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton7.setText("O");
                boton7.setFont(new Font("Arial", Font.BOLD, 50));
                boton7.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton7.setEnabled(false);
        });

        boton8.setBackground(new Color(37, 191, 191));
        boton8.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton8.setText("X");
                boton8.setFont(new Font("Arial", Font.BOLD, 50));
                boton8.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton8.setText("O");
                boton8.setFont(new Font("Arial", Font.BOLD, 50));
                boton8.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton8.setEnabled(false);
        });

        boton9.setBackground(new Color(37, 191, 191));
        boton9.addActionListener(e -> {
            if (endgame) return;

            if (player == true) {
                boton9.setText("X");
                boton9.setFont(new Font("Arial", Font.BOLD, 50));
                boton9.setForeground(new Color(78, 78, 78));

                validation();
                player = false;
            } else if (player == false) {
                boton9.setText("O");
                boton9.setFont(new Font("Arial", Font.BOLD, 50));
                boton9.setForeground(new Color(254, 243, 192));

                validation();
                player = true;
            }
            boton9.setEnabled(false);
        });
        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        panel2.add(boton4);
        panel2.add(boton5);
        panel2.add(boton6);
        panel2.add(boton7);
        panel2.add(boton8);
        panel2.add(boton9);

        JPanel resetPanel = new JPanel();
        resetPanel.add(resetButton);

        panel.add(panel2, BorderLayout.CENTER);
        panel.add(resetPanel, BorderLayout.SOUTH);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 3));
        bottomPanel.add(contadorXLabel);
        bottomPanel.add(resetButton);
        bottomPanel.add(contadorOLabel);

        panel.add(panel2, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public void validation() {
        if (boton1.getText().equals("X") && boton2.getText().equals("X") && boton3.getText().equals("X") ||
            boton4.getText().equals("X") && boton5.getText().equals("X") && boton6.getText().equals("X") ||
            boton7.getText().equals("X") && boton8.getText().equals("X") && boton9.getText().equals("X") ||
            boton1.getText().equals("X") && boton4.getText().equals("X") && boton7.getText().equals("X") ||
            boton2.getText().equals("X") && boton5.getText().equals("X") && boton8.getText().equals("X") ||
            boton3.getText().equals("X") && boton6.getText().equals("X") && boton9.getText().equals("X") ||
            boton1.getText().equals("X") && boton5.getText().equals("X") && boton9.getText().equals("X") ||
            boton3.getText().equals("X") && boton5.getText().equals("X") && boton7.getText().equals("X")) 
        {
            JOptionPane.showMessageDialog(this, "¡Jugador X gana!");
            endgame = true;
            contadorX++;
            contadorXLabel.setText("Victorias X: " + contadorX);

            return;
        }

        if (boton1.getText().equals("O") && boton2.getText().equals("O") && boton3.getText().equals("O") ||
            boton4.getText().equals("O") && boton5.getText().equals("O") && boton6.getText().equals("O") ||
            boton7.getText().equals("O") && boton8.getText().equals("O") && boton9.getText().equals("O") ||
            boton1.getText().equals("O") && boton4.getText().equals("O") && boton7.getText().equals("O") ||
            boton2.getText().equals("O") && boton5.getText().equals("O") && boton8.getText().equals("O") ||
            boton3.getText().equals("O") && boton6.getText().equals("O") && boton9.getText().equals("O") ||
            boton1.getText().equals("O") && boton5.getText().equals("O") && boton9.getText().equals("O") ||
            boton3.getText().equals("O") && boton5.getText().equals("O") && boton7.getText().equals("O")) 
        {
            JOptionPane.showMessageDialog(this, "¡Jugador O gana!");
            endgame = true;
            contadorO++;
            contadorOLabel.setText("Victorias O: " + contadorO);

            return;
        }
        if (!boton1.getText().equals("") &&
            !boton2.getText().equals("") &&
            !boton3.getText().equals("") &&
            !boton4.getText().equals("") &&
            !boton5.getText().equals("") &&
            !boton6.getText().equals("") &&
            !boton7.getText().equals("") &&
            !boton8.getText().equals("") &&
            !boton9.getText().equals("") &&
            !endgame) 
        {

            JOptionPane.showMessageDialog(this, "¡Es un empate!");
            endgame = true;
        }
    }

    public void resetGame() {
    	
        boton1.setText(""); 
        boton1.setEnabled(true);
        
        boton2.setText(""); 
        boton2.setEnabled(true);
        
        boton3.setText("");
        boton3.setEnabled(true);
        
        boton4.setText("");
        boton4.setEnabled(true);
        
        boton5.setText(""); 
        boton5.setEnabled(true);
        
        boton6.setText(""); 
        boton6.setEnabled(true);
        
        boton7.setText("");
        boton7.setEnabled(true);
        
        boton8.setText(""); 
        boton8.setEnabled(true);
        
        boton9.setText(""); 
        boton9.setEnabled(true);
        

        endgame = false;
        player = true;
    }

    public static void main(String[] args) {
        new ventana();
    }
}
