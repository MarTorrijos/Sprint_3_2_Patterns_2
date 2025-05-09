package org.example.level_1.builder;

import org.example.level_1.product.Pizza;

public interface PizzaBuilder {
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}