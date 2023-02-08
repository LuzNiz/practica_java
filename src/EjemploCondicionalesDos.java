
public class EjemploCondicionalesDos {
	public static void main(String[] args) {
		System.out.println("Hello Word");

		int age = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = age >= 18 && esPareja ;

		System.out.println("El valor de la condición es: " + esPareja);
		
		if (puedeEntrar ) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		} else {
				System.out.println("Usted no está permitido" 
						+ " a entrar");
		}
	}
}
