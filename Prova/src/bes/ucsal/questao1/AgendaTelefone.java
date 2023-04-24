package bes.ucsal.questao1;

/*Sabendo-se que uma agenda telefonica é composta por nomes de contatos e numeros de telefone, e ,
 * possui as operações de adicionar novo contato, atualizar numero do telefone do contato, e 
 * remover contato.
 * Crie em java um TAD para representar essas operações
 * */

public class AgendaTelefone implements agendaString {

	private Contato[] contatos;

	public AgendaTelefone(int tamanhoMax) {
		this.contatos = new Contato[tamanhoMax];
	}

	@Override
	public void adicionarContato(String nome, String numeroTelefone) {
		for (int i = 0; i < contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = new Contato(nome, numeroTelefone);
				break;
			}
		}

	}

	@Override
	public void atualizarContato(String nome, String numeroTelefone) {
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null && contatos[i].getNome().equals(nome)) {
				contatos[i].setNumeroTelefone(numeroTelefone);
				break;
			}
		}
		
	}

	@Override
	public void removerContato(String nome) {
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null && contatos[i].getNome().equals(nome)) {
				contatos[i] = null;
				break;
			}
		}

	}
	
	public String toString() {
		String agendaStr = "Contatos na agenda:\n";
		boolean contat = false;
		for(int i=0;i<contatos.length;i++) {
			if(contatos[i]!=null) {
				agendaStr+= "[" + (i+1) + "]" + contatos[i].getNome() + " - " + contatos[i].getNumeroTelefone() + "\n";
				contat = true;
			}
		}
		if(!contat) {
			agendaStr = "Agenda Vazia!";
		}
		return agendaStr;
	}
	
	public static void main(String[] args) {
		
		AgendaTelefone agenda = new AgendaTelefone(3);
		
		agenda.adicionarContato("joao", "0001212");
		agenda.adicionarContato("carlos", "0955512");
		
		System.out.println(agenda.toString());
		
		agenda.atualizarContato("carlos", "00000000");
		System.out.println(agenda.toString());
		
		agenda.removerContato("carlos");
		System.out.println(agenda.toString());
		
		
		
	}

}
