package controller;

import model.Estudante;

public interface OperacoesEstudante {
    float calcularPercentualRendimento(Estudante est);
    float calcularPercentualProgressao(Estudante est);
}
