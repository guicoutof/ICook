package icook.classe;

import javax.swing.JOptionPane;

public class Usuario {

	private String email;

	private String senha;
        
        private LivroDeReceitas livro = new LivroDeReceitas();

    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public LivroDeReceitas getLivro() {
        return livro;
    }
        
        

	public boolean autenticar(String id, String senha) {
                JOptionPane.showMessageDialog(null,"Usuario Autenticado");
                System.out.println("Classe Usuario, funcao atutenticar");
                return true;
	}

}
