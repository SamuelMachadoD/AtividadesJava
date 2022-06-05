import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionarios?");
		int numeroDeFuncionario = sc.nextInt();

		Funcionarios[] funcionario = new Funcionarios[numeroDeFuncionario];

		sc.nextLine();
		for (int i = 0; i < funcionario.length; i++) {
			funcionario[i] = new Funcionarios();

			System.out.println(1 + i + " - Digite o nome do funcionario:");
			String nome = sc.nextLine();
			System.out.println(1 + i + " - Digite o salario do funcionario:");
			float salario = Float.parseFloat(sc.nextLine());

			funcionario[i].Registra(nome, salario);
		}

		for (int i = 0; i < funcionario.length; i++) {
			System.out.println("Nome: " + funcionario[i].getNome());
			System.out.println("Salario: " + funcionario[i].getSalario());
			if (funcionario[i].getValor() < 0) {
				System.out.println("Desconto: " + funcionario[i].getValor());
			} else {
				System.out.println("Bonus: " + funcionario[i].getValor());
			}
			System.out.println("Salario liquido: " + funcionario[i].getSalarioLiquido());
			System.out.println(" ");
		}
	}

}
