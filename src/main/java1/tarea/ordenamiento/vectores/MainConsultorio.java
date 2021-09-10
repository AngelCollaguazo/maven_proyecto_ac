package tarea.ordenamiento.vectores;

import java.util.Arrays;
import java.util.Scanner;

public class MainConsultorio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorInt = new Scanner(System.in);
		Scanner lectorString = new Scanner(System.in);
		int opc = 0;
		Paciente[] Lista = new Paciente[4];
		do {
			System.out.println("***********************************");
			System.out.println("****   1. Registrar Paciente   ****");
			System.out.println("****   2. Imprimir Reporte     ****");
			System.out.println("****   3. SALIR                ****");
			System.out.println("***********************************");
			System.out.println("Ingrese una Opcion: ");
			opc = lectorInt.nextInt();
			if (opc == 1) {
				for (int i = 0; i < Lista.length; i++) {
					System.out.println("Ingrese su Nombre: ");
					String nombre = lectorString.nextLine();
					System.out.println("Ingrese su Apellido: ");
					String apellido = lectorString.nextLine();
					System.out.println("Ingrese su edad: ");
					int edad = lectorInt.nextInt();
					System.out.println("Que Síntoma tiene: ");
					String sintoma = lectorString.nextLine();
					Lista[i] = new Paciente(nombre, apellido, edad, sintoma);
				}
			} else if (opc == 2) {
				Arrays.sort(Lista);

				System.out.println("Registro de los Pacientes");

				System.out.println(Arrays.toString(Lista));
			}
		} while (opc != 3);
	}
}

