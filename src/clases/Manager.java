package clases;

public class Manager extends Empleado {
    protected int personasACargo;

    public Manager (String dni, String nombre, int edad, double salario, int antiguedad, int personasACargo) {
        super (dni, nombre, edad, salario, antiguedad);
        this.personasACargo = personasACargo;
    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

}