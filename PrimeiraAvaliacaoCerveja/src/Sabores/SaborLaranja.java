package Sabores;

import model.Cervejaria;

public class SaborLaranja extends Cerveja implements Cervejaria {
	
	public SaborLaranja() {
		super();
		
	}

	public SaborLaranja(String codigo, String sabor, String dataProducao, String dataValidade, double preco) {
		super(codigo, sabor, dataProducao, dataValidade, preco);
		
		super.sabor = sabor;
		super.setCodigo(codigo);
		super.setDataProducao(dataProducao);
		super.setDataValidade(dataValidade);
		super.setPreco(preco);
	}

	@Override
	public String criarCerveja() {
			
		return "Criando Cerveja "+super.getSabor();
	}
	
	public String toString() {
			
			return "\nSabor: "+super.getSabor() + "\n"+
					"C�digo: "+super.getCodigo() + "\n"+
					"Data de Produ��o: "+super.getDataProducao()+ "\n"+
					"Data de Validade: "+super.getDataValidade()+ "\n"+
					"Pre�o: "+super.getPreco() + " \n-----------------------------";
	}
}
