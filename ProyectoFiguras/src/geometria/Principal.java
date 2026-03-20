package geometria;

public class Principal {
    public static void main(String[] args) {
        // Creamos un círculo
        Circle miCirculo = new Circle(5.0, "Azul", true);
        
        // Creamos un triángulo
        Triangle miTriangulo = new Triangle(3.0, 4.0, 5.0, "Verde", false);

       
        imprimirInformacion(miCirculo);
        imprimirInformacion(miTriangulo);
    }

   
    public static void imprimirInformacion(GeometricObject figura) {
       
        String tipoFigura = figura.getClass().getSimpleName();
        
        System.out.println("--- Información de la Figura: " + tipoFigura + " ---");
        System.out.println("Color: " + figura.getColor());
        System.out.println("¿Está lleno?: " + figura.isFilled());
        System.out.println("Fecha de creación: " + figura.getDateCreated());
        System.out.println("Área: " + figura.getArea());
        System.out.println();
    }
}