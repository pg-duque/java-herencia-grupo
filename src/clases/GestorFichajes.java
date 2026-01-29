package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class GestorFichajes {
    Scanner sc = new Scanner(System.in);

    private Map<String, List<Fichaje>> fichajes;

    public GestorFichajes() {
        this.fichajes = new HashMap<>();
    }

    public void registrarEntrada () {
        int idFichaje = sc.pedirNumero("Introduce el ID del fichaje");
        int idEmpleado = sc.pdirNumero("Introduce tu ID de empleado");
        LocalDate fecha = LocalDate.parse(fechaHoraEntrada.toString());
        TipoFichaje tipoFichaje = TipoFichaje.ENTRADA;
        Fichaje fichaje = new Fichaje(idFichaje, idEmpleado, fechaHoraEntrada, tipoFichaje);
    }

    public void registrarSalida () {
        int idFichaje = sc.pedirNumero("Introduce el ID del fichaje");
        int idEmpleado = sc.pdirNumero("Introduce tu ID de empleado");
        LocalDate fecha = LocalDate.parse(fechaHoraEntrada.toString());
        TipoFichaje tipoFichaje = TipoFichaje.SALIDA;
        Fichaje fichaje = new Fichaje(idFichaje, idEmpleado, fechaHoraSalida, tipoFichaje);
    }

    public void obtenerFichajesDelDia () {

    }

    public void generarReporteAsistencia () {

    }

    public void generarReporteAsistencia () {

    }

}
