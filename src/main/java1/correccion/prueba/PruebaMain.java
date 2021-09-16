package correccion.prueba;

import java.util.Scanner;

public class PruebaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String claveIngresada;
   String opcionMenu;
   int saldoInicial=2500;
do {
		System.out.println("ingrese clave");
		Scanner lector= new Scanner(System.in);
		Scanner lectorInt= new Scanner(System.in);
		claveIngresada=lector.nextLine();
		
	if(claveIngresada.equals("85DB")) {
	//si	
		do {
		System.out.println("Banco Pichincha  ");
		System.out.println("1.-consultar pagos:");
		System.out.println("2.-realizar transferencia: ");
		System.out.println("3.-Salir ");
		 opcionMenu=lector.nextLine();
		
		if(opcionMenu.equals("1")) {
			
			System.out.println("No tiene ningun pago pendiendiente");
		}else if(opcionMenu.equals("2")) {
			System.out.println("Ingrese la cuenta de destino");
			String cuentaDestino=lector.nextLine();
			System.out.println("Ingrese el monto");
		  int montoTransferir=lectorInt.nextInt();
		  saldoInicial=  saldoInicial-montoTransferir;
		  
		  System.out.println("Su nuevo saldo es :"+saldoInicial);
		}
//		 while( opcionMenu.equals("1") || opcionMenu.equals("2")  );
	
		} while( !opcionMenu.equals("3")) ;
		claveIngresada="0";
		}else {//NO
		System.out.println("la clave no es la correcta");
	}
}while(!claveIngresada.equals("-1"));
System.out.println("Gracias por preferirnos");

	}
 
}
