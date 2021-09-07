package tarea.metodos.string;

import java.util.Arrays;
import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorString = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);
		int opc = 0;
		String buscar;

		String listaEstudiantes[] = new String[5]; // declarar array

		do {
			int contador = 1;
			System.out.println("****************************");
			System.out.println("** 1. Ingresar Estudiante **");
			System.out.println("** 2. Buscar Estudiante   **");
			System.out.println("** 3. Salir               **");
			System.out.println("****************************");
			
			opc = lectorInt.nextInt();

			if (opc == 1) {
				System.out.println("***** Ingrese Estudiante *****");
				System.out.println("Ingrese la cedula del estudiante: ");
				for (int i = 0; i < 5; i++) {
					System.out.print("Estudiante N°" + contador + " : ");
					contador++;
					listaEstudiantes[i] = lectorString.nextLine();
				}
				System.out.println(Arrays.toString(listaEstudiantes));
			}
			if (opc == 2) {
				System.out.println("***** Buscar Estudiante *****");
				System.out.println("Ingrese la cedula del estudiante: ");
				buscar = lectorString.nextLine();

				for (int i = 0; i < 5; i++) {
					boolean resultado = buscar.equals(listaEstudiantes[i]);

					if (resultado == true) {
						System.out.println("Contiene al estudiante: " + buscar);
					}
				}

			}
			
		} while (opc != 3);
		System.out.println("Usted acaba de salir del programa");
	}

}