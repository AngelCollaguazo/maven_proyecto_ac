package ejercicios.nonaccess.stacticos;

public class Paciente {
	private static String nombre;
	private  int edad;
	private static String nacionalidad="ECUATORIANO";
	private static int edadLimite = 65;
	
	public void registrar(String nombre) {
		System.out.println("Se regristra el paciente: " + nombre);
	}
	
	private static void consultarNacionalidad() {
		System.out.println("");
	}
	
	public static void consultarNacionalidadStatica() {
		System.out.println("La nacionalidad de: " + nacionalidad);
	}
	
	
	//Metodos SET y GET
	
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Paciente.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
