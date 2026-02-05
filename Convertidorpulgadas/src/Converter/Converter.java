package Converter;

import java.util.Scanner;

public class Converter {
	 static final double CENTIMETERS_PER_INCH = 2.54;
	  static final int INCHES_PER_FOOT = 12;

	  public static void main(String[] args) {
		  
		  int feet; //variable to store feet
		  int inches; //variable to store inches
		  int totalInches; //variable to store total inches

		  double centimeters; //variable to store length in centimeters
		  
		 
		  
		  int selection;
	  
		  Scanner input=new Scanner(System.in);
		  
		  System.out.println("¿Qué deseas convertir a centimetros, pies o pulgadas?");
		  System.out.println("1) Pulgadasn");
		  System.out.println("2) Pies");
			selection=input.nextInt();
		  
			if (selection==1){
				
				System.out.println("Escribe tu cantidad de pulgadas\n");
				inches=input.nextInt();
				centimeters=inches*CENTIMETERS_PER_INCH;
				System.out.println("El equivalente en centimetros de "+inches+" pulgadas es: " +centimeters+" cm");
			}
			else if(selection==2)
			{
				
				System.out.println("Escribe tu cantidad de pies\n");
				feet=input.nextInt();
				centimeters=feet*INCHES_PER_FOOT*CENTIMETERS_PER_INCH;
				System.out.println("El equivalente en centimetros de "+feet+" pies es: " +centimeters+" cm");
			}
			
	  }
		
}