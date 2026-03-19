package Rectangles;
import java.util.Scanner;

public class Rectangles {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Rectángulo 1
        System.out.print("R1 (x, y, ancho, alto): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        // Rectángulo 2
        System.out.print("R2 (x, y, ancho, alto): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double xDistance = Math.abs(x1 - x2);
        double yDistance = Math.abs(y1 - y2);

        if (xDistance <= (w1 - w2) / 2 && yDistance <= (h1 - h2) / 2) {
            System.out.println("El segundo rectángulo está dentro del primero");
        } else if (xDistance <= (w1 + w2) / 2 && yDistance <= (h1 + h2) / 2) {
            System.out.println("El segundo rectángulo se traslapa con el primero");
        } else {
            System.out.println("Los rectángulos no se tocan");
        }
		
		
		
		
		
	}

}
