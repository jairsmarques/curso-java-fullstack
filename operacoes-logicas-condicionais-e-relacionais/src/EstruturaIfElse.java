
public class EstruturaIfElse {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 90;
		int nota3 = 10;
		int nota4 = 80;

		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado com média: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Você está reprovado com média: " + media);
		} else {
			System.out.println("Aluno reprovado com média: " + media);
		}

	}

}
