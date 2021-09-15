package correccion.prueba;

import java.util.Scanner;

public class PruebaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String claveIngresada;
do {
		System.out.println("ingrese clave");
		Scanner lector= new Scanner(System.in);
		
		claveIngresada=lector.nextLine();
		
	if(claveIngresada.equals("85DB")) {
		System.out.println("Banco Pichincha  ");
		System.out.println("1.-consultar pagos:");
		System.out.println("2.-realizar transferencia: ");
		System.out.println("3.-Salir ");
	}else {
		System.out.println("la clave no es la correcta");
	}
}while(!claveIngresada.equals("-1"));
System.out.println("Grcias por preferirnos");

	}
 
}
