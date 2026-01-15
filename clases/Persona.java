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

    @Override
        public String toString() {
            return String.format("Datos de la persona: %s, %s, %d", this.nombre, this.dni, this.edad);
        }


}