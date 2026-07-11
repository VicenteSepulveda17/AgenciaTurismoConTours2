package data;

import java.util.ArrayList;

import model.*;

public class GestorEntidades {

    private ArrayList<Registrable> listaEntidades;

    public GestorEntidades() {
        listaEntidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad){
        listaEntidades.add(entidad);
    }

    public ArrayList<Registrable> getListaEntidades() {
        return listaEntidades;
    }

    public void crearDatosPrueba() {

        Direccion direccion1 = new Direccion(
                "Av. Costanera",
                "Llanquihue",
                123
        );

        GuiaTuristico guia = new GuiaTuristico(
                direccion1,
                "Pedro González",
                "12.345.678-8",
                "+ 56 9 1234 5678",
                8,
                "Turismo Aventura"

        );

        Vehiculo vehiculo = new Vehiculo(
                "ABCD12",
                "Minibus",
                18
        );

        ColaboradorExterno colaborador = new ColaboradorExterno(
                "María González",
                "Fotografía"
        );

        agregarEntidad(guia);
        agregarEntidad(vehiculo);
        agregarEntidad(colaborador);

    }

    public void mostrarEntidades(){

        System.out.println("\n=====ENTIDADES REGISTRADAS=====");

        for (Registrable entidad : listaEntidades) {

            if (entidad instanceof GuiaTuristico) {
                System.out.println("[Guía Turístico]");
            } else if (entidad instanceof Vehiculo) {
                System.out.println("[Vehiculo]");
            } else if (entidad instanceof ColaboradorExterno) {
                System.out.println("[Colaborador Externo]");

            }

            entidad.mostrarResumen();
            System.out.println("-------------------------------");

        }
    }

        public void iniciarSistema () {
            crearDatosPrueba();
            mostrarEntidades();

        }
}

