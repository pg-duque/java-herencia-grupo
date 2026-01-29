package clases;

import java.time.LocalDate;

public class Fichaje {
    private int idFichaje;
    private int idEmpleado;
    private LocalDate fechaHoraEntrada;
    private LocalDate fechaHoraSalida;
    private TipoFichaje tipoFichaje;

    public Fichaje(int idFichaje, int idEmpleado, LocalDate fechaHoraEntrada, LocalDate fechaHoraSalida, TipoFichaje tipoFichaje) {
        this.idFichaje = idFichaje;
        this.idEmpleado = idEmpleado;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
        this.tipoFichaje = tipoFichaje;
    }

    public Fichaje(int idFichaje, int idEmpleado, LocalDate fechaHoraEntrada, TipoFichaje tipoFichaje) {
        this.idFichaje = idFichaje;
        this.idEmpleado = idEmpleado;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.tipoFichaje = tipoFichaje;
    }

    public Fichaje() {

    }

    public int getIdFichaje() {
        return idFichaje;
    }

    public void setIdFichaje(int idFichaje) {
        this.idFichaje = idFichaje;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDate getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(LocalDate fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public LocalDate getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDate fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public TipoFichaje getTipoFichaje() {
        return tipoFichaje;
    }

    public void setTipoFichaje(TipoFichaje tipoFichaje) {
        this.tipoFichaje = tipoFichaje;
    }
}
