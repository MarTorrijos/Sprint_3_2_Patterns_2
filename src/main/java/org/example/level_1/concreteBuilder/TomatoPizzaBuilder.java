package org.example.level_1.concreteBuilder;

import org.example.level_1.interfaces.PizzaBuilder;
import org.example.level_1.enums.DoughType;
import org.example.level_1.enums.PizzaSize;
import org.example.level_1.model.Pizza;

import java.util.Arrays;

public class TomatoPizzaBuilder implements PizzaBuilder {

    private final Pizza PIZZA;

    public TomatoPizzaBuilder() {
        this.PIZZA = new Pizza();
    }

    @Override
    public void buildSize() {
        PIZZA.setSize(PizzaSize.MEDIUM);
    }

    @Override
    public void buildDough() {
        PIZZA.setDough(DoughType.THIN);
    }

    @Override
    public void buildToppings() {
        PIZZA.setToppings(Arrays.asList("Salsa de tomate", "Queso", "Tomate confitado", "Rodajas de tomate"));
    }

    @Override
    public Pizza getPIZZA() {
        return this.PIZZA;
    }

}