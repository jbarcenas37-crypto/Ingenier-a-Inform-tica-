package Comestible;

public class Leon extends Animal {
    public Leon(String nombre, int edad, double peso, Habitat habitat, Cuidador cuidador) {
        super(nombre, edad, peso, habitat, cuidador);
    }
    @Override public String hacerSonido() { return "Rugido"; }
}