package model;

import java.sql.SQLOutput;

public class RutaGastronomica  extends ServicioTuristico{

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNúmero de paradas: " + numeroDeParadas;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("---- RUTA GASTRONÓMICA ----");
        System.out.println(this);
        System.out.println("---------------------------");
    }
}
