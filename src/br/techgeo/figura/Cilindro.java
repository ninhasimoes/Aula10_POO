package br.techgeo.figura;

import br.techgeo.ponto.Ponto;

public class Cilindro extends Figura{
    private double raio;
    private double altura;
    private Ponto ponto;

    public Cilindro(double raio, double altura, Ponto ponto) {
        this.raio = raio;
        this.altura = altura;
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double calcularArea(){
        return  2*Math.PI*raio*(raio+altura);
    }

    public double calcularVolume(){
        return  Math.PI*Math.pow(raio,2)*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "raio=" + raio +
                ", altura=" + altura +
                ", ponto=" + ponto +
                '}';
    }
}
