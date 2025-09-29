package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Incidencia {
    private int id;
    private LocalDate fecha;
    private String hora;
    private String usuario;
    private String excepcion;

    public Incidencia( int id, String usuario, LocalDate fecha, String hora, String excepcion) {
        this.excepcion = excepcion;
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
        this.usuario = usuario;
    }

    public String getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "excepcion='" + excepcion + '\'' +
                ", id=" + id +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
