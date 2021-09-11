package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina{
	
	//No se puede sobreescribir un metodo final del padre
	protected void realiazarPracticas() {
		System.out.println("Realiza 100 horas de practicas");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realiza 100 horas de pasantias");
	}
}
