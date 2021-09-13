package ejercicios.nonaccess.finall;

public final class EstudianteCiencias extends Estudiante {
 
	private String velocidadInternet;
	public final String horarioEntrada="08:00";
	public String ciudadNacimidento="Quito" ;
	
	
	
	public EstudianteCiencias(){
		
		//no se puede reasignar un valor a un atributo final
		horarioEntrada="3:90"; 
		ciudadNacimidento="Guayaquil";
	}
	
}
