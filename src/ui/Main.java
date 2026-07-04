package ui;

import Exceptions.RutInvalidoException;
import data.GestorDatos;
import data.GestorServicios;
import model.Direccion;
import model.GuiaTuristico;
import model.Tour;

public class Main {

    public static void main(String[] args) {

        /*

        Direccion direccion1 = new Direccion(
                "Av. Costanera",
                "Llanquihue",
                123
        );

        GuiaTuristico guia1 = new GuiaTuristico(
                direccion1,
                "Pedro Gonzalez",
                "12.345.678-8",
                "+56 9 1234 5678",
                8,
                "Turismo Aventura"
        );

        GuiaTuristico guia2 = new GuiaTuristico(
                direccion1,
                "Carlos Campos",
                "14.543.678-4",
                "+56 9 8765 4321",
                5,
                "Turismo Aventura"
        );

        GuiaTuristico guia3 = new GuiaTuristico(
                direccion1,
                "Leonel Sanchez",
                "11.444.555-6",
                "+56 9 3344 5566",
                7,
                "Turismo Aventura"
        );

        System.out.println("----- Guia 1 -----");
        System.out.println(guia1);

        System.out.println();

        System.out.println("----- Guia 2 -----");
        System.out.println(guia2);

        System.out.println();

        System.out.println("----- Guia 3 -----");
        System.out.println(guia3);

        try {
            guia1.setRut("");
        } catch (RutInvalidoException e) {
            System.out.println("\nERROR DETECTADO:");
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println("----- Tours Disponibles -----");
            System.out.println();
        }

        GestorDatos gestor = new GestorDatos();
        gestor.cargarTours();

        System.out.println("----- Todos los tours -----");

        for (Tour tour : gestor.getListaTours()) {
            System.out.println(tour);
            System.out.println("----------------");
        }

        System.out.println("\n----- Busqueda de Tour -----");

        Tour encontrado = gestor.buscarTour("Tour Volcan Osorno");

        if (encontrado != null) {
            System.out.println("Tour Disponible!! :)");
            System.out.println(encontrado);
        } else {
            System.out.println("Tour no encontrado.");
        }

        System.out.println("\n----- Tours de Aventura -----");
        gestor.mostrarToursPorTipo("Aventura");


         */

        GestorServicios gestorSerivicios = new GestorServicios();
        gestorSerivicios.crearServicios();
        gestorSerivicios.mostrarServicios();
    }
}