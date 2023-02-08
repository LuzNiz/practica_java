
public class EjemploEnteros {
	public static void main(String[] args) {
		//age = 28 No compila porque falta definir el valor de la variable
		int age; //Declaración de la variable
		age = 28;
		
		//System.out.println("age"); No compila porque el parametro no es la variable, es un String
		System.out.println(age);
		
		age = 35 + 99; //Asignamos el valor del resultado de una operación aritmetica
		System.out.println(age);
		System.out.println("Mi edad es " + age); //Concatenamos un String con la variable age usando +
		
	}
}
