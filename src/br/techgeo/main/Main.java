package br.techgeo.main;

import br.techgeo.figura.*;
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
        c.add(new Cubo());

        for (Figura i: c){
            System.out.println(i);
            System.out.println("Área = "+i.calcularArea());
            //instancia de
            //pergunta se é filho de volume, as classes que forem filhas já irão ser destinadas, sem precisar de diversos ifs
            if (i instanceof Volume){
                //converteu o objeto do tipo figura para cilindro aonde podemos acessar o metodo
                System.out.println("Volume = "+((Volume) i).calcularVolume());
            }
            System.out.println();
        }







    }
}
