package br.com.alurascrennmatch.modelos;

public class Serie extends Titulo {

	private int temporadas;
	private int epsodios;
	private int minutosPorCapitulo;
	private boolean ativa;

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getEpsodios() {
		return epsodios;
	}

	public void setEpsodios(int epsodios) {
		this.epsodios = epsodios;
	}

	public int getMinutosPorCapitulo() {
		return minutosPorCapitulo;
	}

	public void setMinutosPorCapitulo(int minutosPorEpsodio) {
		this.minutosPorCapitulo = minutosPorEpsodio;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	@Override
	public int getDuracaoEmMinutos() {
		return minutosPorCapitulo * epsodios * temporadas;
	}

	@Override
	public void exibeFichaTecnica() {
		// TODO Auto-generated method stub
		super.exibeFichaTecnica();
		System.out.println("Duração em minutos da Série: "+ getDuracaoEmMinutos());
	}
	
	

}
