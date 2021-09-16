package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte 
		byte datoByte = 2;  //primitivo
		Byte datoByteWrapper = 3;  //Wrapper
		System.out.println("primitivo: " +datoByte);
		System.out.println("Wrapper: " +datoByteWrapper);
		//Conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido: " +datoConvertido);
		//Conversiones 2
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("byte convertido: " +datoByte2);
		
		//short 
		short datoShort = 1;  //primitivo
		Byte datoShorWrapper = 1;  //Wrapper
		System.out.println("primitivo: " +datoShort);
		System.out.println("Wrapper: " +datoShorWrapper);
		//Conversiones
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Short convertido: " +shortConvertido);
		//Conversiones 2
		Short shortConvertido2 = 6;
		short datoShort2 = shortConvertido2.shortValue();
		System.out.println("short convertido: " +datoShort2);
		
		//int 
		int edad = 45;  //primitivo
		Integer edadtWrapper = 48;  //Wrapper
		System.out.println("primitivo: " +edad);
		System.out.println("Wrapper: " +edadtWrapper);
		//Conversiones
		int edad1 = 45;
		Integer integerConvertido = edad1;
		System.out.println("Int convertido: " +integerConvertido);		
		//Conversiones2
		Integer integerConvertido2 = 23;
		int edad2 = integerConvertido2.intValue();
		System.out.println("int convertido: " +edad2);
		
		//long
		long valorGrande = 125344L;  //primitivo
		Long valorGrandeWrapper = 123123L;  //Wrapper
		System.out.println("primitivo: " +valorGrande);
		System.out.println("Wrapper: " +valorGrandeWrapper);
		//Conversiones
		long valorGrande1 = 3345523L;
		Long longConvertido = valorGrande1;
		System.out.println("Long convertido: " +longConvertido);		
		//Conversiones2
		Long longConvertido2 = 8347349L;
		long valorGrande2 = longConvertido2.longValue();
		System.out.println("long convertido: " +valorGrande2);
		
		//boolean
		boolean soltero = true;  //primitivo
		Boolean solteroWrapper = false;  //Wrapper
		System.out.println("primitivo: " +soltero);
		System.out.println("Wrapper: " +solteroWrapper);
		//Conversiones
		boolean soltero1 = false;
		Boolean booleanConvertido = soltero1;
		System.out.println("Boolean convertido: " +booleanConvertido);		
		//Conversiones2
		Boolean booleanConvertido2 = true;
		boolean soltero2 = booleanConvertido2.booleanValue();
		System.out.println("boolean convertido: " +soltero2);
		
		//float
		float sueldo = 23.76F;  //primitivo
		Float sueldoWrapper = 10.56F;  //Wrapper
		System.out.println("primitivo: " +sueldo);
		System.out.println("Wrapper: " +sueldoWrapper);
		//Conversiones
		float sueldo1 = 12.58F;
		Float floatConvertido = sueldo1;
		System.out.println("Float convertido: " +floatConvertido);		
		//Conversiones2
		Float floatConvertido2 = 67.89F;
		float sueldo2 = floatConvertido2.floatValue();
		System.out.println("float convertido: " +sueldo2);
		
		//double
		double saldoBanco = 1000000000.67;  //primitivo
		Double saldoBancoWrapper = 13400000000.56;  //Wrapper
		System.out.println("primitivo: " +saldoBanco);
		System.out.println("Wrapper: " +saldoBancoWrapper);		
		//Conversiones
		double saldoBanco1 = 4676340000.89;
		Double doubleConvertido = saldoBanco1;
		System.out.println("Double convertido: " +doubleConvertido);		
		//Conversiones2
		Double doubleConvertido2 = 234000000.43;
		double saldoBanco2 = doubleConvertido2.doubleValue();
		System.out.println("double convertido: " +saldoBanco2);
		
		//char
		char opcionMenu = 'A';  //primitivo
		Character opcionMenuWrapper = 'B';  //Wrapper
		System.out.println("primitivo: " +opcionMenu);
		System.out.println("Wrapper: " +opcionMenuWrapper);
		//Conversiones
		char opcionMenu1 = 'X';
		Character characterConvertido = opcionMenu1;
		System.out.println("Char convertido: " +characterConvertido);		
		//Conversiones2
		Character characterConvertido2 = 'Z';
		char opcionMenu2 = characterConvertido2.charValue();
		System.out.println("char convertido: " +opcionMenu2);
	}

}
