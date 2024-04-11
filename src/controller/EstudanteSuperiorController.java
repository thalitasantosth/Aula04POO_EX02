package controller;

import model.Estudante;

public class EstudanteSuperiorController implements OperacoesEstudante {

	public float calcularPercentualRendimento(Estudante est) {
		return est.getMediaNotas() * Integer.parseInt(est.getQtdAprovacoes()) * 0.972f;
	}

	public float calcularPercentualProgressao(Estudante est) {
		return Integer.parseInt(est.getQtdAprovacoes()) / 6.0f;
	}

}
