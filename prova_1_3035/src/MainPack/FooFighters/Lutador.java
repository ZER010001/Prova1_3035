/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack.FooFighters;

/**
 *
 * @author mikha
 */
public abstract class Lutador {
    private String Nome;
    private Double Ataque;
    private Double Vida;
    private Special special;

    public Lutador(String Nome, Double Vida, Double Ataque, Special special) {
        this.Nome = Nome;
        this.Ataque = Ataque;
        this.Vida = Vida;
        this.special = special;
    }

    
    //GET & SET
    public String getNome() {
        return Nome;
    }

    public void setNome(String N) {
        this.Nome = N;
    }

    public Double getAtaque() {
        return Ataque;
    }

    public void setAtaque(Double Ataque) {
        this.Ataque = Ataque;
    }

    public Double getVida() {
        return Vida;
    }

    public void setVida(Double V) {
        this.Vida = V;
    }

    public Special getSpecial() {
        return special;
    }

    public void setSpecial(Special special) {
        this.special = special;
    }
    
    //MÉTODOS
    public abstract void tirarVida(Lutador Atacante,Lutador Atacado);

    public abstract void atacar(Lutador Atacante,Lutador Atacado);

    public abstract void usarSpecial(Lutador Atacante,Lutador Atacado);
}

