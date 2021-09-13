package deber.modificador.nonaccess.finall;

public class Estudiante1 extends ColegioPublico {
	
	//no puede ser sobreescrita por un clase hija es decir que no
	//se puede sobreescribir un metodo final del padre.
	
	
	public void realizarEventos() {
		System.out.println("Se realizara los eventos "
				+ "de navidad y año viejo");
		
	}
	public void entregarLibros() {
		System.out.println("Se le entregara libros a "
				+ "cada uno de los estudiantes");
	}

	public void entregarUniformes() {
		System.out.println("Se le entregara uniformes"
				+ "a cada uno de los estudiantes");
	}
}
