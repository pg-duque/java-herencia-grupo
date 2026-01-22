package clases;

import java.util.List;
import java.util.ArrayList;

public class Departamento {
    public String nombre;
    public String jefeDepartamento;
    public double presupuestoAnual;
    public List<String> empleados;

    public Departamento() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String idEmpleado) {
        empleados.add(idEmpleado);
    }

    public double calcularNominaDepartamento(GestorEmpleados gestor) {
        double total = 0.0;
        for (String id : empleados) {
            total += gestor.getSalario(id);
        }
        return total;
    }

    public List<String> listarEmpleados() {
        return empleados;
    }
}

