package controller;

import model.Estudante;

public class EstudanteTecnicoController implements OperacoesEstudante {

	public float calcularPercentualRendimento(Estudante est) {
		return est.getMediaNotas() * Integer.parseInt(est.getQtdAprovacoes()) * 0.931f;
	}

	public float calcularPercentualProgressao(Estudante est) {
		return Integer.parseInt(est.getQtdAprovacoes()) / 3.0f;
	}

}
