/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
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
        Cliente cliente=new Cliente(1, "Lucas", "355245", "Rua 9");
        System.out.println(cliente);
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario);
    }
}
