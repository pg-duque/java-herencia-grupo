package clases;

import clases.Persona;

public class Manager extends Persona {
    protected int personasACargo;

    public Manager (String dni, String nombre, int edad, int personasACargo) {
        super (dni, nombre, edad);
        this.personasACargo = personasACargo;
    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

}