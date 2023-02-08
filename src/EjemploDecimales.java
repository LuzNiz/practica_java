
public class EjemploDecimales {
	public static void main(String[] args) {
		//int salary = 1250.88 No compila porque un valor decimal no cabe en una varible tipo int
		double salary = 1250.88;
		System.out.println(salary);
		
		double age = 28; //Numeros enteros si ueden ser asignados a varibles tipo double
		double salaryMiddle = salary / 2;
		System.out.println(salaryMiddle); //Podemos usar variables directamente en operaciones matemeticas
		
		int division = 1250 / 3; //Compila, a esar de resultar en un valor decimal
		System.out.println(division); //Ignora por completo la parte decimal, NO REDONDEA, solo toma la parte entera
		
		
	}
}
