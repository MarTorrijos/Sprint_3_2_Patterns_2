package org.example.level_1;

import org.example.level_1.concreteBuilder.HawaiianPizzaBuilder;
import org.example.level_1.model.Pizza;
import org.example.level_1.director.PizzaMaker;
import org.example.level_1.concreteBuilder.TomatoPizzaBuilder;

public class Main {

    public static void main(String[] args) {

        HawaiianPizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaMaker pizzaMaker = new PizzaMaker();

        pizzaMaker.buildHawaiianPizza(hawaiianBuilder);
        Pizza hawaiianPizza = hawaiianBuilder.getPIZZA();

        System.out.println("PIZZA HAWAIANA:\n" + hawaiianPizza);

        System.out.println("_____________________________________________");

        TomatoPizzaBuilder tomatoBuilder = new TomatoPizzaBuilder();

        pizzaMaker.buildTomatoPizza(tomatoBuilder);
        Pizza tomatoPizza = tomatoBuilder.getPIZZA();

        System.out.println("PIZZA DE TOMATE:\n" + tomatoPizza);

    }

}