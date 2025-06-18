package com.gerenciadordepedidos;

import com.gerenciadordepedidos.pedido.*;
import com.gerenciadordepedidos.produto.*;
import com.gerenciadordepedidos.view.*;

public class Main {

	public static void main(String[] args) {
	
		Pedido pedido = new Pedido();
		Produto produto = new Produto();
		View view = new View();

		boolean continuar = true;
		while(continuar) {
			
			int opcao = view.menuPrincipal();
			pedido.gerenciarPedidos(opcao);
			
			if (opcao == 4) { break; }
		
		}
		
	}

}
