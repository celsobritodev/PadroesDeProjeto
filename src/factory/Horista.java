package factory;

public class Horista implements Calculable {

	private String nome;
	private int numeroHoras;
	private double valorHora;
	
	public String getNome() {
		return nome;
	}



	@Override
	public String toString() {
		return "Horista [nome=" + nome + ", numeroHoras=" + numeroHoras + ", valorHora=" + valorHora + "]";
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getNumeroHoras() {
		return numeroHoras;
	}



	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}



	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	public Horista(String nome, int numeroHoras, double valorHora) {
		super();
		this.nome = nome;
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}



	@Override
	public double calcularSalario() {
		
		return numeroHoras*valorHora;
	}

}
