package Nivell1.Singleton;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				System.out.println("Introduce articulo");
				String articulo = sc.nextLine();
				System.out.println("Introduce cantidad");
				int cantidad = sc.nextInt();
				sc.nextLine();
				Undo.getInstancia().agregar(articulo, cantidad);
				break;
			case 2:
				Undo.getInstancia().deshacer();
				break;
			case 3:
				System.out.println("Introduce el articulo que desea eliminar");
				String articuloeliminar = sc.nextLine();
				Undo.getInstancia().eliminarConcreto(articuloeliminar);
				break;
			case 4:
				System.out.println(Undo.getInstancia().toString());
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicacion. Hasta pronto");
				salir = true;
				break;
			}
		} while (!salir);

	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Añadir pedido");
			System.out.println("2. Deshacer");
			System.out.println("3. Eliminar un pedido concreto");
			System.out.println("4. Listar pedidos");
			System.out.println("0. Salir del programa");
			opcion = sc.nextByte();
			sc.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoje una opcion valida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	
}
