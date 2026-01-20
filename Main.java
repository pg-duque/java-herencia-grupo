import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("12345678A", "Juan Perez", 30, 2000.0, 5);
        Desarrollador desarrollador = new Desarrollador("87654321B", "Ana Gomez", 28, 2500.0, 3);
        Manager manager = new Manager("11223344C", "Carlos Ruiz", 35, 3000.0, 7);

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