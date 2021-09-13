package tarea.nonacces.finall;

public final class TrabajadorDirector extends Trabajador {
	
private String empeñoTrabajadores;
	
	public final String horarioEntrada = "09:00";
	public String paisNacionalidad = "Ecuatoriano";
	
	public TrabajadorDirector() {
		
		//Una vez asignado un valor a un atributo final no se lo puede reasignar 
		horarioEntrada = "08:30";
		paisNacionalidad = "Argentina";
	}
}
