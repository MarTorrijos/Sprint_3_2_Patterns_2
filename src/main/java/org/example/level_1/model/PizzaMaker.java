package org.example.level_1.model;

import org.example.level_1.interfaces.PizzaBuilder;

public class PizzaMaker {

    private PizzaBuilder builder;

    public PizzaMaker(PizzaBuilder pizzaBuilder) {
        this.builder = pizzaBuilder;
    }

    public Pizza buildPizza() {
        builder.buildSize();
        builder.buildDough();
        builder.buildToppings();
        return builder.getPizza();
    }

}