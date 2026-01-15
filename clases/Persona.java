abstract class Persona {

    private String dni;
    private String nombre;
    private Int edad;

    public Persona(String dni, String nombre, String edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Int getEdad () {
        return edad;
    }

    public void presentarse (String nombre, String dni, Int edad) {
        System.out.printf("Hola, mi nombre es %s, con DNI %s y tengo %d años");
    }


}