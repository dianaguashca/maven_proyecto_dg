package deber.metodos.string;

import java.util.Scanner;

public class Estudiante  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		DatosEstudiante estudiante1=new DatosEstudiante();
		estudiante1.setCedula(12334);
		estudiante1.setNombre("Fernando");
		
		DatosEstudiante estudiante2=new DatosEstudiante();
		estudiante2.setCedula(2345);
		estudiante2.setNombre("Sofia");
		
		DatosEstudiante estudiante3=new DatosEstudiante();
		estudiante3.setCedula(3333);
		estudiante3.setNombre("Marcelo");
		
		DatosEstudiante estudiante4=new DatosEstudiante();
		estudiante4.setCedula(4444);
		estudiante4.setNombre("Claudia");
		
		DatosEstudiante estudiante5=new DatosEstudiante();
		estudiante5.setCedula(5555);
		estudiante5.setNombre("Araceli");
		
		
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
				int cedulaEstudiante1=lector.nextInt();
				System.out.println("Ingrese cedula segundo Estudiante");
				int cedulaEstudiante2=lector.nextInt();
				System.out.println("Ingrese cedula tercer Estudiante");
				int cedulaEstudiante3=lector.nextInt();
				System.out.println("Ingrese cedula cuarto Estudiante");
				int cedulaEstudiante4=lector.nextInt();
				System.out.println("Ingrese cedula quinto Estudiante");
				int cedulaEstudiante5=lector.nextInt();
				
				DatosEstudiante estudiante[]=new DatosEstudiante[5];
				estudiante[0]=estudiante1;
				estudiante[1]=estudiante2;
				estudiante[2]=estudiante3;
				estudiante[3]=estudiante4;
				estudiante[4]=estudiante5;
				
				int selec = lector.nextInt();
				int cedula = lector.nextInt();
				
				
		   }
			if(op==2) {
				
				System.out.println("Se solicita la cedula del estudiante");
				String cedula=lector.next();
				
				boolean cedulaEstudiante=(boolean) cedula.contains(cedula);
				System.out.println("se encuentra en el vector: "+cedulaEstudiante);
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