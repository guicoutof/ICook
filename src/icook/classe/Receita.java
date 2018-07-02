package icook.classe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Receita {

	private String titulo;

	private int tempoPreparo;

	private ArrayList<String> ingredientes;

	private ArrayList<Comentario> comentarios;

	private ArrayList<Componente> componentes;

	private Componente etapa;
        
        
        
        

	public boolean acompanharReceita(Receita receita) {
            JOptionPane.showMessageDialog(null,"Acompanhando Receita");
                System.out.println("Classe Receita, funcao acompanharReceita\n");
                
		return false;
	}

	public boolean aprovarReceita(Receita receita) {
            JOptionPane.showMessageDialog(null,"Receita aprovada");
                System.out.println("Classe Receita, funcao aprovarReceita\n");
		return false;
	}

	public boolean criarReceita(String nome, String tempoPreparo) {
            JOptionPane.showMessageDialog(null,"Criando Receita");
                System.out.println("Classe Receita, funcao criarReceita\n");
		return false;
	}

	public void inserirIngredientes(String ingredientes) {
            JOptionPane.showMessageDialog(null,"Inserindo Ingredientes");
                System.out.println("Classe Receita, funcao inserirIngredientes \n");

	}

	public void finalizarAcompanhamento() {
            JOptionPane.showMessageDialog(null,"finalizarAcompanhamento");
                System.out.println("Classe Receita, funcao finalizarAcompanhamento \n");

	}

	public boolean inserirComentario(Receita receita, String comentario) {
            JOptionPane.showMessageDialog(null,"Comentario Criado");
                System.out.println("Classe Receita, funcao inserirComentario \n");
		return false;
	}

	public boolean modificarReceita(Receita receita) {
            JOptionPane.showMessageDialog(null,"Receita Modificada");
                System.out.println("Classe Receita, funcao modificarReceita\n");
		return false;
	}

	public boolean removerComentario(Comentario comentario) {
            JOptionPane.showMessageDialog(null,"Comentario Removido");
                System.out.println("Classe Receita, funcao removerComentario\n");
		return false;
	}

}
