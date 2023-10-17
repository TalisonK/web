package br.com.ifpb.gerenciador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	public static List<Produto> listaProdutos = new ArrayList<Produto>();;

	public void adiciona(Produto Produto) {
		listaProdutos.add(Produto);

	}

	public List<Produto> getProdutos() {
		return Banco.listaProdutos;
	}
	
	public void removeProduto(Integer id) {
		Iterator<Produto> it = listaProdutos.iterator();
		while(it.hasNext()) {
			Produto prod = it.next();
			if(prod.getId() == id) {
				it.remove();
			}
		}
	}
	
	public Produto buscaProdutoPeloId(Integer id) {
		for (Produto prod : listaProdutos) {
			if(prod.getId() == id) {
				return prod;
			}
		}
		return null;
	}

}
