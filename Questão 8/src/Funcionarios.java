import java.util.Scanner;

public class Funcionarios {
	private String nome;
	private float salario;
	private double valor;
	private double salarioLiquido;
	private static int total;

	public void Registra(String nome, float salario) {
		this.nome = nome;
		if (salario >= 0) {
			this.salario = salario;
		} else {
			System.out.println("salario invalido - sera colocado 1000 de salario");
			this.salario = 1000;
		}
		Bonificacao();
		total++;
	}

	public void Bonificacao() {
		if (this.salario <= 1000) {
			this.valor = this.salario * 0.2;
			this.salarioLiquido = this.salario + this.valor;
		} else if (this.salario > 1000 && this.salario <= 2000) {
			this.valor = this.salario * 0.1;
			this.salarioLiquido = this.salario + this.valor;
		} else {
			this.valor = this.salario * 0.1;
			this.salarioLiquido = this.salario - this.valor;
			this.valor *= -1;
		}
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public double getValor() {
		return valor;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}
}
