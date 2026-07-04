package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private List<ServicioTuristico> listaServicios;

    public GestorServicios(){
        listaServicios = new ArrayList<>();
    }
    public void crearServicios() {

        //Rutas Gatronómicas

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Ruta del Salmón",
                4,
                5
        );

        listaServicios.add(ruta1);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta de la Cerveza",
                3,
                4
        );

        listaServicios.add(ruta2);

        //Paseos Lacustres
        PaseoLacustre paseo1 = new PaseoLacustre(
                "Lago Llanquihue",
                2,
                "Catamarán"
        );

        listaServicios.add(paseo1);

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Navegación Petrohué",
                5,
                "Lancha"
        );

        listaServicios.add(paseo2);

        //Excursiones Culturales
        ExcursionCultural excursion1 = new ExcursionCultural(
                "Museo Colonial",
                2,
                "Frutillar"
        );

        listaServicios.add(excursion1);

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Ruta Patrimonial",
                6,
                "Puerto Varas"
        );

        listaServicios.add(excursion2);
    }

    public void mostrarServicios() {

        System.out.println("\n======= SERVICIOS TURÍSTICOS =======\n");

        for (ServicioTuristico servicio : listaServicios) {
            servicio.mostrarInformacion();
            System.out.println();
        }
    }
}
