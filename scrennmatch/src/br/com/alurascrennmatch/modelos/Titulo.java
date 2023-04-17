package br.com.alurascrennmatch.modelos;

public class Titulo {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	private double media = 0;
	private double avaliacao = 0;
	// ********************************

	public String getNome() {
		return nome;
	}

	public double getAvaliacao() {

		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		totalDeAvaliacoes++;
		somaDasAvaliacoes += avaliacao;
		this.avaliacao = avaliacao;
	}

	public double getSomaDasAvaliacoes() {

		return somaDasAvaliacoes;
	}

	public double getMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public boolean getIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		if (anoDeLancamento < 2022) {
			incluidoNoPlano = true;
			this.anoDeLancamento = anoDeLancamento;
		} else {
			incluidoNoPlano = false;
		}
	}

	

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		System.out.println("Plano de inclusão: " + getIncluidoNoPlano());
		System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
		System.out.println("A média das avaliações: " + getMedia());
	}
}
