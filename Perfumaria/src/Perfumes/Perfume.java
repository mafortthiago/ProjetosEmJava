package Perfumes;

public abstract class Perfume {

	private int capacidade;
	private String nome;
	private double precoDeCustoPerfume;
	
	
	public abstract double precoDeVenda(double precoDeCustoPerfume);
	public abstract double precoDeCustoEmbalagem(int capacidade, double PrecoMateriaPrima);
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoDeCustoPerfume() {
		return precoDeCustoPerfume;
	}

	public void setPrecoDeCustoPerfume(double precoDeCustoPerfume) {
		this.precoDeCustoPerfume = precoDeCustoPerfume;
	}


}
