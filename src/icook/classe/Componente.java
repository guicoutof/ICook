package icook.classe;

import javax.swing.JOptionPane;

public class Componente {

	private String modoPreparo;

	private boolean conclusao;

    public Componente() {
    }

    public Componente(String modoPreparo, boolean conclusao) {
        this.modoPreparo = modoPreparo;
        this.conclusao = conclusao;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public boolean getConclusao() {
        return conclusao;
    }
        
        

	public Componente buscarEtapa(Componente etapa) {
                JOptionPane.showMessageDialog(null,"Busca de Etapa");
                System.out.println("Classe Componente, funcao buscarEtapa");
		return null;
	}

	public void concluirEtapa(Componente etapa) {
            JOptionPane.showMessageDialog(null,"Etapa Concluida");
            System.out.println("Classe Componente, funcao concluirEtapa");
	}

	public boolean inserirModoPreparo(String modo) {
            JOptionPane.showMessageDialog(null,"Modo de Preparo inserido");
                System.out.println("Classe Componente, funcao inserirModoPreparo");
		return false;
	}

	public boolean modificarComponente(Componente componente) {
            JOptionPane.showMessageDialog(null,"Componente Modificada");
                System.out.println("Classe Componente, funcao modificarComponente");
		return false;
	}

}
