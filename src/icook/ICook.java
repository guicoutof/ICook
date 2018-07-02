/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icook;

import icook.classe.Usuario;
import icook.classe.Receita;
import icook.classe.*;
import icook.IU.*;


/**
 *
 * @author AlphaLegends
 */
public class ICook {

    public static void main(String[] args) {
        IUICook IU = new IUICook();
        IU.setVisible(true);
    }
    
    private boolean ok;
    private Usuario usuarioAtivo;
    private Receita receitaAtual;
    private Receita receitas[];
    private Usuario usuarios[];
    
    public Receita verReceitas() {
            return null;
    }

    public Receita selecionarReceita(String nome) {
            return null;
    }

    public boolean confirmarSolicitacao(short confirmacao) {
            return false;
    }

    public boolean excluirReceita(Receita receita) {
            return false;
    }

    public void sair() {

    }
    
}
