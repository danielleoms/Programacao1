
public class TesteBreakContinue1 {

	public static void main(String[] args) {
		int numero;
		int contador;
		int resto;
		int numDivisores;
		int totalNumeros = 10;
		for (numero=2;numero<=totalNumeros;numero++) {
			numDivisores = 0;
			contador = 1;
			while (contador<=numero) {
				resto = numero % contador;
				if (resto==0) {
					numDivisores++;
					if (numDivisores>2) { // N�o � primo
						break; // Sai do loop
					}
				}
				contador++;
			}
			if (numDivisores>2)
				continue; // N�o seguir� para a linha abaixo
			System.out.println(numero + " � um n�mero primo.");
		}
	}
}
