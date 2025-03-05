package ventana;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class gui extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui frame = new gui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public gui() {
        setTitle("Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1100, 650);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 64));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{200, 200, 0}; 
        gbl_contentPane.rowHeights = new int[]{30, 30, 150, 150, 0};
        gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JLabel lblNewLabel_8 = new JLabel("Registro De Usuarios");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_8.setForeground(new Color(255, 0, 0));
        GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
        gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_8.gridx = 0;
        gbc_lblNewLabel_8.gridy = 0;
        contentPane.add(lblNewLabel_8, gbc_lblNewLabel_8);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Datos Generales"));
        panel.setBackground(new Color(144, 238, 144));
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets(0, 0, 5, 5);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 1;
        contentPane.add(panel, gbc_panel);
        panel.setLayout(new GridLayout(6, 2, 10, 5));

        JLabel lblNewLabel = new JLabel("Nombre:");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel);

        textField = new JTextField();
        textField.setColumns(10);
        panel.add(textField);

        JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        panel.add(textField_1);

        JLabel lblNewLabel_2 = new JLabel("Apellido Materno:");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_2);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        panel.add(textField_2);

        JLabel lblNewLabel_3 = new JLabel("Fecha:");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_3);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        panel.add(textField_3);

        JLabel lblNewLabel_4 = new JLabel("Sexo:");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel_4);

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(144, 238, 144));
        panel.add(panelBotones);
        panelBotones.setLayout(new GridLayout(2, 1, 5, 5)); 

        JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
        panelBotones.add(rdbtnMasculino);

        JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
        rdbtnMasculino.setBackground(new Color(144, 238, 144));
        panelBotones.add(rdbtnFemenino);

        JLabel lblNewLabel_5 = new JLabel("Nacionalidad");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnFemenino.setBackground(new Color(144, 238, 144));
        panel.add(lblNewLabel_5);

        String[] opcionesNac = {"Peruano", "Mexicano", "Argentino"};
        JComboBox<String> comboSexo = new JComboBox<>(opcionesNac);
        panel.add(comboSexo);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 128, 192));
        panel_1.setBorder(BorderFactory.createTitledBorder("Perfil De Usuario"));
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.insets = new Insets(0, 0, 5, 0);
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 1;
        gbc_panel_1.gridy = 1;
        contentPane.add(panel_1, gbc_panel_1);
        GridBagLayout gbl_panel_1 = new GridBagLayout();
        gbl_panel_1.columnWidths = new int[]{225, 0};
        gbl_panel_1.rowHeights = new int[]{225, 0, 0, 0};
        gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
        gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_1.setLayout(gbl_panel_1);
        
        JLabel lblNewLabel_9 = new JLabel("");
        lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\danie\\Downloads\\download-removebg-preview (1).png"));
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
        gbc_lblNewLabel_9.anchor = GridBagConstraints.NORTHWEST;
        gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_9.gridx = 0;
        gbc_lblNewLabel_9.gridy = 0;
        panel_1.add(lblNewLabel_9);
                
        JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto De perfil");
        chckbxNewCheckBox.setBackground(new Color(255, 128, 192));
        GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
        gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
        gbc_chckbxNewCheckBox.gridx = 0;
        gbc_chckbxNewCheckBox.gridy = 1;
        panel_1.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
                
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha De Nacimiento");
        chckbxNewCheckBox_1.setBackground(new Color(255, 128, 192));
        GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
        gbc_chckbxNewCheckBox_1.gridx = 0;
        gbc_chckbxNewCheckBox_1.gridy = 2;
        panel_1.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(BorderFactory.createTitledBorder("Datos Opcionales"));

        panel_2.setBackground(new Color(255, 128, 192));
        GridBagConstraints gbc_panel_2 = new GridBagConstraints();
        gbc_panel_2.insets = new Insets(0, 0, 5, 5);
        gbc_panel_2.fill = GridBagConstraints.BOTH;
        gbc_panel_2.gridx = 0;
        gbc_panel_2.gridy = 2;
        contentPane.add(panel_2, gbc_panel_2);
        panel_2.setLayout(new GridLayout(2, 2, 5, 5)); 

        JLabel lblNewLabel_6 = new JLabel("Descripcion");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Preferencias");
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_7);

        TextArea textArea = new TextArea();
        textArea.setText("Hola Amigos de youtube, Aqui Andamos");
        textArea.setEditable(false);
        panel_2.add(textArea);
    
        String preferencias[] = {"Cantar", "Escuchar música", "Leer", "Deportes", "Otros"};
        JList list = new JList(preferencias);
        JScrollPane scroll = new JScrollPane(list);
        
        
        panel_2.add(scroll);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(BorderFactory.createLineBorder(Color.white));
        panel_3.setBackground(new Color(144, 238, 144));
        GridBagConstraints gbc_panel_3 = new GridBagConstraints();
        gbc_panel_3.insets = new Insets(0, 0, 5, 0);
        gbc_panel_3.fill = GridBagConstraints.BOTH;
        gbc_panel_3.gridx = 1;
        gbc_panel_3.gridy = 2;
        contentPane.add(panel_3, gbc_panel_3);
        GridBagLayout gbl_panel_3 = new GridBagLayout();
        gbl_panel_3.columnWidths = new int[]{264, 0};
        gbl_panel_3.rowHeights = new int[]{105, 105, 105, 0};
        gbl_panel_3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
        gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_3.setLayout(gbl_panel_3);
        
        JButton btnNewButton = new JButton("Nuevo");
        btnNewButton.setBackground(Color.gray);
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.anchor = GridBagConstraints.SOUTH;
        gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton.gridx = 0;
        gbc_btnNewButton.gridy = 0;
        panel_3.add(btnNewButton, gbc_btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Guardar");
        btnNewButton_1.setBackground(Color.gray);
        GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_1.gridx = 0;
        gbc_btnNewButton_1.gridy = 1;
        panel_3.add(btnNewButton_1, gbc_btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Salir");
        btnNewButton_2.setBackground(Color.gray);
        GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
        gbc_btnNewButton_2.anchor = GridBagConstraints.NORTH;
        gbc_btnNewButton_2.gridx = 0;
        gbc_btnNewButton_2.gridy = 2;
        panel_3.add(btnNewButton_2, gbc_btnNewButton_2);
    }
}