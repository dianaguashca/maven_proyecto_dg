package ejercicios.nonaccess.staticos;

public class Paciente {

	private  String nombre;
	private int edad;
	private static int nacionalidad;
	private static int edadLimite=65;
	
	public void registrar(String nombre) {
		System.out.println("se registra el paciente"+nombre);

	
	
	}
	private static void consultarNacionalidad() {
		System.out.println("");
	}
   public static void consultarNacionalidadStatica() {
	System.out.println("la nacionalidad es:"+nacionalidad);
}

	
	//metodos set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
