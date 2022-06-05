public class Usuario {
	private String nome;
	private String senha;
	
	public void Registra(String nomeLocal, String senhaLocal) {
		this.nome = nomeLocal;
		this.senha = senhaLocal;
	}

	public boolean ValidaUsuario(String nomeLocal, String senhaLocal) {
		if (nomeLocal.equals(this.nome) && senhaLocal.equals(this.senha)) {
			return true;
		}return false;
		
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

}
