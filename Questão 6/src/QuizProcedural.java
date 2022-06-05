
//Importando scanner para a digitação do ususario
import java.util.Scanner;

public class QuizProcedural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acertadas = 0;
		int erradas = 0;
		char resposta = 0;
		System.out.println("Qual o seu nome?");
		String nome = sc.nextLine();

		System.out.println("Okay, " + nome + "! Vamos comecar o quiz!");
		System.out.println("De quem e a famosa frase 'penso logo existo' ?");
		System.out.println("1 - Platao / 2 - Galileu / 3 - Descartes / 4 - Socrates");
		resposta = sc.next().charAt(0);
		if (resposta == '1') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '2') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '3') {
			System.out.println("ACERTOU! Proxima..");
			acertadas++;
		} else if (resposta == '4') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else {
			System.out.println("Resposta invalida!"); // melhorar tratamento
		}

		System.out.println("Quais o menor e o maior pais do mundo?");
		System.out.println(
				"1 - Vaticano e Russia / 2 - Nauru e China / 3 - Monaco e Canada / 4 - Malta e Estados Unidos");
		resposta = sc.next().charAt(0);
		if (resposta == '1') {
			System.out.println("ACERTOU! Proxima..");
			acertadas++;
		} else if (resposta == '2') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '3') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '4') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else {
			System.out.println("Resposta invalida!"); // melhorar tratamento
		}

		System.out.println("Qual o livro mais vendido no mundo a seguir a Biblia?");
		System.out.println(
				"1 - O Senhor dos Aneis / 2 - Dom Quixote / 3 - O Pequeno Principe / 4 - Um Conto de Duas Cidades");
		resposta = sc.next().charAt(0);
		if (resposta == '1') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '2') {
			System.out.println("ACERTOU! Proxima..");
			acertadas++;
		} else if (resposta == '3') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '4') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else {
			System.out.println("Resposta invalida!"); // melhorar tratamento
		}

		System.out.println("Quantas casas decimais tem o numero pi?");
		System.out.println("1 - Duas / 2 - Centenas / 3 - Infinitas / 4 - Milhares");
		resposta = sc.next().charAt(0);
		if (resposta == '1') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '2') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else if (resposta == '3') {
			System.out.println("ACERTOU! Proxima..");
			acertadas++;
		} else if (resposta == '4') {
			System.out.println("Errado! Proxima..");
			erradas++;
		} else {
			System.out.println("Resposta invalida!"); // melhorar tratamento
		}

		System.out.println("Jogador " + nome);
		System.out.println("Acertou " + acertadas + " perguntas!");
		System.out.println("Errou " + erradas + " perguntas!");

	}

}
