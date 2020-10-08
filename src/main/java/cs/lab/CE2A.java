package cs.lab;

public class CE2A extends Observer {

    public CE2A(RegistraApp app) {
        this.registraApp = app;
        this.registraApp.addObserver(this);
    }

    @Override
    public void update() {
        logger.info("CE2A ha sido notificado de " + registraApp.getClase().getFormattedClass());
    }

}