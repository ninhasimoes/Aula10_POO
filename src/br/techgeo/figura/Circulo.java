package br.techgeo.figura;

import br.techgeo.ponto.Ponto;

public class Circulo extends Figura{
    private double raio;
    private Ponto ponto;

    public Circulo(double raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(raio,2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", ponto=" + ponto +
                '}';
    }
}
