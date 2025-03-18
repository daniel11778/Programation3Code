package ventana;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ExamenU2 extends JFrame {

    public ExamenU2() {
        setTitle("Factura");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null); 

        JLabel encabezado = new JLabel("Factura en Java - NetBeans - ArrayList y POO", SwingConstants.CENTER);
        encabezado.setOpaque(true);
        encabezado.setBackground(new Color(0, 120, 215));
        encabezado.setForeground(Color.WHITE);
        encabezado.setFont(new Font("Arial", Font.BOLD, 18));
        encabezado.setBounds(0, 0, 900, 50);
        panelPrincipal.add(encabezado);

        JLabel subtitulo = new JLabel("[Sin base de datos]", SwingConstants.CENTER);
        subtitulo.setBounds(0, 55, 900, 20);
        panelPrincipal.add(subtitulo);

        JPanel panelCliente = new JPanel(new GridLayout(2, 4, 10, 10));
        panelCliente.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Datos del Cliente", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panelCliente.setBounds(20, 80, 850, 100);
        panelCliente.add(new JLabel("Documento"));
        panelCliente.add(new JTextField("34525234"));
        panelCliente.add(new JLabel("Nombres"));
        panelCliente.add(new JTextField("Homero sinso"));
        panelCliente.add(new JLabel("Dirección"));
        panelCliente.add(new JTextField("arco iris 130"));
        panelCliente.add(new JLabel("Teléfono"));
        panelCliente.add(new JTextField("613232343"));
        panelPrincipal.add(panelCliente);

        JPanel panelFactura = new JPanel(new GridLayout(1, 4, 10, 10));
        panelFactura.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Datos de Factura", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12)));
        panelFactura.setBounds(20, 190, 850, 60);
        panelFactura.add(new JLabel("No. Factura"));
        panelFactura.add(new JLabel("23432434234"));
        panelFactura.add(new JLabel("Fecha"));
        panelFactura.add(new JLabel("11/02/2006"));
        panelPrincipal.add(panelFactura);

        JPanel panelAcciones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelAcciones.setBounds(20, 260, 850, 50);
        JButton botonVerListado = new JButton("Ver listado de facturas");
        JButton botonAgregar = new JButton("Añadir");
        JButton botonEliminar = new JButton("Eliminar");
        panelAcciones.add(botonVerListado);
        panelAcciones.add(botonAgregar);
        panelAcciones.add(botonEliminar);
        panelPrincipal.add(panelAcciones);


        String[] nombresColumnas = {"Producto", "Cantidad", "Precio", "Total"};
        Object[][] datos = {
                {"Agua", "10", "12.00", "120"},
                {"Cereal", "21", "60.00", "1260"},
                {"Leche", "10", "23.00", "230"},
        };
        JTable tabla = new JTable(new DefaultTableModel(datos, nombresColumnas));
        JScrollPane scrollTabla = new JScrollPane(tabla);
        scrollTabla.setBounds(20, 320, 850, 68);
        panelPrincipal.add(scrollTabla);

        JPanel panelPrecios = new JPanel(new GridLayout(5, 2, 10, 10));
        panelPrecios.setBounds(20, 430, 850, 150);
        panelPrecios.add(new JLabel("Subtotal"));
        panelPrecios.add(new JLabel("1260.00"));
        panelPrecios.add(new JLabel("% de descuento"));
        panelPrecios.add(new JTextField("50"));
        panelPrecios.add(new JLabel("Valor descontado:"));
        panelPrecios.add(new JLabel("630.00"));
        panelPrecios.add(new JLabel("IVA 19%"));
        panelPrecios.add(new JLabel("129.00"));
        panelPrecios.add(new JLabel("Total factura"));
        panelPrecios.add(new JLabel("759.00"));
        panelPrincipal.add(panelPrecios);

        JPanel panelBotones = new JPanel();
        panelBotones.setBounds(20, 590, 850, 50);
        panelBotones.add(new JButton("Finalizar factura"));
        panelBotones.add(new JButton("Limpiar"));
        panelPrincipal.add(panelBotones);

        add(panelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
    	
    	new ExamenU2();
    }
}
