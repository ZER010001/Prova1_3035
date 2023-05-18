/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack;

/**
 *
 * @author mikha
 */
public class Game {
    private Jogador player1;
    private Jogador player2;

    public Game(Jogador player1, Jogador player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void iniciarPartida(Jogador player1, Jogador player2) {
        System.out.println("Iniciando partida...");
        System.out.println(player1.getNome() + " vs " + player2.getNome());
        System.out.println("ONE");
        System.out.println("TWO");
        System.out.println("THREE");
        System.out.println("FIGHT!!!");

        while (player1.L.getVida() > 0 && player2.L.getVida() > 0) {
            // P1 ataca p2
            System.out.println("\n\n");
            System.out.println(player1.Nome + " faca sua acao");
            player1.L.tirarVida(player1.L, player2.L);
            if (player2.L.getVida() <= 0) {
                break;
            }

            // P2 ataca p1
            System.out.println("\n\n");
            System.out.println(player2.Nome + " faca sua acao");
            player2.L.tirarVida(player2.L, player1.L);
            if (player1.L.getVida() <= 0) {
                break;
            }
        }

       // quem ganha?
        if (player1.L.getVida() > 0) {
            System.out.println("O vencedor da partida e " + player1.getNome() + " com " + player1.L.getNome() + " e " + player1.L.getVida() + " de vida restante!");
            System.out.println("O perdedor da partida e " + player2.getNome() + " com " + player2.L.getNome() + " e " + player2.L.getVida() + " de vida restante.");
        } else {
            System.out.println("O vencedor da partida e " + player2.getNome() + " com " + player2.L.getNome() + " e " + player2.L.getVida() + " de vida restante!");
            System.out.println("O perdedor da partida e " + player1.getNome() + " com " + player1.L.getNome() + " e " + player1.L.getVida() + " de vida restante.");
        }
    }
}

