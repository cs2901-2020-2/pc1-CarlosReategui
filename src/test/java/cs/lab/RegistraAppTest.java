package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistraAppTest {

    @Test
    public void testCase0() throws InvalidCourseFormatException {
        long beginTime = System.currentTimeMillis();
        RegistraApp app = new RegistraApp();

        new CE2A(app);
        new CounterDocentes(app);
        new CounterAlumnos(app);
        new DGA(app);

        Clase clase = new Clase("2020-II", "CS2901", "ES", "Discretas", "1", "Semana05", "Jesus", "10/08", "08:00-10:00","Laboratorio", "https://utec.zoom.us/rec/share/");

        app.setClase(clase);

        long finalTime = System.currentTimeMillis();
        long executionTime = finalTime - beginTime;

        Assert.assertEquals(clase, app.getClase());
        Assert.assertTrue(executionTime < 500);
    }

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void testCase1() throws InvalidCourseFormatException {
        RegistraApp app = new RegistraApp();

        new CE2A(app);
        new CounterDocentes(app);
        new CounterAlumnos(app);
        new DGA(app);

        Clase clase = new Clase("2020-II", "CS2901", "ES", "Ingeniería de Software", "1", "Semana05", "Jesus", "10/08", "08:00-10:00","Laboratorio", "https://utec.zoom.us/rec/share/");

        app.setClase(clase);

        Assert.assertEquals(clase, app.getClase());
    }

    @Test(expectedExceptions = InvalidCourseFormatException.class)
    public void testCase2() throws InvalidCourseFormatException {
        long beginTime = System.currentTimeMillis();
        RegistraApp app = new RegistraApp();

        new CE2A(app);
        new CounterDocentes(app);
        new CounterAlumnos(app);
        new DGA(app);

        Clase clase = new Clase("2020-II", "CS2901", "DE", "Discretas", "1", "Semana05", "Jesus", "10/08", "08:00-10:00","Laboratorio", "https://utec.zoom.us/rec/share/");

        app.setClase(clase);

        long finalTime = System.currentTimeMillis();
        long executionTime = finalTime - beginTime;

        Assert.assertEquals(clase, app.getClase());
        Assert.assertTrue(executionTime < 500);
    }

    @Test(expectedExceptions = InvalidCourseFormatException.class)
    public void testCase3() throws InvalidCourseFormatException {
        RegistraApp app = new RegistraApp();

        new CE2A(app);
        new CounterDocentes(app);
        new CounterAlumnos(app);
        new DGA(app);

        Clase clase = new Clase("2020-II", "CS2901", "DE", "Discretas", "1", "Semana05", "Jesus", "10/08", "08:00-10:00","aasdas", "https://utec.zoom.us/rec/share/");

        app.setClase(clase);

        Assert.assertEquals(clase, app.getClase());
    }

}
