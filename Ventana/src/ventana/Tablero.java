package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tablero extends JFrame implements KeyListener {

    private JPanel panelDibujo;
    private JButton btnReiniciar;

    private int x = 50, y = 50, ancho = 30, alto = 30;

    public Tablero() {
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setBackground(Color.BLACK);
                g.setColor(Color.GREEN);
                g.fillRect(x, y, ancho, alto);
            }
        };

        add(panelDibujo, BorderLayout.CENTER);

        btnReiniciar = new JButton("Reiniciar");
        add(btnReiniciar, BorderLayout.SOUTH);

        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println(key);
        switch (key) {
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
        }

        panelDibujo.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new Tablero();
    }
}

