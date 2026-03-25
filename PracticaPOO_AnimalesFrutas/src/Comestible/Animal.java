package Comestible;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected Habitat habitat;
    protected Cuidador cuidador;

    public Animal(String nombre, int edad, double peso, Habitat habitat, Cuidador cuidador) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.habitat = habitat;
        this.cuidador = cuidador;
    }

    public abstract String hacerSonido();

    public void mostrarInfo() {
        System.out.println("Animal: " + nombre + " | Edad: " + edad + " | Peso: " + peso + "kg");
        System.out.println("Hábitat: " + habitat.tipo() + " | Cuidador: " + cuidador.nombre());
    }
}