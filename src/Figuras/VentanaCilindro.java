package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaCilindro extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel radio, altura, volumenLabel, superficieLabel, resultadoTitulo;
    private JTextField campoRadio, campoAltura, resultadoVolumen, resultadoSuperficie;
    private JButton calcular;
    private Font fuente;

    public VentanaCilindro() {
        fuente = new Font("Berlin Sans FB", Font.PLAIN, 13);
        inicio();
        setTitle("Cilindro");
        setSize(290, 240);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(229, 244, 240));

        radio = new JLabel("Radio (cm):");
        radio.setBounds(20, 15, 100, 20);
        radio.setFont(fuente);
        radio.setForeground(new Color(122, 175, 168));

        campoRadio = new JTextField();
        campoRadio.setBounds(120, 15, 120, 22);
        campoRadio.setFont(fuente);
        campoRadio.setBackground(new Color(206, 222, 220));
        campoRadio.setForeground(new Color(81, 125, 119));
        campoRadio.setHorizontalAlignment(JTextField.CENTER);

        altura = new JLabel("Altura (cm):");
        altura.setBounds(20, 45, 80, 20);
        altura.setFont(fuente);
        altura.setForeground(new Color(122, 175, 168));

        campoAltura = new JTextField();
        campoAltura.setBounds(120, 45, 120, 22);
        campoAltura.setFont(fuente);
        campoAltura.setBackground(new Color(206, 222, 220));
        campoAltura.setForeground(new Color(81, 125, 119));
        campoAltura.setHorizontalAlignment(JTextField.CENTER);

        calcular = new JButton("Calcular");
        calcular.setBounds(84, 80, 100, 23);
        calcular.setFont(fuente);
        calcular.setBackground(new Color(189, 207, 205));
        calcular.setForeground(Color.BLACK);
        calcular.addActionListener(this);

        resultadoTitulo = new JLabel("Resultado:");
        resultadoTitulo.setBounds(105, 110, 100, 20);
        resultadoTitulo.setFont(fuente);
        resultadoTitulo.setForeground(new Color(90, 145, 130));

        volumenLabel = new JLabel("Volumen (cm³):");
        volumenLabel.setBounds(20, 135, 100, 20);
        volumenLabel.setFont(fuente);
        volumenLabel.setForeground(new Color(122, 175, 168));

        resultadoVolumen = new JTextField();
        resultadoVolumen.setBounds(120, 135, 120, 22);
        resultadoVolumen.setFont(fuente);
        resultadoVolumen.setEditable(false);
        resultadoVolumen.setBackground(new Color(206, 222, 220));
        resultadoVolumen.setForeground(new Color(81, 125, 119));
        resultadoVolumen.setHorizontalAlignment(JTextField.CENTER);

        superficieLabel = new JLabel("Superficie (cm²):");
        superficieLabel.setBounds(20, 165, 100, 20);
        superficieLabel.setFont(fuente);
        superficieLabel.setForeground(new Color(122, 175, 168));

        resultadoSuperficie = new JTextField();
        resultadoSuperficie.setBounds(120, 165, 120, 22);
        resultadoSuperficie.setFont(fuente);
        resultadoSuperficie.setEditable(false);
        resultadoSuperficie.setBackground(new Color(206, 222, 220));
        resultadoSuperficie.setForeground(new Color(81, 125, 119));
        resultadoSuperficie.setHorizontalAlignment(JTextField.CENTER);

        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(resultadoTitulo);
        contenedor.add(volumenLabel);
        contenedor.add(resultadoVolumen);
        contenedor.add(superficieLabel);
        contenedor.add(resultadoSuperficie);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            double radio = Double.parseDouble(campoRadio.getText());
            double altura = Double.parseDouble(campoAltura.getText());

            Cilindro cilindro = new Cilindro(radio, altura);

            resultadoVolumen.setText(String.format("%.2f", cilindro.calcularVolumen()));
            resultadoSuperficie.setText(String.format("%.2f", cilindro.calcularSuperficie()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaCilindro().setVisible(true));
    }
}
