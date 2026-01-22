package clases;

import java.time.LocalDate;
import java.util.UUID;

public class Empleado extends Persona {

    protected double salario_base;
    protected int antiguedadAnios;
    protected String idEmpleado;
    protected String departamento;
    protected double jornadaHoraria;
    protected boolean activo;
    protected LocalDate fecha_contratacion;


    public Empleado(String dni, String nombre, int edad, double salario_base, int antiguedadAnios, String idEmpleado, String departamento, double jornadaHoraria, boolean activo,  LocalDate fecha_contratacion) {
        super(dni, nombre, edad);
        this.salario_base = salario_base;
        this.antiguedadAnios = antiguedadAnios;
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
        this.fecha_contratacion = fecha_contratacion;
        this.jornadaHoraria = jornadaHoraria;
        this.activo = activo;

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


    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getJornadaHoraria() {
        return jornadaHoraria;
    }

    public void setJornadaHoraria(double jornadaHoraria) {
        this.jornadaHoraria = jornadaHoraria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(LocalDate fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public double calcularSalario(){
        double bono = salario_base * 0.03;
        return salario_base + bono;
    }

    public static void calcularAtiguedad(){

    }

    @Override
    public String toString(){
        return super.toString() + ", Salario Base: " + salario_base + ", Antiguedad (años): " + antiguedadAnios;
    }
}