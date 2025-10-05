package ClubDeportivo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Reservas {
    static int contador = 0;
    private int idReserva;
    private Socios socio;
    private Canchas cancha;
    private LocalDate fecha_reserva;
    private LocalDate fecha_partido;
    private LocalTime hora_partido;
    private double duracion_partido;
    private boolean pagoTotal;
    private String observaciones;
    private List<ServiciosExtras> extras;
    private Tarifas tarifaAplicada;

    public int getIdReserva() {
        return idReserva;
    }
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    public Socios getSocio() {
        return socio;
    }
    public void setSocio(Socios socio) {
        this.socio = socio;
    }
    public Canchas getCancha() {
        return cancha;
    }
    public void setCancha(Canchas cancha) {
        this.cancha = cancha;
    }
    public LocalDate getFecha_reserva() {
        return fecha_reserva;
    }
    public void setFecha_reserva(LocalDate fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }
    public LocalDate getFecha_partido() {
        return fecha_partido;
    }
    public void setFecha_partido(LocalDate fecha_partido) {
        this.fecha_partido = fecha_partido;
    }
    public LocalTime getHora_partido() {
        return hora_partido;
    }
    public void setHora_partido(LocalTime hora_partido) {
        this.hora_partido = hora_partido;
    }
    public double getDuracion_partido() {
        return duracion_partido;
    }
    public void setDuracion_partido(double duracion_partido) {
        this.duracion_partido = duracion_partido;
    }
    public boolean isPagoTotal() {
        return pagoTotal;
    }
    public void setPagoTotal(boolean pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public List<ServiciosExtras> getExtras() {
        return extras;
    }
    public void setExtras(List<ServiciosExtras> extras) {
        this.extras = extras;
    }
    public Tarifas getTarifaAplicada() {
        return tarifaAplicada;
    }
    public void setTarifaAplicada(Tarifas tarifaAplicada) {
        this.tarifaAplicada = tarifaAplicada;
    }

    @Override
    public String toString() {
        return "Id Reserva: " + idReserva + "\n" +
                "Socio: " + socio.getNombre() + " - " + "Documento: " + socio.getNum_documento() + "\n" +
                "Cancha: " + cancha.getNombre() + " - " + "Deporte: " + cancha.getDeporte() + "\n" +
                "Fecha de reserva: " + fecha_reserva + "\n" +
                "Fecha del partido: " + fecha_partido + "\n" +
                "Hora del partido: " + hora_partido + "\n" +
                "Duración del partido: " + duracion_partido + "\n" +
                "Pago total: " +  pagoTotal + "\n" +
                "Observaciones: " + observaciones + "\n" +
                "Servicios extras: " + extras + "\n" +
                "Tarifa aplicada: " +  tarifaAplicada;
    }

    public Reservas(int idReserva, Socios socio, Canchas cancha, LocalDate fecha_reserva, LocalDate fecha_partido, LocalTime hora_partido, double duracion_partido, boolean pagoTotal, String observaciones, List<ServiciosExtras> extras, Tarifas tarifaAplicada) {
        this.idReserva = ++contador;
        this.socio = socio;
        this.cancha = cancha;
        this.fecha_reserva = fecha_reserva;
        this.fecha_partido = fecha_partido;
        this.hora_partido = hora_partido;
        this.duracion_partido = duracion_partido;
        this.pagoTotal = pagoTotal;
        this.observaciones = observaciones;
        this.extras = extras;
        this.tarifaAplicada = tarifaAplicada;
    }
}

