package model;

public class GuiaTuristico extends Persona {
    private String especialidad;
    private int aniosexperiencia;

    public GuiaTuristico(Direccion direccion, String nombre, String rut, String telefono, int aniosexperiencia, String especialidad) {
        super(direccion, nombre, rut, telefono);
        this.aniosexperiencia = aniosexperiencia;
        this.especialidad = especialidad;
    }

    public int getAniosexperiencia() {
        return aniosexperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAños de experiencia:" + aniosexperiencia +
                "\nEspecialidad:" + especialidad;

    }
}


