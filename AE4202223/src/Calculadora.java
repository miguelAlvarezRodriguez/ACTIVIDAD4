import java.util.Scanner;

// --------------------------------------------------------------------------------------
// Autor: Miguel Alvarez Rodriguez
// Fecha: 27/03/2023
// Clase: Calculadora. 	Sirve para realizar las operaciones aritmeticas básicas sobre
// 						dos numeros solicitados por consola
//--------------------------------------------------------------------------------------
public class Calculadora 
{

	// Metodo principal
	public static void main(String[] args) 
	{
		// Variabless
		Scanner reader = new Scanner(System.in);
		int numeroA;
		int numeroB;

		// Solicitud de datos por consola
		System.out.print("Introduce el primer numero entero: ");
		numeroA = reader.nextInt();

		System.out.print("Introduce el segundo numero entero: ");
		numeroB = reader.nextInt();

		// Salida de resutlados
		ImpresionResultados(numeroA, numeroB);
	}

	// Metodo para la impresion de los resultados
	private static void ImpresionResultados(int numeroA, int numeroB) 
	{
		System.out.println(numeroA + " + " + numeroB + " = " + Suma(numeroA, numeroB));
		System.out.println(numeroA + " - " + numeroB + " = " + Resta(numeroA, numeroB));
		System.out.println(numeroA + " * " + numeroB + " = " + Multiplicacion(numeroA, numeroB));
		System.out.println(numeroA + " / " + numeroB + " = " + Division(numeroA, numeroB));
	}

	// Metodo para dividir dos numeros
	private static float Division(int numeroA, int numeroB) 
	{
		return numeroA / (float) numeroB;
	}
	
	// Metodo para  multiplicar dos numeros
	private static int Multiplicacion(int numeroA, int numeroB) 
	{
		return numeroA * numeroB;
	}
	
	// Metodo para restar dos numeros	
	private static int Resta(int numeroA, int numeroB) 
	{
		return numeroA - numeroB;
	}
	
	// Metodo para sumar dos numeros
	private static int Suma(int numeroA, int numeroB) 
	{
		return numeroA + numeroB;
	}
}
