package com.gerenciadordepedidos.pedido;

import com.gerenciadordepedidos.produto.Produto;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import com.gerenciadordepedidos.view.*;

public class Pedido {
	
	View view = new View();
	Produto p = new Produto();
    
    private List<Produto> pedidos;
    private LocalDate dataPedido;
    
    public Pedido() { pedidos = new ArrayList<>(); dataPedido = LocalDate.now(); }
    
    public List<Produto> getPedidos() { return pedidos; }
    
    public LocalDate getDataPedido() {return dataPedido; }
    
    public void setData(LocalDate dataPedido ) { this.dataPedido = dataPedido; }
    
    public LocalDate getData() { return dataPedido; }
    
    public void gerenciarPedidos(int opcaoMenu) {
    	
    	switch (opcaoMenu) {
    	
    		case 1 -> { Produto produto = view.cadastrarPedido(p); pedidos.add(produto); }

    		case 2 -> {
    		
    			LocalDate dataPedidoCliente = view.cancelarPedido();
    			long diasComparado = ChronoUnit.DAYS.between(dataPedidoCliente, dataPedido);
    		
    			if (diasComparado <= 5) {
    			
    				String id = view.aceitarCancelar();
    				boolean removido = pedidos.removeIf(p -> p.getId().equals(id));

    				try {
    				    if (removido) {
    				        System.out.println("Produto removido com sucesso!");
    				    } else {
    				        System.out.println("Produto com ID informado não encontrado.");
    				    }
    				} catch (Exception e) {
    				    System.out.println("Ocorreu um erro ao tentar remover o produto: " + e.getMessage());
    				    e.printStackTrace();  
    				}
    			}
    		}
    		
    		case 3 -> { for ( Produto p : pedidos) { view.consultarInterface(); int escolha = view.consultarPedido(p); }

    		}
    	
    	}
    	
    }
    
}
