package clases;

import clases.Empleado;

public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String dni, String nombre, int edad, double salario_base, int antiguedadAnios, String lenguajePrincipal){
        super(dni, nombre, edad, salario_base, antiguedadAnios);
        this.lenguajePrincipal = lenguajePrincipal;

    }

    public String getLenguajePrincipal(){return lenguajePrincipal; }

    public void setLenguajePrinipal(){this.lenguajePrincipal = lenguajePrincipal;}

    public double calcularSalario(){
        double bono = salario_base * antiguedadAnios * 0.05;
        return salario_base + bono;
    }

    @Override
    public String mostrar(){
        return System.out.prinln("El desarrollador: " + super.getNombre() + " con DNI: " + super.getDni() +
         " trabaja con el lenguaje: " + this.lenguajePrincipal + " su salario es: " + calcularSalario() );
    }
}