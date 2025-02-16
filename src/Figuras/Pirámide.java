package Figuras;

public class Pirámide extends FiguraGeométrica {
    private double base;
    private double altura;
    private double apotema;

    public Pirámide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        return (Math.pow(base, 2.0) * altura) / 3.0;
    }

    public double calcularSuperficie() {
        return Math.pow(base, 2.0) + 2.0 * base * apotema;
    }
}
