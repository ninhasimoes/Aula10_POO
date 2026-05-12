package br.techgeo.main;

import br.techgeo.figura.Cilindro;
import br.techgeo.figura.Circulo;
import br.techgeo.figura.Figura;
import br.techgeo.ponto.Ponto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //quando n especificado o tipo <> do objeto ele se tornar object
        //criamos a classe mãe para conseguir acessar os mesmos atributos
        ArrayList<Figura> c = new ArrayList<>();//polimorfismo (precisa da herança)

        c.add(new Circulo(2, new Ponto(1,1)));
        c.add(new Cilindro(3,3,new Ponto(3,3)));
        c.add(new Circulo(2, new Ponto(1,1)));
        c.add(new Cilindro(3,3,new Ponto(3,3)));

        for (Figura i: c){
            System.out.println(i);
            System.out.println("Área = "+i.calcularArea());
        }







    }
}
