import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		holaMundo();
		calculadora();

	}

	public static void holaMundo() {
		int a = 0;
		int b = 0;
		a = 60;
		b = 15;
		int resultado = a + b;
		String nombre = "Carlos";
		Boolean masculino = true;
		System.out.println("El resultado es:" + resultado);

		if (masculino) {
			System.out.println("Bienvenido: " + nombre);
		} else {
			System.out.println("Bienvenida: " + nombre);
		}

	}

	public static void calculadora() {
		int numeroA = 0;
		int numeroB = 0;
		int resultado = 0;
		int opcion = 0;
		String mensaje = "";

		do {
			System.out.println("Ingresa el número de la opcion deseada: ");
			System.out.println("1) sumar");
			System.out.println("2) restar");
			System.out.println("3) multiplicar");
			System.out.println("4) dividir");
			System.out.println("5) salir");

			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			if (opcion > 0 && opcion < 5) {
				System.out.println("Ingresa el primer número: ");
				numeroA = scan.nextInt();
				System.out.println("Ingresa el segundo número: ");
				numeroB = scan.nextInt();

			}
			switch (opcion) {
			case 1:
				resultado = numeroA + numeroB;
				mensaje = "el resultado de la suma es: " + resultado;
				break;
			case 2:
				resultado = numeroA - numeroB;
				mensaje = "el resultado de la resta es: " + resultado;
				break;
			case 3:
				resultado = numeroA * numeroB;
				mensaje = "el resultado de la multiplicacion es: " + resultado;
				break;
			case 4:
				if (numeroB == 0) {
					mensaje = "No es posible dividir entre 0";
				} else {
					resultado = numeroA / numeroB;
					mensaje = "el resultado de la division es: " + resultado;
				}
				break;
			case 5:
				resultado = 0;
				mensaje = "Bae";
				break;
			default:
				mensaje = "La opcion seleccionada es incorrecta";
				break;
			}
			System.out.println(mensaje);
		} while (opcion != 5);

	}
}
