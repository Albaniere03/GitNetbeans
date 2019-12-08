/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Albaniere
 */
public class Main {
    
    public static void main(String[] args){
        String nome="Lucas";
        System.out.println(nome);
        Servico barba = new Servico(5, "barba", 35);
        barba.setDescricao("cabelo");
        System.out.println(barba.getDescricao());
        Cliente cliente=new Cliente(1,"Lucas","Rua nova","55264");
        System.out.println(cliente.getNome());
        Usuario usuario = new Usuario(1, "barbeiro", "1234");
        System.out.println(usuario.getNome());
            
    }
}
