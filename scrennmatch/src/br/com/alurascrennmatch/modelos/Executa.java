package br.com.alurascrennmatch.modelos;

public class Executa {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("Matrix");
		meuFilme.setAnoDeLancamento(2023);
		meuFilme.setDiretor("TesteDiretor");
		meuFilme.setDuracaoEmMinutos(90);
		meuFilme.setAvaliacao(10);
		meuFilme.setAvaliacao(5);
		
		meuFilme.exibeFichaTecnica();

		// Series
		System.out.println("*************************");
		Serie serie = new Serie();
		serie.setNome("Lost");
		serie.setAnoDeLancamento(2001);
		serie.setTemporadas(10);
		serie.setMinutosPorCapitulo(50);
		serie.setEpsodios(9);
		serie.setAvaliacao(10);
		serie.setAvaliacao(4);
		serie.exibeFichaTecnica();

	}

}
