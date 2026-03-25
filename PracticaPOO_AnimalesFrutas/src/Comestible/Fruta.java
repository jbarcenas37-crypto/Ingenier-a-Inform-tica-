package Comestible;

public abstract class Fruta implements Comestible {
    protected String nombre;
    protected String color;
    protected double peso;
    protected Origen origen;
    protected InformacionNutricional informacionNutricional;

    public Fruta(String nombre, String color, double peso, Origen origen, InformacionNutricional info) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.origen = origen;
        this.informacionNutricional = info;
    }

    public abstract TipoSabor tipoSabor();
}