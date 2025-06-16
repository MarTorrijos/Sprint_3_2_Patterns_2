package org.example.level_1.director;

import org.example.level_1.concreteBuilder.HawaiianPizzaBuilder;
import org.example.level_1.concreteBuilder.TomatoPizzaBuilder;
import org.example.level_1.model.Pizza;

public class PizzaMaker {

    public Pizza buildHawaiianPizza(HawaiianPizzaBuilder hawaiianPizza) {
        hawaiianPizza.buildSize();
        hawaiianPizza.buildDough();
        hawaiianPizza.buildToppings();
        return hawaiianPizza.getPIZZA();
    }

    public Pizza buildTomatoPizza(TomatoPizzaBuilder tomatoPizza) {
        tomatoPizza.buildSize();
        tomatoPizza.buildDough();
        tomatoPizza.buildToppings();
        return tomatoPizza.getPIZZA();
    }

}