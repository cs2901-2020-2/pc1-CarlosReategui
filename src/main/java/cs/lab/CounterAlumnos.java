package cs.lab;

public class CounterAlumnos extends Observer {

    public CounterAlumnos(RegistraApp app) {
        this.registraApp = app;
        this.registraApp.addObserver(this);
    }

    @Override
    public void update() {
        logger.info("CE2A ha sido notificado de " + registraApp.getClase().getFormattedClass());
    }
    
}