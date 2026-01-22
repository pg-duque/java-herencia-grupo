package clases;

abstract class Persona {


    private String dni;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String telefono;
    private String email;

    public Persona(String dni, String nombre, int edad, String fechaNacimiento, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona(String dni, String nombre, int edad) {
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

    public int getEdad () {
        return edad;
    }

    public int calcularEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return String.format("Datos de la persona: %s, %s, %d, %s, %s, %s", this.nombre, this.dni, this.edad, this.fechaNacimiento, this.telefono, this.email);
    }


}