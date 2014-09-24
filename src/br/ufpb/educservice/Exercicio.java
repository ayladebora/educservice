package br.ufpb.educservice;
import java.util.LinkedList;
import java.util.List;


public class Exercicio {
	
	private String id;
	private List <Questao> questoes;
	
	public Exercicio(String id){
		this.id = id;
		setQuestoes(new LinkedList<Questao>());
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List <Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List <Questao> questoes) {
		this.questoes = questoes;
	}
	

	
}
