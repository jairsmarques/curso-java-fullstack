package cursojava.executavel;

public class Concatenacao {

	public static void main(String[] args) {
		
		String nome = "João";
		String cpf = "123.123.123.89";
		String telefone = "11 99090-1111";
		String endereco = "Rua Paulista, 22";
		
		System.out.println("O Sr. " 
						+ nome 
						+ " de CPF: " 
						+ cpf 
						+ " e telefone: " 
						+ telefone
						+ " mora no endereço: " +
						endereco);

	}

}
