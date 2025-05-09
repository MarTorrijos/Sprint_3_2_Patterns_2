package org.example.level_1.builder;

import org.example.level_1.enums.DoughType;
import org.example.level_1.enums.PizzaSize;
import org.example.level_1.product.Pizza;

import java.util.Arrays;

public class TomatoPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public TomatoPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize(PizzaSize.MEDIUM);
    }

    @Override
    public void buildDough() {
        pizza.setDough(DoughType.THIN);
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(Arrays.asList("Salsa de tomate", "Queso", "Tomate confitado", "Rodajas de tomate"));
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

}