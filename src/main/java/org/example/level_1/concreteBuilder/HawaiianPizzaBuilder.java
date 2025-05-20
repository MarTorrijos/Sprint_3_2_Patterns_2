package org.example.level_1.concreteBuilder;

import org.example.level_1.interfaces.PizzaBuilder;
import org.example.level_1.enums.DoughType;
import org.example.level_1.enums.PizzaSize;
import org.example.level_1.model.Pizza;

import java.util.Arrays;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private final Pizza PIZZA;

    public HawaiianPizzaBuilder() {
        this.PIZZA = new Pizza();
    }

    @Override
    public void buildSize() {
        PIZZA.setSize(PizzaSize.JUMBO3XL);
    }

    @Override
    public void buildDough() {
        PIZZA.setDough(DoughType.STUFFED_CRUST);
    }

    @Override
    public void buildToppings() {
        PIZZA.setToppings(Arrays.asList("Salsa de tomate", "Queso", "Jamón", "Cebolla", "Mucha piña"));
    }

    @Override
    public Pizza getPIZZA() {
        return this.PIZZA;
    }

}