package model;

public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;

    public Direccion(String calle, String ciudad, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return calle + " #" + numero + ", " + ciudad;

    }
}


