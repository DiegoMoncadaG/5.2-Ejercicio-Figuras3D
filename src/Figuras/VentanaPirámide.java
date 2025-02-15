package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPirámide extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, apotema, volumenLabel, superficieLabel, resultadoTitulo;
    private JTextField campoBase, campoAltura, campoApotema, resultadoVolumen, resultadoSuperficie;
    private JButton calcular;
    private Font fuente;

    public VentanaPirámide() {
        fuente = new Font("Berlin Sans FB", Font.PLAIN, 13);
        inicio();
        setTitle("Pirámide");
        setSize(290, 260);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(229, 244, 240));

        base = new JLabel("Base (cm):");
        base.setBounds(20, 15, 100, 20);
        base.setFont(fuente);
        base.setForeground(new Color(122, 175, 168));

        campoBase = new JTextField();
        campoBase.setBounds(120, 15, 120, 22);
        campoBase.setFont(fuente);
        campoBase.setBackground(new Color(206, 222, 220));
        campoBase.setForeground(new Color(81, 125, 119));
        campoBase.setHorizontalAlignment(JTextField.CENTER);

        altura = new JLabel("Altura (cm):");
        altura.setBounds(20, 45, 100, 20);
        altura.setFont(fuente);
        altura.setForeground(new Color(122, 175, 168));

        campoAltura = new JTextField();
        campoAltura.setBounds(120, 45, 120, 22);
        campoAltura.setFont(fuente);
        campoAltura.setBackground(new Color(206, 222, 220));
        campoAltura.setForeground(new Color(81, 125, 119));
        campoAltura.setHorizontalAlignment(JTextField.CENTER);

        apotema = new JLabel("Apotema (cm):");
        apotema.setBounds(20, 75, 100, 20);
        apotema.setFont(fuente);
        apotema.setForeground(new Color(122, 175, 168));

        campoApotema = new JTextField();
        campoApotema.setBounds(120, 75, 120, 22);
        campoApotema.setFont(fuente);
        campoApotema.setBackground(new Color(206, 222, 220));
        campoApotema.setForeground(new Color(81, 125, 119));
        campoApotema.setHorizontalAlignment(JTextField.CENTER);

        calcular = new JButton("Calcular");
        calcular.setBounds(84, 110, 100, 23);
        calcular.setFont(fuente);
        calcular.setBackground(new Color(189, 207, 205));
        calcular.setForeground(Color.BLACK);
        calcular.addActionListener(this);

        resultadoTitulo = new JLabel("Resultado:");
        resultadoTitulo.setBounds(105, 140, 100, 20);
        resultadoTitulo.setFont(fuente);
        resultadoTitulo.setForeground(new Color(90, 145, 130));

        volumenLabel = new JLabel("Volumen (cm³):");
        volumenLabel.setBounds(20, 165, 100, 20);
        volumenLabel.setFont(fuente);
        volumenLabel.setForeground(new Color(122, 175, 168));

        resultadoVolumen = new JTextField();
        resultadoVolumen.setBounds(120, 165, 120, 22);
        resultadoVolumen.setFont(fuente);
        resultadoVolumen.setEditable(false);
        resultadoVolumen.setBackground(new Color(206, 222, 220));
        resultadoVolumen.setForeground(new Color(81, 125, 119));
        resultadoVolumen.setHorizontalAlignment(JTextField.CENTER);

        superficieLabel = new JLabel("Superficie (cm²):");
        superficieLabel.setBounds(20, 195, 100, 20);
        superficieLabel.setFont(fuente);
        superficieLabel.setForeground(new Color(122, 175, 168));

        resultadoSuperficie = new JTextField();
        resultadoSuperficie.setBounds(120, 195, 120, 22);
        resultadoSuperficie.setFont(fuente);
        resultadoSuperficie.setEditable(false);
        resultadoSuperficie.setBackground(new Color(206, 222, 220));
        resultadoSuperficie.setForeground(new Color(81, 125, 119));
        resultadoSuperficie.setHorizontalAlignment(JTextField.CENTER);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(resultadoTitulo);
        contenedor.add(volumenLabel);
        contenedor.add(resultadoVolumen);
        contenedor.add(superficieLabel);
        contenedor.add(resultadoSuperficie);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            double base = Double.parseDouble(campoBase.getText());
            double altura = Double.parseDouble(campoAltura.getText());
            double apotema = Double.parseDouble(campoApotema.getText());

            Pirámide piramide = new Pirámide(base, altura, apotema);

            resultadoVolumen.setText(String.format("%.2f", piramide.calcularVolumen()));
            resultadoSuperficie.setText(String.format("%.2f", piramide.calcularSuperficie()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPirámide().setVisible(true));
    }
}
