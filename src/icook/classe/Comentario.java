package icook.classe;

public class Comentario {

	private String idUsuario;

	private String descricao;

    public Comentario() {
    }

    public Comentario(String idUsuario, String descricao) {
        this.idUsuario = idUsuario;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

        
        
}
