
public class EstruturaRepeticaoDoWhile {

	public static void main(String[] args) {
		
		int numero = 0;
		
		do {// primeiro executa e depois verifica
			System.out.println("O número atual é: " + numero);
			numero++;
		} while(numero <= 10);

	}

}
