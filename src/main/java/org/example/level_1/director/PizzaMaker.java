package org.example.level_1.director;

import org.example.level_1.interfaces.PizzaBuilder;
import org.example.level_1.model.Pizza;

public class PizzaMaker {

    private PizzaBuilder builder;

    public PizzaMaker(PizzaBuilder pizzaBuilder) {
        this.builder = pizzaBuilder;
    }

    public Pizza buildPizza() {
        builder.buildSize();
        builder.buildDough();
        builder.buildToppings();
        return builder.getPIZZA();
    }

}