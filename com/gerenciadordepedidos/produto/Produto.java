package com.gerenciadordepedidos.produto;
import java.util.UUID;

public class Produto {
	
	private String nome;
	private double preco;
	private String id;
	
	public Produto() { this.nome = ""; this.preco = 0; this.id = UUID.randomUUID().toString(); }
	
	public Produto(String nome, double preco) { this.nome = nome; this.preco = preco;  this.id = UUID.randomUUID().toString(); }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public void setPreco(double preco) { this.preco = preco; }
	
	public String getNome() { return nome; }
	
	public double getPreco() { return preco; }
	
	public void setId(String id) { this.id = id; }
	
	public String getId() { return id; }
	
	public String toString() {
		
		return "Nome: " + nome + "\nPreço: " + preco + "\nId: " + id;
		
				
	
	
	
	
	
	}

}