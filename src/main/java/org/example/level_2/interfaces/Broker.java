package org.example.level_2.interfaces;

public interface Broker {

    void addObserver(Agency agency);
    void removeObserver(Agency agency);
    void notifyObservers(String stockMarketUpdate);

}