package model;

import Sabores.SaborCerejaAmendoas;
import Sabores.SaborLagger;
import Sabores.SaborLaranja;
import Sabores.SaborPilsen;
import Sabores.SaborPuroMalte;
import Sabores.SaborTrigo;
import Sabores.SemAlcool;

public class CervejaFactory {
	
	public static Cervejaria criarCerveja(String sabor, String codigo, String dataProducao, String dataValidade, double preco) {
		
		Cervejaria cervejaInterface = null;
		
		switch (sabor) {
		
			case "CEREJA COM AMÊNDOAS":
				cervejaInterface = new SaborCerejaAmendoas(codigo, sabor,dataProducao,dataValidade,preco);
				System.out.println(cervejaInterface.criarCerveja()+"\n"+cervejaInterface.toString());
				break;
			
			case "LAGGER":
				cervejaInterface = new SaborLagger(codigo, sabor, dataProducao,dataValidade,preco);
				System.out.println(cervejaInterface.criarCerveja()+"\n"+cervejaInterface.toString());
				break;
				
			case "LARANJA":
				cervejaInterface = new SaborLaranja(codigo, sabor, dataProducao,dataValidade,preco);
				System.out.println(cervejaInterface.criarCerveja()+"\n"+cervejaInterface.toString());
				break;
				
			case "PILSEN":
				cervejaInterface = new SaborPilsen(codigo, sabor, dataProducao,dataValidade,preco);
				System.out.println(cervejaInterface.criarCerveja()+"\n"+cervejaInterface.toString());
				break;
				
			case "PURO MALTE":
				cervejaInterface = new SaborPuroMalte(codigo, sabor, dataProducao,dataValidade,preco);
				System.out.println(cervejaInterface.criarCerveja()+"\n"+cervejaInterface.toString());
				break;
				
			case "TRIGO":
				cervejaInterface = new SaborTrigo(codigo, sabor, dataProducao,dataValidade,preco);
				System.out.println(cervejaInterface.criarCerveja()+"\n"+cervejaInterface.toString());
				break;
				
			case "SEM ÁLCOOL":
				cervejaInterface = new SemAlcool(codigo, sabor, dataProducao,dataValidade,preco);
				System.out.println(cervejaInterface.criarCerveja()+"\n"+cervejaInterface.toString());
				break;
				
		}
		
		return cervejaInterface;
		
	}
	
}
