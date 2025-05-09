package org.example.level_1.concreteBuilder;

import org.example.level_1.builder.PizzaBuilder;
import org.example.level_1.enums.DoughType;
import org.example.level_1.enums.PizzaSize;
import org.example.level_1.product.Pizza;

import java.util.Arrays;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize(PizzaSize.JUMBO3XL);
    }

    @Override
    public void buildDough() {
        pizza.setDough(DoughType.STUFFED_CRUST);
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(Arrays.asList("Salsa de tomate", "Queso", "Jamón", "Cebolla", "Mucha piña"));
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

}