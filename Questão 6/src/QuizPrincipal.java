
//Importando scanner para a digitação do ususario
import java.util.Scanner;

public class QuizPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		Pergunta[] perguntas = new Pergunta[4];
		for (int i = 0; i < perguntas.length; i++) {
			perguntas[i] = new Pergunta();
			switch (i) {
			case 0:
				perguntas[i].setTexto("De quem e a famosa frase 'penso logo existo'?");
				perguntas[i].populaRespostas("1 - Platao", "2 - Galileu", "3 - Descartes", "4 - Socrates", 3);
				break;
			case 1:
				perguntas[i].setTexto("Quais o menor e o maior pais do mundo?");
				perguntas[i].populaRespostas("1 - Vaticano e Russia", "2 - Nauru e China", "3 - Monaco e Canada", "4 - Malta e Estados Unidos", 1);
				break;
			case 2:
				perguntas[i].setTexto("Qual o livro mais vendido no mundo a seguir a Biblia?");
				perguntas[i].populaRespostas("1 - O Senhor dos Aneis", "2 - Dom Quixote", "3 - O Pequeno Principe", "4 - Um Conto de Duas Cidades", 2);
				break;
			case 3:
				perguntas[i].setTexto("Quantas casas decimais tem o numero pi?");
				perguntas[i].populaRespostas("1 - Duas", "2 - Centenas", "3 - Infinitas", "4 - Milhares", 3);
				break;
			}

		}

		for (int i = 0; i < perguntas.length; i++) {
			perguntas[i].PerguntaInteira();
			int resposta = sc.nextInt();
			if (resposta == perguntas[i].getRespostaCerta()) {
				System.out.println("ACERTOU, proxima pergunta..");
				usuario.Acertou();
				continue;
			} else if (resposta >= 0 && resposta <= 4) {
				System.out.println("ERROU, proxima pergunta..");
				usuario.Errou();
				continue;
			} else {
				System.out.println("Entrada invalida! Tente novamente");
				i--;
			}
		}

		System.out.println("Acabou!");
		System.out.println("Jogador " + usuario.getNome());
		System.out.println("Acertou " + usuario.getAcertou() + " perguntas!");
		System.out.println("Errou " + usuario.getErrou() + " perguntas!");

	}

}
