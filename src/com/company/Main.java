package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Prenda camperaDeJuan = new Prenda("uniqlo", "tal");
        Prenda camperaDeMeli = new Prenda("rapsodia", "tal otra");
        Prenda mochilaDeJuan = new Prenda("acme", "negra");
        Prenda carteraDeMeli = new Prenda("cartera", "acme");
        Prenda camperaDeImanol = new Prenda("adidas", "acme");
        Prenda mochilaDeImanol = new Prenda("adidas", "negra");
        Prenda mochilaDeLautaro = new Prenda("nike", "negra");

        List<Prenda> prendasJuanMeli = new ArrayList<Prenda>();
        List<Prenda> prendasImaLau = new ArrayList<Prenda>();

        prendasJuanMeli.add(camperaDeJuan);
        prendasJuanMeli.add(camperaDeMeli);
        prendasJuanMeli.add(mochilaDeJuan);
        prendasJuanMeli.add(carteraDeMeli);

        prendasImaLau.add(camperaDeImanol);
        prendasImaLau.add(mochilaDeImanol);
        prendasImaLau.add(mochilaDeLautaro);

        GuardaRopa teatroArgentino = new GuardaRopa();

        teatroArgentino.guardarPrendas(prendasJuanMeli);

        teatroArgentino.guardarPrendas(prendasImaLau);

        teatroArgentino.mostrarPrendasPorIdentificador(1);






    }
}
