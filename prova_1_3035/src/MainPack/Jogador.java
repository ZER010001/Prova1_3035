/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack;

import MainPack.FooFighters.Lutador;

/**
 *
 * @author mikha
 */
public class Jogador {

    String Nome;
    Lutador L;
    
    public Jogador(){}
    
    public Jogador(String Nome, Lutador l) {
        this.Nome = Nome;
        this.L = l;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public Lutador getL() {
        return L;
    }

    public void setL(Lutador l) {
        this.L = l;
    }

}
