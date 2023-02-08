
public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hello Word");

		int age = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		//boolean puedeEntrar = age >= 18 && esPareja ;
		
		if(cantidadPersonas > 1) {
			esPareja = true;
		}else {
			esPareja = false;
		}

		System.out.println("El valor de la condición es: " + esPareja);
		
		if (age >= 18 && esPareja ) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		} else {
				System.out.println("Usted no está permitido" 
						+ " a entrar");
		}
	}
}
