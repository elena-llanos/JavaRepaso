package examenEvalUno;

import java.util.Scanner;

public class Ejercicio3 {

	static Scanner teclado = new Scanner(System.in);
	static String opcion;


	public static void main(String[] args) {
		// TODO Auto-generated method stub	



		do {
			System.out.println("Men� de opciones\n"

				+ "1-Opcion A \t \r\n"
				+ "2-Opcion B\t \r\n"
				+ "3-Opcion C\t \r\n"
				+ "4-Opcion D\t \r\n"
				+ "0- Salir\n");

			opcion = teclado.next();


			switch (opcion) { 


			case "A" :
				metodo1(opcion);
				break;

			case "B":
				metodo2();
				break;

			case "C":
				metodo3();
				break;
			case "D":
				metodo4();
				break;
			case "0":
				System.out.println("Salir");
				break;
			default:
				System.out.println("Has elegido Opci�n " + opcion);
				System.out.println("La opcion  " + opcion + "  no es correcta");

			}
		}while(!(opcion.equalsIgnoreCase("A") && opcion.equalsIgnoreCase("B") && opcion.equalsIgnoreCase("C") && opcion.equalsIgnoreCase("D") ));

	}







	public static void metodo1(String opcion){
		System.out.print("Has seleccionado la opci�n: " + opcion + "\n" );
		System.out.println("Ejecutando la opci�n: " + opcion  );





	}
	public static void metodo2(){
		System.out.print("Has seleccionado la opci�n: " + opcion + "\n" );
		System.out.print("Ejecutando la opci�n: " + opcion  );


	}
	public static void metodo3(){
		System.out.print("Has seleccionado la opci�n: " + opcion + "\n" );
		System.out.print("Ejecutando la opci�n: " + opcion  );


	}
	public static void metodo4(){
		System.out.print("Has seleccionado la opci�n: " + opcion + "\n" );
		System.out.print("Ejecutando la opci�n: " + opcion  );


	}
}








