package deber.metodos.string;

import java.util.Scanner;

public class Estudiante extends CedulaEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		
		int op=0;
		do {
		    System.out.println("**********************************************");
			System.out.println("       1.Ingresar estudiante");
			System.out.println("       2.buscar estudiante ");
			System.out.println("       3.-Salir ");
			System.out.println("***********************************************");
			System.out.println("       Seleccionar opcion");
		
			op=lector.nextInt();
			
		   if (op==1) {
				System.out.println("Ingrese cedula primer Estudiante");
				String cedulaEstudiante1=lector.next();
				System.out.println("Ingrese cedula segundo Estudiante");
				String cedulaEstudiante2=lector.next();
				System.out.println("Ingrese cedula tercer Estudiante");
				String cedulaEstudiante3=lector.next();
				System.out.println("Ingrese cedula cuarto Estudiante");
				String cedulaEstudiante4=lector.next();
				System.out.println("Ingrese cedula quinto Estudiante");
				String cedulaEstudiante5=lector.next();
				
//				
				System.out.println(cedulaEstudiante1);
				System.out.println(cedulaEstudiante2);
				System.out.println(cedulaEstudiante3);
				System.out.println(cedulaEstudiante4);
				System.out.println(cedulaEstudiante5);
				System.out.println("**********************************************");
				String estudiante[]=new String[5];
				estudiante[0]=cedulaEstudiante1;
				estudiante[1]=cedulaEstudiante2;
				estudiante[2]=cedulaEstudiante3;
				estudiante[3]=cedulaEstudiante4;
				estudiante[4]=cedulaEstudiante5;
				
		   }
			if(op==2) {
				
				System.out.println("Se solicita la cedula del estudiante");
				String cedula=lector.next();
				
				boolean cedulaEstudiante=(boolean) cedula.contains(cedula);
				System.out.println("se encuentra en el vector: "+cedulaEstudiante);
//				
			}
			boolean resultado = false;
			if(resultado==true) {
				System.out.println("el Estudiante existe");
			}else {
				System.out.println("No existe el estudiante");
			}
			
		  }while(op!=3) ;
			System.out.println("hasta pronto");
	}

}