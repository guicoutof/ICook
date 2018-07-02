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
import java.util.ArrayList;
import javax.swing.JOptionPane;


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
    private Usuario usuarioAtivo = new Usuario();
    private Receita receitaAtual = new Receita();
    private ArrayList<Receita> receitas;
    private ArrayList<Usuario> usuarios;

    public Usuario getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public Receita getReceitaAtual() {
        return receitaAtual;
    }

    
    
    
    public Receita verReceitas() {
        JOptionPane.showMessageDialog(null,"Lista de Receitas");
        System.out.println("Classe ICook, funcao verReceitas \n");
            return null;
    }

    public Receita selecionarReceita(String nome) {
        JOptionPane.showMessageDialog(null,"Receitas Selecionada");
        System.out.println("Classe ICook, funcao selecionarReceita \n");
            return null;
    }

    public boolean confirmarSolicitacao(short confirmacao) {
        JOptionPane.showMessageDialog(null,"Confirmado");
        System.out.println("Classe ICook, funcao confirmarSolicitacao \n");
            return false;
    }

    public boolean excluirReceita(Receita receita) {
        JOptionPane.showMessageDialog(null,"Receita Excluida");
        System.out.println("Classe ICook, funcao excluirReceita \n");
            return false;
    }

    public void sair() {
        JOptionPane.showMessageDialog(null,"Logout realizado");
        System.out.println("Classe ICook, funcao sair \n");

    }
    
    public void criarUsuario(String id,String senha){
        JOptionPane.showMessageDialog(null,"Usuario criado");
        System.out.println("Classe ICook, funcao criarUsuario \n");
    }
    
}
