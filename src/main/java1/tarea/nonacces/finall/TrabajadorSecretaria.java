package tarea.nonacces.finall;

public class TrabajadorSecretaria extends TrabajadorGerente{

	//Una vez escrito un metodo final en la clase padre esta no podra ser sobreescrita
	protected void pagarSueldos() {
		System.out.println("Realizar el pago a todos los empleados");
	}
	
	protected void realizarBonos() {
		System.out.println("Realizar bonos a todos los empleados");
	}
}
