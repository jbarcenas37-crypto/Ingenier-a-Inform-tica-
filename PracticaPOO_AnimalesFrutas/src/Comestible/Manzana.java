package Comestible;

public class Manzana extends Fruta {
    public Manzana(String color, double peso, Origen origen, InformacionNutricional info) {
        super("Manzana", color, peso, origen, info);
    }
    @Override public TipoSabor tipoSabor() { return TipoSabor.DULCE; }
    @Override public String formaDeComer() { return "Cruda o en postres"; }
    @Override public int caloriasAportadas() { return informacionNutricional.calorias(); }
}