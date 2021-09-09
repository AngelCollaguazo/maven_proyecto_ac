package tarea.metodos.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);

		int opc;

		Estudiante cedula1 = new Estudiante();
		Estudiante cedula2 = new Estudiante();
		Estudiante cedula3 = new Estudiante();
		Estudiante cedula4 = new Estudiante();
		Estudiante cedula5 = new Estudiante();
		Estudiante listaEstudiante[] = new Estudiante[5];
		int cant = 0;

		do {
			System.out.println("*********************************");
			System.out.println("***   1. Ingresar Estudiante  ***");
			System.out.println("***   2. Buscar Estudiante    ***");
			System.out.println("***   3. SALIR                ***");
			System.out.println("*********************************");
			opc = lectorInt.nextInt();

			if (opc == 1) {
				System.out.println("Ingrese el numero de cedula del estudiante : ");
				String cedulaEstudiante = lector.nextLine();

				if (cant == 0) {
					cedula1.setCedulaEstudiante(cedulaEstudiante);
					listaEstudiante[cant] = cedula1;

				} else if (cant == 1) {
					cedula2.setCedulaEstudiante(cedulaEstudiante);
					listaEstudiante[cant] = cedula2;

				} else if (cant == 2) {
					cedula3.setCedulaEstudiante(cedulaEstudiante);
					listaEstudiante[cant] = cedula3;

				} else if (cant == 3) {
					cedula4.setCedulaEstudiante(cedulaEstudiante);
					listaEstudiante[cant] = cedula4;

				} else if (cant == 4) {
					cedula5.setCedulaEstudiante(cedulaEstudiante);
					listaEstudiante[cant] = cedula5;

				}

			} else if (opc == 2) {
				System.out.println("Ingrese la cedula para buscar: ");
				String buscar = lector.nextLine();
				boolean respuesta = false;
				for (int i = 0; i < 5; i++) {
					Estudiante estudiante = listaEstudiante[i];
					String buscar1 = estudiante.getCedulaEstudiante();
					boolean resultado = buscar.equals(buscar1);
					if (resultado == true) {
						respuesta = true;

					}

				}

				if (respuesta == true) {
					System.out.println("Contiene al estudiante");

				} else {
					System.out.println("No contiene al estudiante");
				}

			}
			cant = cant + 1;
		} while (opc != 3);

	}

}