package ejercicio01;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Alumno[] alumnos = new Alumno[20];
		int posicion = 0;
		int num = 0;

		do {
			menu();
			System.out.println("Por favor introduzca una opcion: ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				listadoAlumnos(alumnos);
				break;
			case 2:
				posicion = posLibre(alumnos);
				if (posicion < 0) {
					System.out.println("No hay espacio para añadir un alumno nuevo.");
				} else {
					alumnoNuevo(alumnos, posicion);
					System.out.println("Información del alumno añadida");
				}
				break;
			case 3:
				modificaAlumno(alumnos);
				break;
			case 4:
				borrarAlumno(alumnos);
				break;
			case 5:
				despedida();
				break;

			default:
				System.out.println("Ha introducido una opción no válida");
				break;

			}
		} while (num != 5);
	}

	public static void menu() {
		System.out.println("Alumn@s");
		System.out.println("------------------------");
		System.out.println("| 1. Listado.           |");
		System.out.println("| 2. Nuevo Alumno.      |");
		System.out.println("| 3. Modificar.         |");
		System.out.println("| 4. Borrar.            |");
		System.out.println("| 5. Salir.             |");
		System.out.println("------------------------");
	}// fin del menu

	public static void listadoAlumnos(Alumno[] alumnos) {
		System.out.println();
		System.out.println("Los alumnos registrados son:");
		System.out.println("------------------------");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i]);
				System.out.println();
			}
		}
	}

	public static int posLibre(Alumno[] alumnos) {
		int hueco = 0;
		while (hueco < alumnos.length && alumnos[hueco] != null) {
			hueco++;
		}
		if (hueco == alumnos.length) {
			hueco = -1;
		}
		return hueco;
	}

	public static int alumnoNuevo(Alumno[] alumnos, int posicion) {
		System.out.println("Introduzca el nombre del alumno: ");
		String nombre = sc.next();
		System.out.println("Introduzca la nota media del alumno");
		double notaMedia = sc.nextDouble();
		alumnos[posicion] = new Alumno(nombre, notaMedia);
		return posicion;
	}

	public static void modificaAlumno(Alumno[] alumnos) {

		int indice = 0;
		String nombre = "";
		double notaMedia = 0;
		System.out.println("Por favor introduzca un alumno: ");
		nombre = sc.next();

		while (alumnos[indice] != null && indice < alumnos.length && !alumnos[indice].getNombre().equals(nombre)) {

			indice++;
		}
		if (indice >= alumnos.length || alumnos[indice] == null) {
			System.out.println("No existe el alumno.");
		} else {
			System.out.println("Por favor introduzca una nota: ");
			notaMedia = sc.nextDouble();
			alumnos[indice].setNotaMedia(notaMedia);
			System.out.println("Nota modificada con exito.");
		}
	}

	public static void borrarAlumno(Alumno[] alumnos) {
		int posicion = 0;
		String nombre = "";
		System.out.println("Introduzca el nombre del alumno que quiere borrar:");
		nombre = sc.next();
		if (posicion >= 0 && nombre != null) {
			alumnos[posicion] = null;
			System.out.println("Alumno eliminado con exito.");
		} else {
			System.out.println("No es posible eliminar un alumno que no existe.");
		}
	}

	public static void despedida() {
		System.out.println("Fin del programa.");
		System.out.println("Hasta luego!");
	}
}
