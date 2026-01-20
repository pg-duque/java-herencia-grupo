public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String lenguajePrincipal){
        super(dni, nombre, edad, salario_base, antiguedadAnios);
        this.lenguajePrincipal = lenguajePrincipal;

    }

    public String getLenguajePrincipal(){return lenguajePrincipal; }

    public void setLenguajePrinipal(){this.lenguajePrincipal;}

    public double calcularSalario(){
        double salario = salario_base * antiguedadAnios * 0.05;
        return salario_base + bono;
    }

    @Override
    public String mostrar(){
        return System.out.printf("El desarrollador: " + super.getNombre() + ", con DNI: " + super.getDni() +
         ", trabaja con el lenguaje: " + this.lenguajePrincipal + "y su salario es: " + calcucalcularSalario() );
    }
}