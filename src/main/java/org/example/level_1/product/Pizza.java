package org.example.level_1.product;

import org.example.level_1.enums.DoughType;
import org.example.level_1.enums.PizzaSize;

import java.util.List;

public class Pizza {

    private PizzaSize size;
    private DoughType dough;
    private List<String> toppings;

    public Pizza() {}

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setDough(DoughType dough) {
        this.dough = dough;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Tamaño: " + size.getDescription()
                + "\nMasa: " + dough.getDescription()
                + "\nIngredientes: " + toppings;
    }

}