package org.example.level_2.subject;

import org.example.level_2.observer.Agency;

public interface Broker {

    void addObserver(Agency agency);
    void removeObserver(Agency agency);
    void notifyObservers(String stockMarketUpdate);

}