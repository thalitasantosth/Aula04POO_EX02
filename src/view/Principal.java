package view;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Principal {

	public static void main(String[] args) {

		// Estudante técnico
		EstudanteTecnico e1 = new EstudanteTecnico();
		e1.setRa("123");
		e1.setNome("Fulano");
		e1.setEmail("fulano@example.com");
		e1.setMediaNotas(8.5f);
		e1.setQtdAprovacoes("4");
		
		// Estudante superior
        EstudanteSuperior e2 = new EstudanteSuperior();
        e2.setRa("456");
        e2.setNome("Ciclano");
        e2.setEmail("ciclano@example.com");
        e2.setMediaNotas(7.8f);
        e2.setQtdAprovacoes("6");
        e2.setInstituicaoSegundoGrau("Escola XYZ");
        e2.setAnoConclusaoSegundoGrau(2019);

        // Cálculos para estudante técnico
        EstudanteTecnicoController tc = new EstudanteTecnicoController();
        float rendimentoTecnico = tc.calcularPercentualRendimento(e1);
        float progressaoTecnico = tc.calcularPercentualProgressao(e1);
        System.out.println("Rendimento do estudante técnico: " + rendimentoTecnico);
        System.out.println("Progressão do estudante técnico: " + progressaoTecnico);
        
        // Cálculos para estudante superior
        EstudanteSuperiorController sc = new EstudanteSuperiorController();
        float rendimentoSuperior = sc.calcularPercentualRendimento(e2);
        float progressaoSuperior = sc.calcularPercentualProgressao(e2);
        System.out.println("Rendimento do estudante superior: " + rendimentoSuperior);
        System.out.println("Progressão do estudante superior: " + progressaoSuperior);
    }

}
