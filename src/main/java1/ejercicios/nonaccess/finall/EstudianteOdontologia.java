package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina {
	//no se puede sobreescribir un metodo final del padre
	
	@Override
	public void realizarPracticas() {
		System.out.println("Realiza 100 horas de practicas");
		
	}
	protected void realizarPasantias() {
		System.out.println("Realizar 200 horas de pasantias");
	}
}
 