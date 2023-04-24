package listaEncadeada.inserirFinal;

public class ListaSimples {
	
	No inicio = null;
	int tamanho = 0;
	
	public void inserirFim(String info) {
		No no = new No();
		no.info = info;
		if(inicio==null) {
			inicio = no;
			no.proximo = null;
		}else {
			No local = inicio;
			while(local.proximo != null) {
				local = local.proximo;
			}
			local.proximo = no;
			no.proximo = null;
		}
		tamanho++;
		
	}
	
	public String toString() {
		String str = "(" + tamanho + ")";
		No local = inicio;
		while(local!=null) {
			str+=local.info+ " ";
			local = local.proximo;
		}
		return str;
	}
	
	public void remover(int posicao) {
	    if (posicao < 0 || posicao >= tamanho) {
	        throw new IndexOutOfBoundsException("Posição inválida");
	    }

	    No atual = inicio;
	    No anterior = null;

	    // Percorre a lista até chegar na posição desejada
	    for (int i = 0; i < posicao; i++) {
	        anterior = atual;
	        atual = atual.proximo;
	    }

	    // Atualiza os ponteiros para remover o nó da lista
	    if (anterior == null) {
	        // Se o nó a ser removido é o primeiro da lista
	        inicio = atual.proximo;
	    } else {
	        anterior.proximo = atual.proximo;
	    }
	    tamanho--;
	}
	
	public boolean buscar(String valor) {
	    No atual = inicio;
	    while (atual != null) {
	        if (atual.info.equals(valor)) {
	            return true;
	            
	        }
	        atual = atual.proximo;
	    }
	    return false;
	}


	}


