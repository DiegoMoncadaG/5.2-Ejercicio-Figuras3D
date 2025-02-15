package Figuras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton btnCilindro, btnEsfera, btnPiramide;
    private Font fuente;

    public VentanaPrincipal() {
        fuente = new Font("Berlin Sans FB", Font.PLAIN, 13);
        inicio();
        setTitle("Figuras Geométricas");
        setSize(390, 160);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(229, 244, 240));

        btnCilindro = new JButton("Cilindro");
        btnCilindro.setBounds(18, 50, 100, 30);
        btnCilindro.setFont(fuente);
        btnCilindro.setBackground(new Color(189, 207, 205));
        btnCilindro.setForeground(Color.BLACK);
        btnCilindro.addActionListener(this);

        btnEsfera = new JButton("Esfera");
        btnEsfera.setBounds(138, 50, 100, 30);
        btnEsfera.setFont(fuente);
        btnEsfera.setBackground(new Color(189, 207, 205));
        btnEsfera.setForeground(Color.BLACK);
        btnEsfera.addActionListener(this);

        btnPiramide = new JButton("Pirámide");
        btnPiramide.setBounds(258, 50, 100, 30);
        btnPiramide.setFont(fuente);
        btnPiramide.setBackground(new Color(189, 207, 205));
        btnPiramide.setForeground(Color.BLACK);
        btnPiramide.addActionListener(this);

        contenedor.add(btnCilindro);
        contenedor.add(btnEsfera);
        contenedor.add(btnPiramide);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == btnEsfera) {
            new VentanaEsfera().setVisible(true);
        }
        if (evento.getSource() == btnCilindro) {
            new VentanaCilindro().setVisible(true);
        }
        if (evento.getSource() == btnPiramide) {
            new VentanaPirámide().setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}
