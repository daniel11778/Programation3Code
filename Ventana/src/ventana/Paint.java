package ventana;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Paint extends JFrame implements MouseListener,MouseMotionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private List<Point> puntos = new ArrayList<>();
    private List<Trazo> trazos = new ArrayList<>();
    private Color colorActual = Color.BLACK; 
    private JPanel panel; 
    private int grosor = 3;
    private int tool = 0;
    private List<Figura> figuras = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint frame = new Paint();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Paint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                
                for (Trazo trazo : trazos) {
                    g2.setColor(trazo.color);
                    g2.setStroke(new BasicStroke(trazo.grosor)); 
                    for (int i = 1; i < trazo.puntos.size(); i++) {
                        Point p1 = trazo.puntos.get(i - 1);
                        Point p2 = trazo.puntos.get(i);
                        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
                for (Figura figura : figuras) {
                    g2.setColor(figura.color);
                    if (figura.esCirculo) {
                        g2.drawOval(figura.x, figura.y, figura.w, figura.h);
                    } else {
                        g2.drawRect(figura.x, figura.y, figura.w, figura.h);
                    }
                }

            }

		};
		
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this); 
        panel.setBackground(Color.white);
		panel.setBounds(257, 11, 717, 539);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		contentPane.add(panel);
		

		
		JPanel panel_1 = new JPanel();
		
		panel_1.setBounds(10, 11, 237, 539);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSlider sliderGrosor = new JSlider(JSlider.HORIZONTAL, 1, 20, 3);
		sliderGrosor.setBounds(47, 73, 150, 20);
		panel_1.add(sliderGrosor);
		sliderGrosor.addChangeListener(new ChangeListener() {
		    @Override
		    public void stateChanged(ChangeEvent e) {
		        grosor = sliderGrosor.getValue();  
		        panel.repaint();
		    }
		});
		
		JPanel panel_2 = new JPanel();
		
		panel_2.setBounds(10, 300, 217, 228);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 3, 10, 10));
		
		JButton btnBorrarTodo = new JButton("Borrar Todo");
		btnBorrarTodo.setBounds(47, 260, 130, 30); 
		panel_1.add(btnBorrarTodo);

		btnBorrarTodo.addActionListener(e -> {
		    trazos.clear();
		    figuras.clear();
		    puntos.clear();
		    panel.repaint();
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(e -> colorActual = new Color(255,0,0));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(e -> colorActual = new Color(255, 255, 128));
		btnNewButton.setBackground(new Color(255, 255, 128));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(e -> colorActual = new Color(255, 128, 255));
		btnNewButton_2.setBackground(new Color(255, 128, 255));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(e -> colorActual = new Color(0, 64, 0));
		btnNewButton_3.setBackground(new Color(0, 64, 0));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(e -> colorActual = new Color(64, 0, 128));
		btnNewButton_4.setBackground(new Color(64, 0, 128));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(e -> colorActual = new Color(0, 64, 128));
		btnNewButton_5.setBackground(new Color(0, 64, 128));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(e -> colorActual = new Color(128, 255, 128));
		btnNewButton_6.setBackground(new Color(128, 255, 128));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(e -> colorActual = new Color(128, 128, 0));
		btnNewButton_7.setBackground(new Color(128, 128, 0));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(e -> colorActual = new Color(255, 0, 128));
		btnNewButton_8.setBackground(new Color(255, 0, 128));
		panel_2.add(btnNewButton_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(47, 104, 146, 62);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 10, 10));
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(e -> tool = 0);
		Image usuarioImg1= new ImageIcon("pincel.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon1 = new ImageIcon(usuarioImg1);
		btnNewButton_9.setIcon(usuarioIcon1);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(e -> tool = 1);
		Image usuarioImg2= new ImageIcon("borrador.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon2 = new ImageIcon(usuarioImg2);
		btnNewButton_10.setIcon(usuarioIcon2);
		panel_3.add(btnNewButton_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 199, 217, 50);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 10, 10));
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(e -> tool = 5);
		Image usuarioImg3= new ImageIcon("triangulo.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon3 = new ImageIcon(usuarioImg3);
		btnNewButton_11.setIcon(usuarioIcon3);
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(e -> tool = 4);
		Image usuarioImg4= new ImageIcon("circulo.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon4 = new ImageIcon(usuarioImg4);
		btnNewButton_12.setIcon(usuarioIcon4);
		panel_4.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(e -> tool = 2);
		Image usuarioImg5= new ImageIcon("cuadrado.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon5 = new ImageIcon(usuarioImg5);
		btnNewButton_13.setIcon(usuarioIcon5);
		panel_4.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(e -> tool = 3);
		Image usuarioImg6= new ImageIcon("dospuntos.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon6 = new ImageIcon(usuarioImg6);
		btnNewButton_14.setIcon(usuarioIcon6);
		panel_4.add(btnNewButton_14);
		
		JLabel lblNewLabel = new JLabel("HERRAMIENTAS");
		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 217, 34);
		panel_1.add(lblNewLabel);

	}
	
	class Figura {
	    int x, y, w, h;
	    Color color;
	    boolean esCirculo;

	    public Figura(int x, int y, int w, int h, Color color) {
	        this.x = x;
	        this.y = y;
	        this.w = w;
	        this.h = h;
	        this.color = color;
	        this.esCirculo = false;
	    }

	    public Figura(int x, int y, int w, int h, Color color, boolean esCirculo) {
	        this(x, y, w, h, color);
	        this.esCirculo = esCirculo;
	    }
	}
	
	class Trazo {
	    List<Point> puntos;
	    int grosor;
	    Color color;
	    public Trazo(int grosor,Color color) {
	        this.puntos = new ArrayList<>();
	        this.grosor = grosor;
	        this.color = color;
	    }
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		 if (tool == 0 || tool == 1) { 
		        trazos.add(new Trazo(grosor, tool == 1 ? Color.WHITE : colorActual));
		        trazos.get(trazos.size() - 1).puntos.add(e.getPoint());
		    } else if (tool == 2) { 
		        figuras.add(new Figura(e.getX() - 22, e.getY(), 50, 50, colorActual));
		    } else if (tool == 3) { 
		            if (puntos.size() < 1) {
		                puntos.add(e.getPoint());
		            } else {
		                Point p1 = puntos.get(0);
		                Point p2 = e.getPoint();
		                trazos.add(new Trazo(grosor, colorActual));
		                trazos.get(trazos.size() - 1).puntos.add(p1);
		                trazos.get(trazos.size() - 1).puntos.add(p2);
		                puntos.clear();
		            }
		    } else if (tool == 4) { 
		        figuras.add(new Figura(e.getX() - 22, e.getY(), 50, 50, colorActual, true));
		    }
		    panel.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (tool == 0 || tool == 1) { 
		if (!trazos.isEmpty()) {
	        trazos.get(trazos.size() - 1).puntos.add(e.getPoint()); 
	        panel.repaint();
	    }
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
