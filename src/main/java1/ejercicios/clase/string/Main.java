package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);//Teclado
		
		//1 contains
		//módulo
		String frase = "Programación de algoritmos módulo II";
		System.out.println("Ingrese el nombre del libro");
		String palabra = teclado.nextLine();	
		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra: " +resultado);
		
		//2 equals
		System.out.println("***************************************************");
		String cadena1 = "angel";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado1 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: " +resultado1);
		
		//3. y 4. Upper Lowwer
		System.out.println("***************************************************");
		String nombre = "daniel";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayuscula: " +nombreEnMayuscula);
		
		String nombre2 = "JAVIER";
		String nombreEnMinuscula = nombre2.toLowerCase();
		System.out.println("Nombre en minuscula: " +nombreEnMinuscula);
	}

}
