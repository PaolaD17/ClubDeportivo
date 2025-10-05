package ClubDeportivo;

public class Canchas {
    static int contador = 0;
    private int idCancha;
    private String nombre;
    private String deporte;
    private boolean cubierta;
    private int capacidad;
    private String estado;
    private String caracteristicas;

    public int getIdCancha() {
        return idCancha;
    }
    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public boolean isCubierta() {
        return cubierta;
    }
    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Id Cancha: " + idCancha + "\n" +
                "Nombre: " + nombre + "\n" +
                "Deporte: " + deporte + "\n" +
                "Cubierta: " + cubierta + "\n" +
                "Capacidad: " + capacidad + "\n" +
                "Estado: " + estado + "\n" +
                "Caracteristicas: " + caracteristicas;
    }

    public Canchas(int idCancha, String nombre, String deporte, boolean cubierta, int capacidad, String estado, String caracteristicas) {
        this.idCancha = ++contador;
        this.nombre = nombre;
        this.deporte = deporte;
        this.cubierta = cubierta;
        this.capacidad = capacidad;
        this.estado = estado;
        this.caracteristicas = caracteristicas;
    }

}
