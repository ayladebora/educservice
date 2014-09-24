package br.ufpb.educservice;
import java.util.List;


public class QuestaoMultiplaEscolha extends Questao {
	private String enunciado;
	private List <String> alternativas;
	private int alternativaCorreta;
	
	public QuestaoMultiplaEscolha(String id, String enunciado, List <String> alternativas) {
		super(id);
		this.enunciado = enunciado;
		this.alternativas = alternativas;
	}

	@Override
	public String getDescricao() {
		return enunciado + alternativas.toString();
	}

	@Override
	public String getSolucao() {
		return alternativas.get(alternativaCorreta);
	}

}
