package ClubDeportivo;

import java.time.LocalDate;

public class Socios {
    static int contador = 0;
    private int idSocio;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private int num_documento;
    private LocalDate fecha_nacimiento;

    public int getIdSocio() {
        return idSocio;
    }
    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApaterno() {
        return apaterno;
    }
    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }
    public String getAmaterno() {
        return amaterno;
    }
    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }
    public int getNum_documento() {
        return num_documento;
    }
    public void setNum_documento(int num_documento) {
        this.num_documento = num_documento;
    }
    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Id Socio: " + idSocio + "\n"
                +"Nombre: " + nombre + " " + apaterno + " " + amaterno + "\n"
                + "Documento: " + num_documento + "\n"
                + "Fecha de nacimiento: " + fecha_nacimiento;
    }

    public Socios (int idSocio, String nombre, String apaterno, String amaterno, int num_documento, LocalDate fecha_nacimiento) {
        this.idSocio = ++contador;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.num_documento = num_documento;
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
