package cs.lab;

public class CounterDocentes extends Observer {

    public CounterDocentes(RegistraApp app) {
        this.registraApp = app;
        this.registraApp.addObserver(this);
    }

    @Override
    public void update() {
        logger.info("CE2A ha sido notificado de " + registraApp.getClase().getFormattedClass());
    }
    
}