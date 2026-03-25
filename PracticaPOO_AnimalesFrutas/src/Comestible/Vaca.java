package Comestible;

public class Vaca extends Animal implements Comestible {
    public Vaca(String nombre, int edad, double peso, Habitat habitat, Cuidador cuidador) {
        super(nombre, edad, peso, habitat, cuidador);
    }
    @Override public String hacerSonido() { return "Mugido"; }
    @Override public String formaDeComer() { return "Carne"; }
    @Override public int caloriasAportadas() { return 250; }
}