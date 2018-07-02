package icook.classe;

import javax.swing.JOptionPane;

public class Usuario {

	private String email;

	private String senha;

	public boolean autenticar(String id, String senha) {
                JOptionPane.showMessageDialog(null,"Usuario Autenticado");
                System.out.println("Classe Usuario, funcao atutenticar");
                return true;
	}

}
