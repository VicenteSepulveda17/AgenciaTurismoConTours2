package model;

public class ExcursionCultural extends ServicioTuristico{

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Lugar Histórico: " + lugarHistorico;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("---- EXCURSIÓN CULTURAL ----");
        System.out.println(this);
        System.out.println("----------------------------");

    }
}
