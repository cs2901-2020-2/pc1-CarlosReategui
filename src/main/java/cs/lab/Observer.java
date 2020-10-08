package cs.lab;

import java.util.logging.Logger;

public abstract class Observer {
    protected RegistraApp registraApp;
    static final Logger logger = Logger.getLogger(Observer.class.getName());
    public abstract void update();
}