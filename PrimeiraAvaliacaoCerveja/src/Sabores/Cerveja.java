package Sabores;

public abstract class Cerveja {
	
	protected String codigo;
	protected String sabor;
	protected String dataProducao;
	protected String dataValidade;
	protected double preco;
	
	
	
	public Cerveja(String codigo, String sabor, String dataProducao, String dataValidade, double preco) {
		super();
		this.codigo = codigo;
		this.dataProducao = dataProducao;
		this.dataValidade = dataValidade;
		this.preco = preco;
	}
	
	public Cerveja() {}

	//GET
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getSabor() {
		return this.sabor;
	}
	
	public String getDataProducao() {
		return this.dataProducao;
	}
	
	public String getDataValidade() {
		return this.dataValidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	//SET
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public void setDataProducao(String dataProducao) {
		this.dataProducao = dataProducao;
	}
	
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	
}
