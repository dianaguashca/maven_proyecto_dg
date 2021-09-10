package deber.consultorio;

import java.util.Arrays;
import java.util.Scanner;

public class MainClinica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int opcion;
		do {
		System.out.println("****** MENU PACIENTE ********");
		System.out.println("1-Registrar paciente");
		System.out.println("2-Imprimir reporte");
		System.out.println("3-SALIR");
		System.out.print("Seleccione una opcion :");
		opcion=teclado.nextInt();

		if (opcion==1){
		System.out.println("  Ingrese la siguiente información de los paciente: ");
	
		    System.out.println(" Ingrese en nombre ");
		    String dato1=teclado.nextLine();
			 System.out.println("Ingrese el apellido:");
			 String dato2=teclado.nextLine();
			 System.out.println("Ingrese la edad:");
			 String dato3=teclado.nextLine();
			 System.out.println("Ingrese el sintoma");
			 String dato4=teclado.nextLine();
			 System.out.println(" .................................................... ");
			 System.out.println(" Ingrese en nombre ");
			 String paciente2=teclado.nextLine();
		     System.out.println("Ingrese el apellido:");
			 String paciente2A=teclado.nextLine();
			 System.out.println("Ingrese la edad:");
			 String paciente2B=teclado.nextLine();
			 System.out.println("Ingrese el sintoma");
			 String paciente2C=teclado.nextLine();
			 System.out.println(" .................................................... ");
			 System.out.println(" Ingrese en nombre ");
			 String paciente3=teclado.nextLine();
		     System.out.println("Ingrese el apellido:");
			 String paciente3A=teclado.nextLine();
			 System.out.println("Ingrese la edad:");
			 String paciente3B=teclado.nextLine();
			 System.out.println("Ingrese el sintoma");
			 String paciente3C=teclado.nextLine();
				 
			String listaPaciente1[]=new String[4];
			 listaPaciente1[0]=dato1;
			 listaPaciente1[1]=dato2;
			 listaPaciente1[2]=dato3;
			 listaPaciente1[3]=dato4;
			 
			 String datosPaciente2[]=new String[4];
			 datosPaciente2[0]= paciente2;
			 datosPaciente2[1]=paciente2A;
			 datosPaciente2[2]=paciente2B;
			 datosPaciente2[3]= paciente2C;
			 
			 String datosPaciente3[]=new String[4];
			 datosPaciente3[0]= paciente2;
			 datosPaciente3[1]=paciente3A;
			 datosPaciente3[2]=paciente3B;
			 datosPaciente3[3]= paciente3C;
			 
			 
			 System.out.println("`Primer paciente");
				System.out.println(Arrays.toString(listaPaciente1));
				 System.out.println("Segundo paciente");
				System.out.println(Arrays.toString(datosPaciente2));
				 System.out.println("Tercer paciente");
					System.out.println(Arrays.toString(datosPaciente3));
		
		}else if(opcion==2){
			
			System.out.println("reporte de todos los pacientes");
			Paciente datos=new Paciente();
		datos.setNombre("Edwin");
		datos.setApellido("Moreira");
		datos.setEdad(20);
		datos.setSintoma("dolor de cabeza");
		
		Paciente datos2=new Paciente();
		datos2.setNombre("Paul");
		datos2.setApellido("Moran");
		datos2.setEdad(22);
		datos2.setSintoma("dolor de pierna");
		
		Paciente datos3=new Paciente();
		datos.setNombre("carlos");
		datos.setApellido("Mosquera");
		datos.setEdad(30);
		datos.setSintoma("dolor de cuello");
		
		 Paciente datosPaciente[]=new Paciente[4];
		 datosPaciente[0]= datos;
		 datosPaciente[1]=datos2;
		 datosPaciente[2]=datos3;
		
		 System.out.println(Arrays.toString(datosPaciente));
		
		
		}

		} while (opcion!=3); 
		
	System.out.println("hasta pronto");
	}
	
	 
		}