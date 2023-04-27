
public class TesteFor2 {

	public static void main(String[] args) {
		int numero = 2;
		if (numero<1 || numero>10) {
			System.out.println("Número fora do intervalo permitido");
		} else {
			for (int contador = 0; contador <= 10; contador++) {
				System.out.println(numero + "x" + contador + "=" + numero*contador);
			}
		}
	}
}
