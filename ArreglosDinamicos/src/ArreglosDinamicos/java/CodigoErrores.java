package ArreglosDinamicos.java;

import java.util.ArrayList;

public class CodigoErrores {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList();

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        System.out.println("Elemento en posición 3: " + lista.get(2));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        lista.remove("Cuatro");

        System.out.println("Tamaño final: " + lista.size());

    }
}