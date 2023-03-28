import java.util.Scanner;

public class Calculadora 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		int numeroA;
		int numeroB;

		System.out.print("Introduce el primer numero entero: ");
		numeroA = reader.nextInt();

		System.out.print("Introduce el segundo numero entero: ");
		numeroB = reader.nextInt();

		System.out.println(numeroA + " + " + numeroB + " = " + (numeroA + numeroB));
		System.out.println(numeroA + " - " + numeroB + " = " + (numeroA - numeroB));
		System.out.println(numeroA + " * " + numeroB + " = " + (numeroA * numeroB));
		System.out.println(numeroA + " / " + numeroB + " = " + (numeroA / numeroB));
	}
}