package icook;

public class Receita {

	private String titulo;

	private int tempoPreparo;

	private String ingredientes[];

	private Comentario comentarios[];

	private Componente componentes[];

	private Componente etapa;

	public boolean acompanharReceita(Receita receita) {
		return false;
	}

	public boolean aprovarReceita(Receita receita) {
		return false;
	}

	public boolean criarReceita(String nome, String tempoPreparo) {
		return false;
	}

	public void inserirIngredientes(String ingredientes) {

	}

	public void finalizarAcompanhamento() {

	}

	public boolean inserirComentario(Receita receita, String comentario) {
		return false;
	}

	public boolean modificarReceita(Receita receita) {
		return false;
	}

	public boolean removerComentario(Comentario comentario) {
		return false;
	}

}
