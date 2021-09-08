package ejercicios.variables.locales.globales;

public class Paciente {
	
	private String nombre;
	private int edad;
	public static String pais = "Ecuador";
	public static String provincia = "Pichincha";
	
	
	public void chequeo() {
		this.nombre="Javier";
		String diagnostico = "completo";
		diagnostico = "sobrepeso";
		diagnostico = "diabetes";
		
		String medicina = "Realizar";
		medicina = "Actividad Fisica";
		medicina = "alimentos sin mucha azucar";
	}

}
