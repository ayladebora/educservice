package br.ufpb.educservice;

import java.util.List;

public interface AlunoDAO {
	public Aluno criarAluno(String login, String senha);
	public void cadastraRespostaVFDeAluno(String idAluno, String idExercicio, String idQuestao,  List<String> respostas);
	public void cadastrarRespostaQuestaoMEPorId(String idAluno, String idExercicio, String idQuestao, int alternativaCorreta);
	public void cadastrarRespostaQuestaoDissertativaPorId(String idAluno, String idExercicio, String idQuestao,  String solucao);
	public void removerAluno(String idAluno);
	public Questao consultaRespostaDeAluno(String idAluno, String idExercicio, String idQuestao);
}
