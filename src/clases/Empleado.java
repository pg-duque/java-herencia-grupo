package clases;

import clases.Persona;

public class Empleado extends Persona {

    protected double salario_base;
    protected int antiguedadAnios;

    public Empleado(String dni, String nombre, int edad, double salario_base, int antiguedadAnios){
        super(dni, nombre, edad);
        this.salario_base = salario_base;
        this.antiguedadAnios = antiguedadAnios;
    }

    public double getSalario_base(){
        return salario_base;
    }

    public void setSalario_base(double salario_base){
        this.salario_base = salario_base;
    }

    public int getAntiguedadAnios(){
        return antiguedadAnios;
    }

    public void setAntiguedadAnios(int antiguedadAnios){
        this.antiguedadAnios = antiguedadAnios;
    }

    public double calcularSalario(){
        double bono = salario_base * antiguedadAnios * 0.05;
        return salario_base + bono;
    }

    @Override
    public String toString(){
        return super.toString() + ", Salario Base: " + salario_base + ", Antiguedad (años): " + antiguedadAnios;
    }
}