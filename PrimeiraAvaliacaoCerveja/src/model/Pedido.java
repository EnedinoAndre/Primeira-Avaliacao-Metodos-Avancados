package model;

import java.util.ArrayList;

import Sabores.Cerveja;

public class Pedido implements IPedido {
	
	private ArrayList<Cerveja> cerveja = new ArrayList<>();
	private Cliente cliente;
	private double valor;
	
	public Pedido(ArrayList<Cerveja> cerveja, Cliente cliente) {
		
		this.cerveja = cerveja;
		this.cliente = cliente;
	}

	public ArrayList<Cerveja> getCerveja() {
		return cerveja;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public double valorPedido(ArrayList<Cerveja> cervejas) {
		
		for(int i = 0; i < cervejas.size(); i++) {
			this.valor = this.valor + cervejas.get(i).getPreco();
		}
		return this.valor;
	}

	@Override
	public String toString() {
		return "Pedido \n[cerveja=" + cerveja + ", \n cliente=" + cliente + ", \nvalor=" + valor + "]";
	}

}
