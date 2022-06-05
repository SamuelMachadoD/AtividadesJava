
import java.util.Scanner;
import java.util.Calendar;

public class Login {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Usuario[] users = new Usuario[3];
		String nome, senha;
		
		Calendar c = Calendar.getInstance();
		double hora = c.get(Calendar.HOUR_OF_DAY);
		
		for(int i = 0; i < users.length; i++) {
			users[i] = new Usuario();
			switch (i) {
			case 0:
				users[i].Registra("samuel", "abacaxi");
				break;
			case 1:
				users[i].Registra("renato", "123");
				break;
			case 2:
				users[i].Registra("marcos", "@34Sp");
				break;
			}
		}
			System.out.println("Usuario : ");
			nome = sc.nextLine();
			System.out.println("Senha : ");
			senha = sc.nextLine();
			for(int i = 0; users[i].ValidaUsuario(nome, senha) == false; i++) {
				if(i == 2) {
					System.out.println("Usuario e/ou Senha incorretos. Login nao encontrado");
					System.exit(0);
				}
			}
			
			if(hora >= 6 && hora < 12) {
				System.out.println("Bom dia, voce se logou ao nosso sistema.");
			}else if(hora >= 12 && hora < 18) {
				System.out.println("Boa tarde, voce se logou ao nosso sistema.");
			}else if(hora >= 18 && hora < 24) {
				System.out.println("Boa noite, voce se logou ao nosso sistema.");
			}else if(hora >= 0 && hora < 6) {
				System.out.println("Boa madrugada, voce se logou ao nosso sistema.");
			}
		
			
			

	}

}
