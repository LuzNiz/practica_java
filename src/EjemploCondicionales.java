
public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Hello Word");

		int age = 17;
		int cantidad = 2;

		if (age >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad" 
						+ " pero está permitido su ingreso");
			} else
				System.out.println("Usted no está permitido" 
						+ " a entrar");
		}

	}
}
