package tarea.ordenamiento.vectores;

public class Paciente implements Comparable<Paciente> {

	private String nombre;
	private String apellido;
	private int edad;
	private String sintoma;

	public Paciente(String nombre, String apellido, int edad, String sintoma) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sintoma = sintoma;

		// TODO Auto-generated constructor stub
	}

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

	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		// 3 posibles retornos
		// 0
		// -1
		// 1
		if (this.edad < o.getEdad()) {
			return 1;
		} else if (this.edad == o.getEdad()) {
			return 0;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sintoma=" + sintoma
				+ "]";
	}

}



