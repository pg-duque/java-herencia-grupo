import clases.Desarrollador;
import clases.Empleado;
import clases.Manager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("12345678A", "Juan Perez", 30, 2000, "peruano@gmail.com");
        Desarrollador desarrollador = new Desarrollador("87654321B", "Ana Gomez", 28, 2500.0, 3, "Java");
        Manager manager = new Manager("11223344C", "Carlos Ruiz", 35, 55000, 25, 120);

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        empleados.add(desarrollador);
        empleados.add(manager);

        for (Empleado emp : empleados) {
            System.out.println("Tipo real del objeto: " + emp.getClass().getSimpleName());
            System.out.println("Presentación: " + emp.presentarse());
            System.out.println("Salario calculado: " + emp.calcularSalario());
            System.out.println("---");
        }
    }
}