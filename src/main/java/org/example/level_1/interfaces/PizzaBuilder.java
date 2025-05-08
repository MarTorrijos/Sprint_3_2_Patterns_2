package org.example.level_1.interfaces;

import org.example.level_1.model.Pizza;

public interface PizzaBuilder {
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}