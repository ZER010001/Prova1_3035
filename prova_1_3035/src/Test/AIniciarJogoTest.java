/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import MainPack.Fighters.ChunLi;
import MainPack.Fighters.Ryu;
import MainPack.FooFighters.Lutador;
import MainPack.FooFighters.Special;
import MainPack.Game;
import MainPack.Jogador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author mikha
 */
public class AIniciarJogoTest {
    
    @Test
    void startGameForTwoPlayers() {
        Special p1sr = new Special("Hadouken",10.0);
        Lutador p1r = new Ryu("Ryu",100.0,7.5,p1sr);
        Special p2sc = new Special("Hyakuretsu Kyaku",17.0);
        Lutador p2cl = new ChunLi("ChunLi",110.0, 6.5,p2sc);
        Jogador player1 = new Jogador("Yuri M",p1r);
        Jogador player2 = new Jogador("Ana K", p2cl);
        Game game = new Game(player1 , player2);
        game.iniciarPartida(player1,player2);
        assertEquals(player2,game.iniciarPartida(player1,player2));
    }  
}
