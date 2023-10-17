package br.com.ifpb.gerenciador;

import java.util.Date;

public class Produto {
	
	private static int produtoCount = 1;
	private int id;
	private String nome;
	private Double preco;
	private Date validade;
	
	
	public Produto() {
		setId(produtoCount++);
	}


	public Produto(String nome, Double preco, Date validade) {
		this();
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public void setValidade(Date validade) {
		this.validade = validade;
	}


	public int getId() {
		return id;
	}


	private void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public Double getPreco() {
		return preco;
	}


	public Date getValidade() {
		return validade;
	}
	
	
	
	
}
