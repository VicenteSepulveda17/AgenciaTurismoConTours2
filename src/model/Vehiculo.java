package model;

public class Vehiculo implements Registrable {

    private String patente;
    private String tipo;
    private int capacidad;

    public Vehiculo(String patente, String tipo, int capacidad) {
        this.patente = patente;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("-----VEHICULO-----");
        System.out.println("Patente: " + patente);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad + " pasajeros.");
    }
}
