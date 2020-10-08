package cs.lab;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {

    static final Logger logger = Logger.getLogger(App.class.getName());
// https://utec.zoom.us/rec/share/

    public static void main(String[] args) throws InvalidCourseFormatException {
        RegistraApp app = new RegistraApp();

        String semestre;
        String codigo;
        String idioma;
        String curso;
        String seccion;
        String semana;
        String profesor;
        String date;
        String hours;
        String type;
        String url;

        Scanner input = new Scanner(System.in);

        logger.info("Ingrese un semestre: ");
        semestre = input.next();

        logger.info("Ingrese un código: ");
        codigo = input.next();

        logger.info("Ingrese un idioma: ");
        idioma = input.next();

        logger.info("Ingrese un curso: ");
        curso = input.next();

        logger.info("Ingrese una seccion: ");
        seccion = input.next();

        logger.info("Ingrese una semana: ");
        semana = input.next();

        logger.info("Ingrese una profesor: ");
        profesor = input.next();

        logger.info("Ingrese un día: ");
        date = input.next();

        logger.info("Ingrese las horas del curso: ");
        hours = input.next();

        logger.info("Ingrese el tipo del curso: ");
        type = input.next();

        logger.info("Ingrese el url del curso");
        url = input.next();

        Clase clase = new Clase(semestre, codigo, idioma, curso, seccion, semana, profesor, date, hours, type, url);

        new CE2A(app);
        new CounterDocentes(app);
        new CounterAlumnos(app);
        new DGA(app);
        app.setClase(clase);

        logger.info("El curso se ha guardado con éxito");
    }

}
