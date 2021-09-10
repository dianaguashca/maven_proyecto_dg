package deber.consultorio;

public  class Paciente {
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" 
	+ apellido + ", edad=" + edad + ", sintoma=" + sintoma
				+ "]";
	}
	public String nombre;
	public String apellido;
	public int edad;
	public String sintoma;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	

}
