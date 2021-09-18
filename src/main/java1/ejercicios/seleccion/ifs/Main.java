package ejercicios.seleccion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Escoja opcioón: ");
			System.out.println("1. Realizar Transferencia");
			System.out.println("2. Consultar Pagos");
			System.out.println("3. SALIR");
			opcion = teclado.nextLine();

			if (opcion.equals("1")) {
				System.out.println("Ingrese número de cuenta");
			} else if (opcion.equals("2")) {
				System.out.println("No existen Pagos");
			} else if (opcion.equals("3")) {
				System.out.println("No existen Pagos");
			}
		} while (!opcion.equals("3")); //Similar a: opcion! = 3
		System.out.println("Gracias por preferirnos");
	}

}
