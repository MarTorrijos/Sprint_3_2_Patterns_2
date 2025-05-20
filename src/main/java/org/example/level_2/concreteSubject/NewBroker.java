package org.example.level_2.concreteSubject;

import org.example.level_2.interfaces.Agency;
import org.example.level_2.interfaces.Broker;

import java.util.ArrayList;
import java.util.List;

public class NewBroker implements Broker {

    private List<Agency> agencies = new ArrayList<>();

    @Override
    public void addObserver(Agency agency) {
        agencies.add(agency);
    }

    @Override
    public void removeObserver(Agency agency) {
        agencies.remove(agency);
    }

    @Override
    public void notifyObservers(String stockMarketUpdate) {
        for (Agency agency : agencies) {
            agency.update(stockMarketUpdate);
        }
    }


}