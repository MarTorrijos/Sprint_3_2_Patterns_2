package org.example.level_2;

import org.example.level_2.concreteObserver.NewAgency;
import org.example.level_2.concreteSubject.NewBroker;

public class Main {

    public static void main(String[] args) {

        NewAgency agency1 = new NewAgency("Tiburaos SA");
        NewAgency agency2 = new NewAgency("Torres asociados");
        NewBroker broker = new NewBroker();

        broker.addObserver(agency1);
        broker.addObserver(agency2);

        broker.notifyObservers("La bolsa baja");

        broker.removeObserver(agency1);

        System.out.println("\n" + agency1.getName() + " se ha borrado como observer\n");

        broker.notifyObservers("La bolsa sube");

    }

}