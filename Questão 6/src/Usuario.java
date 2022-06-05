import java.util.Scanner;

public class Usuario {
	private String nome;
	private int acertou;
	private int errou;
	Scanner sc = new Scanner(System.in);

	public Usuario() {
		System.out.println("Qual o seu nome?");
		this.nome = sc.nextLine();
	}

	public int getAcertou() {
		return acertou;
	}

	public void Acertou() {
		this.acertou++;
	}

	public int getErrou() {
		return errou;
	}

	public void Errou() {
		this.errou++;
	}

	public String getNome() {
		return nome;
	}

}
