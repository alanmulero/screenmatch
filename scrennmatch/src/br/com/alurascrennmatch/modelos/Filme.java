package br.com.alurascrennmatch.modelos;

public class Filme extends Titulo {
	
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public void exibeFichaTecnica() {
		// TODO Auto-generated method stub
		super.exibeFichaTecnica();
		System.out.println("Diretor do Filme: "+ getDiretor());
		System.out.println("Duração em minutos do filme: " + getDuracaoEmMinutos());
	}

	
	
	

}
