package com.gerenciadordepedidos.view;
import java.util.Scanner;
import com.gerenciadordepedidos.produto.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;

public class View {
	
	Produto p = new Produto();
	
	Scanner input;
	
	public View () { input = new Scanner(System.in); }
	
	public int menuPrincipal() {
		
		System.out.println("+-----------------------------------------+");
		System.out.println("|        🛍️ Bem-vindo ao E-Commerce!      |");
		System.out.println("+-----------------------------------------+");
		System.out.println("| 1 - Realizar Pedido                     |");
		System.out.println("| 2 - Cancelar Pedido                     |");
		System.out.println("| 3 - Consultar Pedido                    |");
		System.out.println("| 4 - Sair                                |");
		System.out.println("+-----------------------------------------+");
		System.out.print("Digite a opção desejada: ");
		
		int opcao = input.nextInt();
		return opcao;
		
	}
	
	public Produto cadastrarPedido(Produto p) {
	    System.out.println("+-----------------------------------------+");
	    System.out.println("|           🛒 Realizar Pedido            |");
	    System.out.println("+-----------------------------------------+");

	    input.nextLine(); 

	    System.out.print("| Insira o Nome do Produto: ");
	    String nomeProduto = input.nextLine();

	    System.out.print("| Insira o Preço do Produto: ");
	    double precoProduto = input.nextDouble();
	    input.nextLine(); 

	    System.out.println("+-----------------------------------------+");

	   
	    System.out.println(String.format("| Produto: %-32s|", nomeProduto));
	    System.out.println(String.format("| Preço:   R$ %-29.2f|", precoProduto));
	    System.out.println("+-----------------------------------------+");

	    p = new Produto(nomeProduto, precoProduto);

	    System.out.println("================================================");
	    System.out.println("🎉 Pedido realizado com sucesso! 🎉");
	    System.out.println("Obrigado por comprar conosco.\nSeu pedido está sendo processado.");
	    System.out.println("Você receberá a confirmação e detalhes da entrega.");
	    System.out.println("================================================");

	    return p;
	}
	

	public LocalDate cancelarPedido() {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate dataPedido = null;

	    System.out.println("+-----------------------------------------+");
	    System.out.println("|          ❌ Cancelar Pedido              |");
	    System.out.println("+-----------------------------------------+");

	    while (dataPedido == null) {
	        System.out.print("| Por favor, insira a data do pedido (dd/MM/aaaa): ");
	        String dataStr = input.nextLine();

	        try {
	            dataPedido = LocalDate.parse(dataStr, formatter);
	        } catch (DateTimeParseException e) {
	            System.out.println("| Formato inválido! Por favor use dd/mm/aaaa.");
	        }
	    }
	    
	    return dataPedido;
	    
	}
	
	public String aceitarCancelar() {
	    System.out.println("+-----------------------------------------+");
	    System.out.println("|          ❌ Cancelar Pedido              |");
	    System.out.println("+-----------------------------------------+");
	    System.out.print("| Por favor, digite o ID do produto para cancelar: ");
	    
	    String id = input.nextLine();
	    System.out.println("+-----------------------------------------+");
	    
	    return id;
	}
	
	public void consultarInterface() {
		
		 System.out.println("+-----------------------------------------+");
		 System.out.println("|          Histórico de Pedidos           |");
	}
	
	public int consultarPedido(Produto p) {
		
	   
	    System.out.println("| Nome do Produto: " + p.getNome());
	    System.out.print("| Sua Escolha: ");
	    int escolha = input.nextInt();
	    
	    return escolha;
		
	}




}
