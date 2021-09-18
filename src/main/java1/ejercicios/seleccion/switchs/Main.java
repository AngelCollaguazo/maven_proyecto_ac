package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//el switch hasta antesde la version 1.7
		//solo funcionaba para byte, short, char e int
		String opcion;
		do {
			System.out.println("Escoja opcioón: ");
			System.out.println("1. Realizar Transferencia");
			System.out.println("2. Consultar Pagos");
			System.out.println("3. SALIR");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ingrese número de cuenta");
				break;
			case "2":
				System.out.println("No existen Pagos");
				break;
			case "3":
		System.out.println("Cerrando  Sistema");
		break;
				default:
					System.out.println("No ha elegido ninguna opcion valida");
					break;
			}
		} while (!opcion.equals("3")); //Similar a: opcion! = 3
		System.out.println("Gracias por preferirnos");
	}
}

