package Perfumes;

public abstract class FragranciasDoces extends Perfume {
	private String ingredienteDoce;	
	private double precoMateriaPrimaPorMl;
	
	@Override
	public double precoDeVenda(double precoDeCustoPerfume) {
		double precoDeVenda;
		precoDeVenda = super.getPrecoDeCustoPerfume() + this.precoDeCustoEmbalagem(super.getCapacidade(), this.precoMateriaPrimaPorMl);
		return precoDeVenda ;
	}

	@Override
	public double precoDeCustoEmbalagem(int capacidade, double PrecoMateriaPrimaPorMl) {
		return capacidade * precoMateriaPrimaPorMl;
	}
	

	public String getIngredienteDoce() {
		return ingredienteDoce;
	}

	public void setIngredienteDoce(String ingredienteDoce) {
		this.ingredienteDoce = ingredienteDoce;
	}

	public double getPrecoMateriaPrimaPorMl() {
		return precoMateriaPrimaPorMl;
	}

	public void setPrecoMateriaPrimaPorMl(double precoMateriaPrima) {
		this.precoMateriaPrimaPorMl = precoMateriaPrima;
	}
}
