package ExerciciosPOO;

import javax.swing.JOptionPane;

public class ContaBancaria {

	public static void main(String[] args) {

		/*
		 * Exercício 3: Conta Bancária Crie uma classe ContaBancaria com atributos como
		 * número da conta, nome do titular e saldo. Implemente métodos para depositar,
		 * sacar e consultar saldo. Crie instâncias dessa classe e execute operações de
		 * depósito, saque e consulta de saldo.
		 */

		DadosConta Conta = new DadosConta();

		int opcao = 0;

		do {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"SEJA BEM VINDO AO BANCO NACIONAL \n1-Mostrar os Dados da conta \n2-Depositar \n3-Sacar"));

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente ou inseriu dados inválidos");

			}

			switch (opcao) {

			case 1:

				Conta.MostraDados();

				break;

			case 2:

				Double deposito = null;

				try {

					deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do deposito"));

				} catch (NumberFormatException | NullPointerException erro) {

					JOptionPane.showMessageDialog(null,
							"Você inseriu dados inválidos ou fechou o programa incorretamente");

				}

				Conta.Depositar(deposito);

				break;

			case 3:

				Double saque = null;

				try {

					saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque"));

				} catch (NumberFormatException | NullPointerException erro) {

					JOptionPane.showMessageDialog(null,
							"Você inseriu dados inválidos ou fechou o programa incorretamente");

				}

				Conta.Sacar(saque);

				break;

			default:

				JOptionPane.showMessageDialog(null, "Nenhuma opção foi selecionada");

				break;

			}

		} while (opcao > 0);

	}

}
