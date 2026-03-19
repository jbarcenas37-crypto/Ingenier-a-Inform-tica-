package Princnr;
import java.util.Scanner;

public class Princnr {

	public static void main(String[] args) {
		
		int nume, num2,num1;
		//numeroEntero=input.nextInt();
	
		num1=(int)(Math.random()*10);
		num2=(int)(Math.random()*10);
		
	//	num1=(int)	(System.currentTimeMillis()%10);
		//num2=(int)	(System.currentTimeMillis()*7%10);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("¿Cuánto es  "+num1+ "+" +num2+ "?");
		
		nume=input.nextInt();
		if (nume==num1+num2){
			
			System.out.println("La respuesta es correcta ");
		}
		else {
			
			System.out.println("El numer entero que ingresaste fue incorrecto ");

		}

	}

}
