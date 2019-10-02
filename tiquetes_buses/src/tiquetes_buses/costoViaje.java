package tiquetes_buses;
public class costoViaje {
    private int númeroViaje, hora;
    private String nombrePasajero, fecha;
    private double costo;

    public double getCosto() {
        return costo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public int getNúmeroViaje() {
        return númeroViaje;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public void setNúmeroViaje(int númeroViaje) {
        this.númeroViaje = númeroViaje;
    }
    
}
