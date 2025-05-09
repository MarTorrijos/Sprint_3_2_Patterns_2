package org.example.level_1;

import org.example.level_1.concreteBuilder.HawaiianPizzaBuilder;
import org.example.level_1.product.Pizza;
import org.example.level_1.director.PizzaMaker;
import org.example.level_1.concreteBuilder.TomatoPizzaBuilder;

public class Main {

    public static void main(String[] args) {

        HawaiianPizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaMaker hawaiianMaker = new PizzaMaker(hawaiianBuilder);

        hawaiianMaker.buildPizza();
        Pizza hawaiianPizza = hawaiianBuilder.getPizza();

        System.out.println("PIZZA HAWAIANA:\n" + hawaiianPizza);

        System.out.println("_____________________________________________");

        TomatoPizzaBuilder tomatoBuilder = new TomatoPizzaBuilder();
        PizzaMaker tomatoMaker = new PizzaMaker(tomatoBuilder);

        tomatoMaker.buildPizza();
        Pizza tomatoPizza = tomatoBuilder.getPizza();

        System.out.println("PIZZA DE TOMATE:\n" + tomatoPizza);

    }

}