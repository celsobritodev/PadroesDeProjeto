package builder;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	private Motor motor;
	private Transmissao transmissao;
	private Cor cor;
	private List<Opcional> listaOpcionais;
	
	
	public Carro() {
		listaOpcionais = new ArrayList<Opcional>();
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public List<Opcional> getListaOpcionais() {
		return listaOpcionais;
	}

	public void setListaOpcionais(List<Opcional> listaOpcionais) {
		this.listaOpcionais = listaOpcionais;
	}

	@Override
	public String toString() {
		return "Carro [motor=" + motor + ", transmissao=" + transmissao + ", cor=" + cor + ", listaOpcionais="
				+ listaOpcionais + "]";
	}
	
	
	

}
