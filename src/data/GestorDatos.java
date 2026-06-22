package data;

import model.Tour;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestorDatos {

    private ArrayList<Tour> listaTours;

    public GestorDatos() {
        listaTours = new ArrayList<>();
    }

    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }

    public void cargarTours() {

        try {
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("resources/tours.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);

                Tour tour = new Tour(nombre, tipo, precio);

                listaTours.add(tour);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public Tour buscarTour(String nombre) {

        for (Tour tour : listaTours) {
            if (tour.getNombre().equalsIgnoreCase(nombre)) {
                return tour;
            }
        }

        return null;
    }

    public void mostrarToursPorTipo(String tipo) {

        for (Tour tour : listaTours) {
            if (tour.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(tour);
                System.out.println("----------------");
            }
        }
    }
}


