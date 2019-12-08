/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
    
import java.util.Date;

public class Usuario extends Pessoa {
     protected String level;
     protected String senha;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha=senha;
    }

    public Usuario(String level, String senha, int id, String nome, char sexo, String nasc, String telefone, String email, String rg) {
        super(id, nome, sexo, nasc, telefone, email, rg);
        this.level = level;
        this.senha = senha;
        
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
