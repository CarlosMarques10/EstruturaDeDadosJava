package bes.ucsal.questao1;

public class Contato {

	private String nome;
	private String numeroTelefone;
	
	public Contato(String nome, String numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNumeroTelefone(String novoTelefone) {
		this.numeroTelefone = novoTelefone;
	}
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
}
