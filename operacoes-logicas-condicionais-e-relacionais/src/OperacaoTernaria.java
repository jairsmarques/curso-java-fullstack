
public class OperacaoTernaria {

	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 90;
		int nota3 = 10;
		int nota4 = 80;

		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno Aprovado com média = " + media : (media >= 40 && media <=69) ? "Aluno em Recuperação com média = " + media : "Aluno Reprovado com média = " + media;
		
		System.out.println(saidaResultado);

	}

}
