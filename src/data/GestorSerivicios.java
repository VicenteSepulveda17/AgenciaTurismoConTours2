package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorSerivicios {

    public void crearServicios() {

        //Rutas Gatronómicas

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Ruta del Salmón",
                4,
                5
        );

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta de la Cerveza",
                3,
                4
        );

        //Paseos Lacustres
        PaseoLacustre paseo1 = new PaseoLacustre(
                "Lago Llanquihue",
                2,
                "Catamarán"
        );

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Navegación Petrohué",
                5,
                "Lancha"
        );

        //Excursiones Culturales
        ExcursionCultural excursion1 = new ExcursionCultural(
                "Museo Colonial",
                2,
                "Frutillar"
        );

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Ruta Patrimonial",
                6,
                "Puerto Varas"
        );

        System.out.println("\n----- RUTAS GASTRONÓMICAS -----");
        System.out.println(ruta1);
        System.out.println("------------------------------");
        System.out.println(ruta2);

        System.out.println("\n----- PASEOS LACUSTRES -----");
        System.out.println(paseo1);
        System.out.println("------------------------------");
        System.out.println(paseo2);

        System.out.println("\n----- EXCURSIONES CULTURALES -----");
        System.out.println(excursion1);
        System.out.println("------------------------------");
        System.out.println(excursion2);

    }
}
