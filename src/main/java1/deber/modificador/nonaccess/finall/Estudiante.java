package deber.modificador.nonaccess.finall;

public class Estudiante extends ColegioPublico {
	
	public String Nombre;
	public final String horaEntrada="08:00 am";
	public final String horaSalida="13:00 pm" ;
	
	public Estudiante() {
		
		//no se le puede reasignar un valor a un atributo final
		//solo se le puede asignar una sola vez
		
		horaEntrada="9:00"; 
		horaSalida="2:30";
		
	}

}
