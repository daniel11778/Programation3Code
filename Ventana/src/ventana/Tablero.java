package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tablero extends JFrame implements KeyListener {

    private JPanel panelDibujo;
    private JButton btnReiniciar;
    private Jugador jugador;
    private int x = 50, y = 50, ancho = 30, alto = 30;
    private final int pared = 50;

    int[][] laberinto = {
    	    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    	    {1,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,2},
    	    {1,0,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,1,0,1,1},
    	    {1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,1,0,0,1},
    	    {1,0,1,0,1,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1},
    	    {1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1},
    	    {1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1},
    	    {1,0,1,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1},
    	    {1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
    	    {1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
    	    {1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1},
    	    {1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1},
    	    {1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1},
    	    {1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1},
    	    {1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,0,1},
    	    {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1},
    	    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    	};
    
    public Tablero() {
        setSize(1500, 1100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        jugador = new Jugador(50, 50, 30, 30, Color.GREEN);

        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setBackground(Color.BLACK);
                for (int fila = 0; fila < laberinto.length; fila++) {
                    for (int col = 0; col < laberinto[0].length; col++) {
                        if (laberinto[fila][col] == 1) {
                            g.setColor(Color.BLUE);
                            g.fillRect(col * pared, fila * pared, pared, pared);
                        }
                    }
                }
	            jugador.dibujar(g);
            }
        };

        add(panelDibujo, BorderLayout.CENTER);

        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(e -> {jugador.x = 50; jugador.y = 50; panelDibujo.repaint(); this.requestFocus();});
        
        add(btnReiniciar, BorderLayout.SOUTH);

        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int nuevaX = jugador.x;
        int nuevaY = jugador.y;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> nuevaX -= pared;
            case KeyEvent.VK_RIGHT -> nuevaX += pared;
            case KeyEvent.VK_UP -> nuevaY -= pared;
            case KeyEvent.VK_DOWN -> nuevaY += pared;
        }

        int col = nuevaX / pared;
        int fila = nuevaY / pared;

        if (fila >= 0 && fila < laberinto.length && col >= 0 && col < laberinto[0].length) {
            if (laberinto[fila][col] == 0) {
                jugador.x = nuevaX;
                jugador.y = nuevaY;
            }
        }
        if (laberinto[fila][col] == 2) {
            JOptionPane.showMessageDialog(this, "¡Ganaste!");
            jugador.reiniciar();
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

 class Jugador {
    public int x, y, ancho, alto;
    public Color color;
	private Image imagenJugador;

    public Jugador(int x, int y, int ancho, int alto, Color color) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.imagenJugador = new ImageIcon("peon.png").getImage();

    }

    public void dibujar(Graphics g) {
    	g.drawImage(imagenJugador, x, y, ancho, alto, null);

    }

    public void reiniciar() {
        this.x = 50;
        this.y = 50;
    }
}
