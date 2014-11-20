package br.ufpb.educservice;
import java.util.List;


public interface ExercicioDAO {
	/**
	 * Cria um novo exercicio
	 * @return o Exercicio criado já com seu id.
	 */
	public Exercicio criarExercicio ();
	public Exercicio criarExercicio (List<String> palavrasChave);
	public void configuraPalavrasChave(String idExercicio);
	public void apagar (String idExercicio);
	public void atualizar(Exercicio e);
	public Exercicio pesquisarExercicioPorId (String idExercicio);
	public QuestaoMultiplaEscolha cadastrarQuestaoME(String idExercicio, String enunciado, List<String> alternativas);
	public QuestaoVouF cadastrarQuestaoVouF(String idExercicio, List<String> afirmativas);
	public QuestaoDissertativa cadastrarQuestaoDissertativa(String idExercicio, String enunciado);
	public Questao pesquisarQuestaoPorId(String idExercicio, String idQuestao);
	public QuestaoMultiplaEscolha pesquisarQuestaoMEPorId(String idExercicio, String idQuestao);
	public QuestaoVouF pesquisarQuestaoVouFPorId(String idExercicio, String idQuestao);
	public QuestaoDissertativa pesquisarQuestaoDissertativaPorId(String idExercicio, String idQuestao);
	public QuestaoMultiplaEscolha cadastrarRespostaQuestaoMEPorId(String idExercicio, int alternativaCorreta);
	public QuestaoVouF cadastrarRespostaQuestaoVouFPorId(String idExercicio, String idQuestao, List<String> respostas);
	public QuestaoDissertativa cadastrarRespostaQuestaoDissertativaPorId(String idExercicio, String idQuestao,  String solucao);
	public QuestaoMultiplaEscolha cadastrarQuestaoME(String idExercicio, String enunciado, List<String> alternativas, int alternativaCorreta);
	public QuestaoVouF cadastrarQuestaoVouF(String idExercicio, List<String> afirmativas, List <String> respostas);
	public QuestaoDissertativa cadastrarQuestaoDissertativa(String idExercicio, String enunciado,  String solucao);
	public List<Exercicio> pesquisarTodosOsExercicios();
	public List<Exercicio> pesquisarExerciciosSobre(List<String> palavrasChave);
	//TODO...
}
