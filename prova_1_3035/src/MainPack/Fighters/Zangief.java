/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack.Fighters;

import MainPack.FooFighters.Lutador;
import MainPack.FooFighters.Special;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mikha
 */
public class Zangief extends Lutador{

    public Zangief(String N, Double V, Double A, Special S) {
        super(N, V, A, S);
    }

    @Override
    public void tirarVida(Lutador Atacante, Lutador Atacado) {
        int escolha = 0;
        boolean dc = false;
        Scanner entrada;
        System.out.println("Voce deseja utilizar seu ataque normal ou seu especial?");
        System.out.println("1 - Ataque normal");
        System.out.println("2 - Ataque Especial");
        while(dc != true){
            try{
                entrada = new Scanner(System.in);
                System.out.println("Digite um numero de 1 a 2.");

                escolha = entrada.nextInt();
                    if(escolha >= 1 && escolha <= 2){
                        dc = true;
                    }
            }catch(InputMismatchException e){
                dc = false;
                System.out.println("Digite um numero e nao letra");
            }
        }
        if(escolha == 1){
            this.atacar(Atacante, Atacado);
        }else{
            this.usarSpecial(Atacante, Atacado);
        }
    }

    @Override
    public void atacar(Lutador Atacante, Lutador Atacado) {
        Atacado.setVida(Atacado.getVida()- Atacante.getAtaque());
    }

    @Override
    public void usarSpecial(Lutador Atacante, Lutador Atacado) {
        Atacado.setVida(Atacado.getVida()- Atacante.getSpecial().getValueSpecial());
    }
    
}
