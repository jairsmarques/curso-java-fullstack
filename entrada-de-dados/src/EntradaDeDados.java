import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidades de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidades de pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é " + resto);
		}

	}

}
