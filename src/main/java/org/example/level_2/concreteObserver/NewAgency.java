package org.example.level_2.concreteObserver;

import org.example.level_2.interfaces.Agency;

public class NewAgency implements Agency {

    private String name;

    public NewAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String stockMarketUpdate) {
        System.out.println(name + ", el mercado ha cambiado! " + stockMarketUpdate);
    }

}