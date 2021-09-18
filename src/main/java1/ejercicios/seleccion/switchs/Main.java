package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Escoja opcion:");
			System.out.println("1.- Realizar transferencia:");
			System.out.println("2.- consultar pagos:");
			System.out.println("3.- SALIR:");
			 //el switch hasta antes de la version 1.7
			//solo funciona para byte, short ,char e int 
			
			opcion=lector.nextLine(); 
			 
			 switch(opcion) { 
			 case "1": 
				 System.out.println("Ingrese numero de cuenta");
				 break;
			 case "2": 
				 System.out.println("No existen pagos");
				 break;
			 case "3": 
				 System.out.println("Cerrando el sistema");
				 break;
				 default :
					 System.out.println("No ha elejido ninguna opcion valida ");
			 break;
			 }
			 
		}while (! opcion.equals("3"));//similar a opcion !=3
		System.out.println("Gracias por preferirnos");
	}
}
