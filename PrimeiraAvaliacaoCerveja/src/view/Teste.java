package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Sabores.Cerveja;
import model.CervejaFactory;
import model.Cervejaria;
import model.Cliente;
import model.FactoryPedido;
import model.IPedido;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cerveja> estoque = new ArrayList<Cerveja>();
		Cliente cliente = new Cliente();
		ArrayList<Cerveja> minhaSacola = new ArrayList<Cerveja>();
		
		boolean decisao = true;
		while(decisao) {
			//MENU DE ENTRADA
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "--------Cadastrar Cerveja-----------"+"\n"+
			"1 - Cadastrar Cerveja \n2 - Fazer Pedido \n3 - Sair"));
			//CADASTRAR CERVEJA
			if(opcao == 1) {
				String sabor = JOptionPane.showInputDialog("Digite o sabor da Cerveja");
				String codigo = JOptionPane.showInputDialog("Digite o código da Cerveja");
				String dataProducao = JOptionPane.showInputDialog("Digite a data de produção da Cerveja");
				String dataValidade = JOptionPane.showInputDialog("Digite a data de validade da Cerveja");
				double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Cerveja"));
				//CHAMANDO A FACTORY
				Cervejaria cerveja = CervejaFactory.criarCerveja(sabor.toUpperCase(), codigo.toUpperCase(), dataProducao,dataValidade,preco);
				//GUARDAR PRODUTO NO ESTOQUE
				estoque.add((Cerveja) cerveja);
			//FAZER PEDIDO
			}else if(opcao ==2) {
				
				cliente.setNome(JOptionPane.showInputDialog("Digite Seu nome: "));
				cliente.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
				//MOSTRAR CERVEJAS NO ESTOQUE	
				JOptionPane.showMessageDialog(null, "------------- "
													+ "Estoque de Cerveja --------------\n"
													+" - "+estoque);
				
				//ESCOLHER CERVEJA
				String sabor = JOptionPane.showInputDialog("Digite o sabor da cerveja que você colocar na sua sacola");
				
				for (int i = 0; i < estoque.size(); i++) {
					//PROCURANDO CERVEJA
					if(sabor.toUpperCase().equals(estoque.get(i).getSabor())) {
						minhaSacola.add(estoque.get(i));
					}else {
						JOptionPane.showMessageDialog(null,"Cerveja não existe");
					}
				}
				//FINALIZAR PEDIDO
				IPedido pedido = FactoryPedido.criarPedido(minhaSacola, cliente);
				
				JOptionPane.showMessageDialog(null, pedido);
			//SAIR
			}else if(opcao == 3) {
				
				decisao = false;
			}
			
			
			
			
		}
		

	}

}
