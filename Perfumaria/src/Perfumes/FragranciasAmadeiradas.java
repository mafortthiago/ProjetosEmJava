package Perfumes;

public abstract class FragranciasAmadeiradas extends Perfume {
	private String tipoBrinde;
	private double precoBrinde;
	private double precoSacola;

	public FragranciasAmadeiradas(String tipoBrinde) {
		this.tipoBrinde = tipoBrinde;
	}

	@Override
	public double precoDeVenda(double precoDeCustoPerfume) {
		return precoDeCustoPerfume + precoDeCustoEmbalagem(super.getCapacidade(), this.precoSacola);
	}

	public double getPrecoBrinde() {
		return precoBrinde;
	}

	public void setPrecoBrinde(double precoBrinde) {
		this.precoBrinde = precoBrinde;
	}

	public String getTipoBrinde() {
		return tipoBrinde;
	}

	@Override
	public double precoDeCustoEmbalagem(int capacidade, double precoSacola) {
		return capacidade + precoSacola + this.precoBrinde;
	}

	public double getPrecoSacola() {
		return precoSacola;
	}

	public void setPrecoSacola(double precoSacola) {
		this.precoSacola = precoSacola;
	}

}
