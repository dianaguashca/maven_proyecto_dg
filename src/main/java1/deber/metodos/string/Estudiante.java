package deber.metodos.string;

import java.util.Scanner;

public class Estudiante  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		
		DatosEstudiante estudiante1=new DatosEstudiante();
		estudiante1.setCedula("1111");
		
		
		DatosEstudiante estudiante2=new DatosEstudiante();
		estudiante2.setCedula("2222");
		
		
		DatosEstudiante estudiante3=new DatosEstudiante();
		estudiante3.setCedula("3333");
		
		
		DatosEstudiante estudiante4=new DatosEstudiante();
		estudiante4.setCedula("4444");
		
		
		DatosEstudiante estudiante5=new DatosEstudiante();
		estudiante5.setCedula("5555");
		
		DatosEstudiante estudiante[]=new DatosEstudiante[5];
		estudiante[0]=estudiante1;
		estudiante[1]=estudiante2;
		estudiante[2]=estudiante3;
		estudiante[3]=estudiante4;
		estudiante[4]=estudiante5;
		int op = 0;
		do {
		 System.out.println("**********************************************");
			System.out.println("       1.Ingresar estudiante");
			System.out.println("       2.buscar estudiante ");
			System.out.println("       3.-Salir ");
			System.out.println("***********************************************");
			System.out.println("       Seleccionar opcion");
			
		   op=lector.nextInt();
		   if(op==1) {
			   System.out.println("Ingrese cedula del Estudiante");
			   op=lector.nextInt();
		   }
		   
		   if(op==2) {
			   
			   System.out.println("Ingrese la cedula a buscar");
			   op=lector.nextInt();
			   
			String cedulaBuscar="1111";
			boolean respuesta=false;
			for(int i=0;i<5;i++) {
				DatosEstudiante estudiantes=estudiante[i];
				String cedulaDelEstudiante=estudiantes.getCedula();
				boolean respuestaLocal=cedulaBuscar.equals(cedulaDelEstudiante);
				if(respuestaLocal==true) {
					respuesta=true;
				}
			}
			if(respuesta==true) {
				System.out.println("El estudiante si existe");
			
		  }else {
			  System.out.println("El estudiante no existe");
		  }
		   }
		  
		}while(op!=3) ;
			System.out.println("hasta pronto");
	}
}