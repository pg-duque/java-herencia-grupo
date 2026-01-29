package clases;

import clases.Empleado;
import java.util.List;
import java.util.ArrayList;

public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private String nivel; // "Junior", "Mid", "Senior"
    private List<String> tecnologias;
    private double horasExtra;

    public Desarrollador(String dni, String nombre, int edad, double salario_base, int antiguedadAnios, String lenguajePrincipal, String nivel){
        super(dni, nombre, edad, salario_base, antiguedadAnios);
        this.lenguajePrincipal = lenguajePrincipal;
        this.nivel = nivel;
        this.tecnologias = new ArrayList<>();
        this.horasExtra = 0.0;
    }

    public String getLenguajePrincipal(){return lenguajePrincipal; }

    public void setLenguajePrinipal(){this.lenguajePrincipal = lenguajePrincipal;}

    public String getNivel(){return nivel; }

    public void setNivel(String nivel){this.nivel = nivel; }

    public List<String> getTecnologias(){return tecnologias; }

    public void agregarTecnologia(String tecnologia){this.tecnologias.add(tecnologia); }

    public double getHorasExtra(){return horasExtra; }

    public void registrarHoraExtra(double horas){this.horasExtra += horas; }

    @Override
    public double calcularSalario(){
        double bono = salario_base * antiguedadAnios * 0.05;
        double salarioBase = salario_base + bono;
        
        // Plus por nivel
        double plusNivel = 0.0;
        if(nivel.equals("Mid")){
            plusNivel = salarioBase * 0.15;
        } else if(nivel.equals("Senior")){
            plusNivel = salarioBase * 0.30;
        }
        
        // Pago horas extra (20€/hora)
        double pagoHorasExtra = horasExtra * 20.0;
        
        return salarioBase + plusNivel + pagoHorasExtra;
    }

    @Override
    public String mostrar(){
        return System.out.prinln("El desarrollador: " + super.getNombre() + " con DNI: " + super.getDni() +
         " trabaja con el lenguaje: " + this.lenguajePrincipal + " nivel: " + this.nivel + 
         " su salario es: " + calcularSalario() );
    }
}