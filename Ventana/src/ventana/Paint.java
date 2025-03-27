package ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Paint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(257, 11, 717, 539);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 237, 539);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 300, 217, 228);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 3, 10, 10));
		
		JButton btnNewButton_1 = new JButton("");
		
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 128));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 128, 255));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(0, 64, 0));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(64, 0, 128));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(0, 64, 128));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(128, 255, 128));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(128, 128, 0));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(255, 0, 128));
		panel_2.add(btnNewButton_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(47, 104, 146, 62);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 10, 10));
		
		JButton btnNewButton_9 = new JButton("");
		Image usuarioImg1= new ImageIcon("pincel.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon1 = new ImageIcon(usuarioImg1);
		btnNewButton_9.setIcon(usuarioIcon1);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		Image usuarioImg2= new ImageIcon("borrador.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon2 = new ImageIcon(usuarioImg2);
		btnNewButton_10.setIcon(usuarioIcon2);
		panel_3.add(btnNewButton_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 199, 217, 50);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 10, 10));
		
		JButton btnNewButton_11 = new JButton("");
		Image usuarioImg3= new ImageIcon("triangulo.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon3 = new ImageIcon(usuarioImg3);
		btnNewButton_11.setIcon(usuarioIcon3);
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		Image usuarioImg4= new ImageIcon("circulo.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon4 = new ImageIcon(usuarioImg4);
		btnNewButton_12.setIcon(usuarioIcon4);
		panel_4.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		Image usuarioImg5= new ImageIcon("cuadrado.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon5 = new ImageIcon(usuarioImg5);
		btnNewButton_13.setIcon(usuarioIcon5);
		panel_4.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		Image usuarioImg6= new ImageIcon("rectangulo.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
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
}
