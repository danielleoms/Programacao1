
public class TesteDoWhiles2 {

	public static void main(String[] args) {
		int numero = 3;
		if (numero<1 || numero>10) {
			System.out.println("Número fora do intervalo permitido");
		} else {
			int contador = 0;
			do {
				System.out.println(numero + "x" + contador + "=" + numero*contador);
				contador++;
			} while (contador<=10);
		}
	}

}
