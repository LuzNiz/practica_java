
public class EjemploConversiones {
	public static void main(String[] args) {
		double variableOne = 230.89;
		int variableInteger = (int)variableOne;
		//este metodo imprime en consola
		System.out.println(variableInteger);
		
		//int test = 122222222222222222; NO compila porque el numero esta fuera del rango aceptado por int
		long test = 122222222222222222L; //Se especifica con L para asignar valor a una variable tipo long
		
		int result = (int) variableOne + variableInteger; //forzamos el resultado en int
		System.out.println(result);
	}
}
