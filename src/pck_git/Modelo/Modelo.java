package pck_git.Modelo;

public class Modelo {
	private int codigo;
	private String nome;
	private String email;
	private String senha;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String hideSenha() {
		getSenha();
		int h = getSenha().length();
		String hSenha = "";
		for(int i=0; i<h;i++) {
			hSenha+="*";
		}
		return hSenha;
		
	}
	@Override
	public String toString() {
		return "Usuario [codigo=" + getCodigo() + ", nome=" + getNome() + ", email=" + getEmail() + ", senha=" + hideSenha() + "]";
	}
	

}
