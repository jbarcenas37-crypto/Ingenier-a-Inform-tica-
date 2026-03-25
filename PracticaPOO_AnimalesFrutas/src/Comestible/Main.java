package Comestible;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();

        // 1. Crear instancias de datos
        Habitat selva = new Habitat("Selva", 25.0, "Amazonas");
        Cuidador ana = new Cuidador("Ana", 5, "Veterinaria");
        Origen chile = new Origen("Chile", "Valle Central", "Exportadora Fruit");
        InformacionNutricional nutricionMza = new InformacionNutricional(52, 10, 2, 1);

        // 2. Crear animales y frutas
        lista.add(new Leon("Alex", 4, 150, selva, ana));
        lista.add(new Vaca("Lola", 3, 400, new Habitat("Campo", 18, "Pampa"), new Cuidador("Pepe", 20, "Ganadero")));
        lista.add(new Manzana("Verde", 0.15, chile, nutricionMza));

        // 3. Procesar la lista
        for (Object item : lista) {
            System.out.println("=== INFORMACIÓN  ===");
            if (item instanceof Animal a) {
                a.mostrarInfo();
                System.out.println("Sonido: " + a.hacerSonido());
                if (a instanceof Comestible c) {
                    System.out.println("Comestible: Sí | Forma: " + c.formaDeComer());
                } else {
                    System.out.println("Comestible: No");
                }
            } else if (item instanceof Fruta f) {
                System.out.println("Fruta: " + f.nombre + " | Color: " + f.color);
                System.out.println("Sabor: " + f.tipoSabor() + " | Origen: " + f.origen.pais());
                System.out.println("Calorías: " + f.caloriasAportadas());
            }
            System.out.println("------------------------------\n");
        }
    }
}