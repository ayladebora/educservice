package br.ufpb.educservice;

import java.util.List;

public interface AlunoDAO {
	public Aluno criarAluno();
	public void cadastraRespostaVFDeAluno(String idAluno, String idExercicio, String idQuestao,  List<String> respostas);
	public void cadastrarRespostaQuestaoMEPorId(String idAluno, String idExercicio, int alternativaCorreta);
	public void cadastrarRespostaQuestaoDissertativaPorId(String idAluno, String idExercicio, String idQuestao,  String solucao);
	public void removerAluno();
	public Questao consultaRespostaDeAluno(String idAluno, String idExercicio, String idQuestao);
}
