
public class EjemploCiclosWhileDos {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;

		while (contador <= 10) {
			//System.out.println(contador);
			total = total + contador;
			contador++;
		}
		System.out.println(total);
	}
}
