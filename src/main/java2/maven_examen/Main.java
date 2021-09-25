package maven_examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		List<Poliza> ListPoliza = new ArrayList<Poliza>();
		do {

			System.out.println("#################################\r\n" + "ASEGURADORA DEL SUR, elija una opción:\r\n"
					+ "1. Ingresar Póliza\r\n" + "2. Actualizar Valor\r\n" + "3. Consultar Póliza\r\n"
					+ "4. Imprimir Reporte\r\n" + "5. SALIR\r\n" + "#################################");
			opcion = lector.nextInt();
			switch (opcion) {

			case 1:

				System.out.println("escoja el tipo de Póliza que desea \r\n" + "ingresar:\r\n"
						+ "1.a) Póliza General\r\n" + "2.b) Póliza Vip\r\n" + "Seleccione una opción:");
				int opcionPoliza = lector.nextInt();
				if (opcionPoliza == 1) {
					Poliza nuevaPoliza = new Poliza();
					System.out.println("Ingrese un nombre ");
					String nombre = teclado.nextLine();
					System.out.println("Ingrese una descripcion ");
					String descripcion = teclado.nextLine();
					System.out.println("Ingrese año de vigencia ");
					int anoVigencia = lector.nextInt();
					System.out.println("Ingrese codigo de la Poliza");
					int codigoPoliza = lector.nextInt();
					System.out.println("Ingrese valor de la Poliza ");
					int valorPoliza = lector.nextInt();
					System.out.println("Ingrese codigo descuento ");
					int codigoDescuento = lector.nextInt();
					System.out.println("Ingrese numero de seguro ");
					int numeroSeguro = lector.nextInt();

					nuevaPoliza.setNombre(nombre);
					nuevaPoliza.setDescripcion(descripcion);
					nuevaPoliza.setAnoVigencia(anoVigencia);
					nuevaPoliza.setCodigoPoliza(codigoPoliza);
					nuevaPoliza.setValorPoliza(valorPoliza);
					nuevaPoliza.setCodigoDescuento(codigoDescuento);
					nuevaPoliza.setNumeroSeguro(numeroSeguro);

					ListPoliza.add(nuevaPoliza);

				} else if (opcionPoliza == 2) {

					Poliza nuevaPoliza = new Poliza();
					System.out.println("Ingrese un nombre ");
					String nombre = teclado.nextLine();
					System.out.println("Ingrese una descripcion ");
					String descripcion = teclado.nextLine();
					System.out.println("Ingrese año de vigencia ");
					int anoVigencia = lector.nextInt();
					System.out.println("Ingrese codigo de la Poliza");
					int codigoPoliza = lector.nextInt();
					System.out.println("Ingrese valor de la Poliza ");
					int valorPoliza = lector.nextInt();
					System.out.println("Ingrese su beneficio ");
					int beneficio = lector.nextInt();
					nuevaPoliza.setNombre(nombre);
					nuevaPoliza.setDescripcion(descripcion);
					nuevaPoliza.setAnoVigencia(anoVigencia);
					nuevaPoliza.setCodigoPoliza(codigoPoliza);
					nuevaPoliza.setValorPoliza(valorPoliza);
					nuevaPoliza.setBeneficio(beneficio);
					ListPoliza.add(nuevaPoliza);

				} else {
					System.out.println("No esiste esa opcion");

				}
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
