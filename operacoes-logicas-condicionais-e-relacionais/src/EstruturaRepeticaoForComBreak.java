
public class EstruturaRepeticaoForComBreak {

	public static void main(String[] args) {
		
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Número atual = " + numero);
			if (numero == 7) {
				System.out.println("Obaaaaaaa, encomntrei o numero 7");
				System.out.println("estou parando de executar");
				break;
			}
		}
	}

}
