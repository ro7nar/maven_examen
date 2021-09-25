package maven_examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		do {

			System.out.println("#################################\r\n" + "ASEGURADORA DEL SUR, elija una opción:\r\n"
					+ "1. Ingresar Póliza\r\n" + "2. Actualizar Valor\r\n" + "3. Consultar Póliza\r\n"
					+ "4. Imprimir Reporte\r\n" + "5. SALIR\r\n" + "#################################");
			opcion = lector.nextInt();
			switch (opcion) {

			case 1:

				System.out.println("");
				break;

			case 2:
				System.out.println("");
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Gracias por su atencion");
				break;
			default:
				System.out.println("No existe esa opcion");
				break;

			}

		} while (opcion != 5);

	}

}
