package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;

public class ventana extends JFrame {
    private JButton[][] botones;
    private JButton reiniciar;

    public ventana() {
        setTitle("Rompecabezas Numerico");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 102), 40));

        JPanel panelTablero = new JPanel(new GridLayout(4, 4,10,10));
        botones = new JButton[4][4];
        panelTablero.setBackground(new Color(0, 51, 102));
        
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (num <= 15) {
                    botones[i][j] = new JButton(String.valueOf(num));
                    botones[i][j].setBackground(new Color(102, 204, 255));
                    botones[i][j].setFont(new Font("Arial", Font.BOLD, 20));

                } 
                else 
                {
                    botones[i][j] = new JButton();
                    botones[i][j].setBackground(new Color(102, 204, 255));

                }
                panelTablero.add(botones[i][j]);
                num++;
            }
        }

        reiniciar = new JButton("Reiniciar");

        panelPrincipal.add(panelTablero, BorderLayout.CENTER);
        panelPrincipal.add(reiniciar, BorderLayout.SOUTH);

        add(panelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ventana();
    }
}
