package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class RegistraApp {

    private final List<Observer> observers = new ArrayList<>();
    private Clase clase;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
        notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(Observer::update);
    }

}