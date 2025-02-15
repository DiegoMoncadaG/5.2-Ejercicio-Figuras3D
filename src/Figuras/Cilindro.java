package Figuras;

public class Cilindro extends FiguraGeométrica {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        return Math.PI * altura * Math.pow(radio, 2.0);
    }

    public double calcularSuperficie() {
        return 2.0 * Math.PI * radio * (altura + radio);
    }
}
