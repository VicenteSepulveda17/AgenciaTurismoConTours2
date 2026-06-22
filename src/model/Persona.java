package model;

import Exceptions.RutInvalidoException;

public class Persona {
    private String nombre;
    private String rut;
    private String telefono;
    private Direccion direccion;

    public Persona(Direccion direccion, String nombre, String rut, String telefono) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) throws RutInvalidoException {

        if (rut == null || rut.isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        this.rut = rut;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre +
                "\nRut:" + rut +
                "\nTelefono:" + telefono +
                "\nDireccion:" + direccion;

    }

}


