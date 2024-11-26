
public class OperacaoAninhada {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 90;
		int nota3 = 10;
		int nota4 = 10;

		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno está aprovado direto com média = " + media);
			} else {
				System.out.println("Aluno está em recuperação com média = " + media);
			}
		} else {
			System.out.println("Aluno reprovado com média = " + media);
		}

	}

}
