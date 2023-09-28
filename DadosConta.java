package ExerciciosPOO;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DadosConta{

	// Declarando os atributos do Objeto DadosConta.

	int numeroDaConta;

	String nomeDoTitular;

	Double saldo;

	int Agencia;

	String banco;

	public DadosConta() {

		this.nomeDoTitular = "ABCDE";

		this.numeroDaConta = (int) (Math.random() * 300);

		this.saldo = 3456.2;

		this.Agencia = (int) (Math.random() * 500);

		this.banco = "BANCO NACIONAL";

	}

	public void MostraDados() {

		String valorFormatado;

		DecimalFormat df = new DecimalFormat("R$ ####.#");

		valorFormatado = df.format(saldo);

		JOptionPane.showMessageDialog(null,
				"DADOS DA CONTA" + "\nNome do Titular :  " + nomeDoTitular + "\nNúmero da Conta :  " + numeroDaConta
						+ "\nSaldo Atual da conta :  " + valorFormatado + "\nAgência : " + Agencia + "\nBanco : "
						+ banco);

	}

	public Double Depositar(Double deposito) {

		String valorFormatado;

		DecimalFormat df = new DecimalFormat("R$ ####.#");

		Double resultadoFinal = deposito + saldo;

		if (deposito <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a 0");

		}

		else {

			valorFormatado = df.format(resultadoFinal);

			JOptionPane.showMessageDialog(null,
					"Valor inicial = " + saldo + "\nValor após o deposito = " + valorFormatado);
		}

		return deposito;
	}

	public Double Sacar(Double saque) {

		String valorFormatado;

		Double resultadoFinal = saque - saldo;

		DecimalFormat df = new DecimalFormat("R$ ####.##");

		if (saque > saldo) {

			JOptionPane.showMessageDialog(null, "Valor do Saldo atual = " + saldo + "\nValor da tentativa do Saque = "
					+ saque
					+ "\nERRO!! Não foi possível sacar pois o valor inserido é maior que a quantidade disponível em sua conta");
		}

		else {

			valorFormatado = df.format(resultadoFinal);

			JOptionPane.showMessageDialog(null,
					"SAQUE EFETUADO COM SUCESSO!!!" + "\nValor do saldo da conta =  " + saldo + "\nValor do saque = "
							+ saque + "\nValor restante na conta após a operação = " + valorFormatado);

		}

		return saque;
	}

}
