package model;

import java.util.ArrayList;

import Sabores.Cerveja;

public class FactoryPedido {

	public static IPedido criarPedido(ArrayList<Cerveja> pedido, Cliente cliente) {
		
		IPedido pedidoInterface = null;
		
		pedidoInterface = new Pedido(pedido, cliente);
		pedidoInterface.valorPedido(pedido);
		
		return pedidoInterface;
	}
}
