package icook.classe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Receita {

	private String titulo = "TITULO";

	private int tempoPreparo = 10;

	private ArrayList<String> ingredientes;

	private ArrayList<Comentario> comentarios;

	private ArrayList<Componente> componentes;

	private Componente etapa = new Componente();
        
        
        
        public boolean aprovarReceita(Receita receita) {
            JOptionPane.showMessageDialog(null,"Receita aprovada");
                System.out.println("Classe Receita, funcao aprovarReceita");
		return false;
	}
        

	public boolean acompanharReceita(Receita receita) {
            JOptionPane.showMessageDialog(null,"Acompanhando Receita");
            System.out.println("Classe Receita, funcao acompanharReceita");
            for(int i=0;i<5;i++){
                etapa.buscarEtapa(etapa);
                etapa.concluirEtapa(etapa);
            }
		return false;
	}

	public boolean criarReceita(String nome, int tempoPreparo) {
            JOptionPane.showMessageDialog(null,"Criando Receita");
                System.out.println("Classe Receita, funcao criarReceita");
                inserirIngredientes(JOptionPane.showInputDialog("insira os ingredientes separados por ;"));
                for(int i=0;i<5;i++){
                    etapa.inserirModoPreparo(JOptionPane.showInputDialog("Insira uma etapa"));
                    System.out.println("Com a inserçao vazia o loop pararia na ideia");
                }
                
		return false;
	}

	public void inserirIngredientes(String ingredientes) {
            JOptionPane.showMessageDialog(null,"Inserindo Ingredientes");
                System.out.println("Classe Receita, funcao inserirIngredientes");

	}

	public void finalizarAcompanhamento() {
            JOptionPane.showMessageDialog(null,"finalizarAcompanhamento");
                System.out.println("Classe Receita, funcao finalizarAcompanhamento");

	}

	public boolean inserirComentario(Receita receita, String comentario) {
            JOptionPane.showMessageDialog(null,"Comentario Criado");
                System.out.println("Classe Receita, funcao inserirComentario");
		return false;
	}

	public boolean modificarReceita(Receita receita) {
            etapa.modificarComponente(etapa);
            JOptionPane.showMessageDialog(null,"Receita Modificada");
            System.out.println("Classe Receita, funcao modificarReceita");
	return false;
	}

	public boolean removerComentario(Comentario comentario) {
            JOptionPane.showMessageDialog(null,"Comentario Removido");
            System.out.println("Classe Receita, funcao removerComentario");
	return false;
	}

}
