package model;

public class EstudanteSuperior extends Estudante {
	
	private String instituicaoSegundoGrau;
	private int anoConclusaoSegundoGrau;
	
	public EstudanteSuperior () {
		super();
		instituicaoSegundoGrau = null;
		anoConclusaoSegundoGrau = 0;
	}
	
	public String getInstituicaoSegundoGrau() {
		return instituicaoSegundoGrau;
	}
	
	public void setInstituicaoSegundoGrau(String instituicaoSegundoGrau) {
		this.instituicaoSegundoGrau = instituicaoSegundoGrau;
	}
	
	public int getAnoConclusaoSegundoGrau() {
		return anoConclusaoSegundoGrau;
	}
	
	public void setAnoConclusaoSegundoGrau(int anoConclusaoSegundoGrau) {
		this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
	}
	
}
