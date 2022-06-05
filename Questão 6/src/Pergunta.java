public class Pergunta {
	private String texto;
	private String[] respostas = new String[4];
	private int respostaCerta;

	public String getTexto() {
		return texto;
	}

	public void PerguntaInteira() {
		System.out.println(texto);
		for (int i = 0; i < respostas.length; i++) {
			System.out.print(respostas[i] + " / ");
		}

	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void populaRespostas(String text1, String text2, String text3, String text4, int resposta) {
		this.respostaCerta = resposta;
		for (int i = 0; i < respostas.length; i++) {
			respostas[i] = new String();
			switch (i) {
			case 0:
				respostas[i] = text1;
				break;
			case 1:
				respostas[i] = text2;
				break;
			case 2:
				respostas[i] = text3;
				break;
			case 3:
				respostas[i] = text4;
				break;
			}
		}

	}

	public int getRespostaCerta() {
		return respostaCerta;
	}

}
