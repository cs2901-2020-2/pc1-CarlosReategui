package cs.lab;

public class Clase {

    private String semestre;
    private String codigo;
    private String idioma;
    private String curso;
    private String seccion;
    private String semana;
    private String profesor;
    private String date;
    private String hours;
    private String type;
    private String url;

    public Clase(String semestre, String codigo, String idioma, String curso, String seccion, String semana, String profesor, String date, String hours, String type, String url)  throws InvalidCourseFormatException {
        this.semestre = semestre;
        checkCodigo(codigo);
        checkIdioma(idioma);
        this.curso = curso;
        this.seccion = seccion;
        checkSemana(semana);
        checkProfesor(profesor);
        this.date = date;
        this.hours = hours;
        checkType(type);
        checkUrl(url);
    }

    public String getFormattedClass() {
        return semestre + " " + codigo + " " + idioma + " " + curso + ", " + seccion + ", " + semana + ", " +
                profesor + ", " + date + " " + hours + " " + type;
    }

    private static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }

    private void checkProfesor(String profesor) throws InvalidCourseFormatException {
        checkAlphaNumeric(isAlphaNumeric(profesor), "El nombre del profesor no es válido");
        this.profesor = profesor;
    }

    private void checkAlphaNumeric(boolean alphaNumeric, String s) throws InvalidCourseFormatException {
        if (!alphaNumeric) {
            throw new InvalidCourseFormatException(s);
        }
    }

    private void checkCodigo(String codigo) throws InvalidCourseFormatException {
        checkAlphaNumeric(isAlphaNumeric(codigo), "El código no es válido");
        this.codigo = codigo;
    }

    private void checkSemana(String semana) throws InvalidCourseFormatException {
        checkAlphaNumeric(isAlphaNumeric(semana), "La semana no es válida");
        this.semana = semana;
    }

    private void checkIdioma(String idioma) throws InvalidCourseFormatException {
        if (idioma.equals("EN") || idioma.equals("ES")) {
            this.idioma = idioma;
        } else {
            throw new InvalidCourseFormatException("El idioma no es válido");
        }
    }

    private void checkType(String type) throws InvalidCourseFormatException {
        if (type.equals("Laboratorio") || type.equals("Teoría")) {
            this.type = type;
        } else {
            throw new InvalidCourseFormatException("Tipo de sesión inválida");
        }
    }

    private void checkUrl(String url) throws InvalidCourseFormatException {
        checkAlphaNumeric(url.startsWith("https://utec.zoom.us/rec/share/"), "URL inválida");
        this.url = url;
    }

}
