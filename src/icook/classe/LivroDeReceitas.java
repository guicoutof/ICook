package icook.classe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDeReceitas {

	private ArrayList<Receita> receitas;

    public LivroDeReceitas() {
    }

    public LivroDeReceitas(ArrayList<Receita> receitas) {
        this.receitas = receitas;
    }

    
        
	public boolean apagarReceitaLivro(Receita receita) {
            JOptionPane.showMessageDialog(null,"Livro Removido");
                System.out.println("Classe LivroDeReceitas, funcao apagarReceitaLivro");
		return false;
	}

	public Receita selecionarReceitaLivro(String nome) {
            JOptionPane.showMessageDialog(null,"Livro Selecionado");
                System.out.println("Classe LivroDeReceitas, funcao selecionarReceitaLivro");
		return null;
	}

	public boolean salvarReceita(Receita receita) {
            JOptionPane.showMessageDialog(null,"Livro Salvo");
                System.out.println("Classe LivroDeReceitas, funcao apagarReceitaLivro");
		return false;
	}

}
