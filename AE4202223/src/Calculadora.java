import java.util.Scanner;

// --------------------------------------------------------------------------------------
// Autor: Miguel Alvarez Rodriguez
// Fecha: 27/03/2023
// Clase: Calculadora. 	Sirve para realizar las operaciones aritmeticas básicas sobre
// 						dos numeros solicitados por consola
//--------------------------------------------------------------------------------------
public class Calculadora 
{
	public static void main(String[] args) 
	{
		// Declaracion de objetos y variables
		Scanner reader = new Scanner(System.in);
		int numeroA;
		int numeroB;
		
		// Solicitud de numeros por consola
		System.out.print("Introduce el primer numero entero: ");
		numeroA = reader.nextInt();

		System.out.print("Introduce el segundo numero entero: ");
		numeroB = reader.nextInt();

		// Impresión de resultados
		System.out.println(numeroA + " + " + numeroB + " = " + (numeroA + numeroB));
		System.out.println(numeroA + " - " + numeroB + " = " + (numeroA - numeroB));
		System.out.println(numeroA + " * " + numeroB + " = " + (numeroA * numeroB));
		System.out.println(numeroA + " / " + numeroB + " = " + (numeroA / numeroB));
	}
}