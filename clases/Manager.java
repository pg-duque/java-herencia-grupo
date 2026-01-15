public class Manager extends Persona {
    protected int personasACargo;

    public Manager (String dni, String nombre, String edad, int personasACargo) {
        super (dni, nombre, edad);
        this.personasACargo = personasACargo;
    }
}