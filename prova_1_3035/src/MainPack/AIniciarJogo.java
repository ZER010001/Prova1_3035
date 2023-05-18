/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack;

import MainPack.FooFighters.Special;
import MainPack.FooFighters.Lutador;
import MainPack.Fighters.Blanka;
import MainPack.Fighters.ChunLi;
import MainPack.Fighters.Ryu;
import MainPack.Fighters.Zangief;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mikha
 */
public class AIniciarJogo {
    public static void main (String[] args){
    
    //Ryu
    Special p1sr = new Special("Hadouken",10.0);
    Lutador p1r = new Ryu("Ryu",100.0,7.5,p1sr);
    //Chun-Li
    Special p1sc = new Special("Hyakuretsu Kyaku",17.0);
    Lutador p1cl = new ChunLi("ChunLi",110.0, 6.5,p1sc);
    // Blanka
    Special p1sb = new Special("Ta INSHOCK???",23.0);
    Lutador p1bl = new Blanka("Blanka",80.0,6.5,p1sb);
    //Zangief
    Special p1sz = new Special("Pernas de quebra cranios",8.0);
    Lutador p1zg = new Zangief("Zangief", 110.0,8.9,p1sz);
    
    ArrayList<Special> ps = new ArrayList<>();
    ps.add(p1sr);
    ps.add(p1sc);
    ps.add(p1sb);
    ps.add(p1sz);
    
    Special teste1 = new Special("Mario",2.4);
    Object teste2 = new Special("Luigi",3.5);
    
    for (Special arg : ps) {
        System.out.println(arg.getName());
    }
   
    Scanner entrada = new Scanner(System.in);
    
    
    //
    // BLOCO PARA O JOGADOR 1:
    //    
    System.out.println("\nDigite seu nome jogador 1: ");
    String n1 = entrada.next();
    
    System.out.println("Jogador " + n1 + " escolha seu personagem:");
    System.out.println("1 - Ryu:     Vida = 100 Ataque = 7.5 Special = 'Hadouken' 10");
    System.out.println("2 - Chun Li: Vida = 110 Ataque = 6.5 Special = 'Hyakuretsu Kyaku' 17");
    System.out.println("3 - Blanka:  Vida = 80  Ataque = 6.5 Special = 'Ta INSHOCK???' 23");
    System.out.println("4 - Zangief: Vida = 110 Ataque = 8.9 Special = 'Pernas de quebra cranios' 8");
    
    int escolha = 0;
    
    boolean dc = false;
    while(dc != true){
        try{
            entrada = new Scanner(System.in);
            System.out.println("Digite um numero de 1 a 4.");

            escolha = entrada.nextInt();
                if(escolha >= 1 && escolha <= 4){
                    dc = true;
                }
        }catch(InputMismatchException e){
            dc = false;
            System.out.println("Digite um numero e nao letra");
        }
    }
    
    //RULE SWITCH DO JOGADOR 1
    Jogador j1 = new Jogador();
    switch(escolha) {
    
      case 1 -> {
          j1 = new Jogador(n1,p1r);
            }
      
      case 2 -> {
          j1 = new Jogador(n1,p1cl);
            }
      
      case 3 -> {
          j1 = new Jogador(n1,p1bl);
            }
      
      case 4 -> {
          j1 = new Jogador(n1,p1zg);
            }

    }
    
    //
    // BLOCO PARA O JOGADOR 2:
    //
    
    //Ryu
    Special p2sr = new Special("Hadouken",10.0);
    Lutador p2r = new Ryu("Ryu",100.0,7.5,p2sr);
    //Chun-Li
    Special p2sc = new Special("Hyakuretsu Kyaku",17.0);
    Lutador p2cl = new ChunLi("ChunLi",110.0, 6.5,p2sc);
    // Blanka
    Special p2sb = new Special("Ta INSHOCK???",23.0);
    Lutador p2bl = new Blanka("Blanka",80.0,6.5,p2sb);
    //Zangief
    Special p2sz = new Special("Pernas de quebra cranios",8.0);
    Lutador p2zg = new Zangief("Zangief", 110.0,8.9,p2sz);
    
    System.out.println("\nDigite seu nome jogador 2: ");
    String n2 = entrada.next();
    
    System.out.println("Jogador " + n2 + " escolha seu personagem:");
    System.out.println("1 - Ryu:     Vida = 100 Ataque = 7.5 Special = 'Hadouken' 10");
    System.out.println("2 - Chun Li: Vida = 110 Ataque = 6.5 Special = 'Hyakuretsu Kyaku' 17");
    System.out.println("3 - Blanka:  Vida = 80  Ataque = 6.5 Special = 'Ta INSHOCK???' 23");
    System.out.println("4 - Zangief: Vida = 110 Ataque = 8.9 Special = 'Pernas de quebra cranios' 8");
    
    escolha = 0;
    
    dc = false;
    while(dc != true){
        try{
            entrada = new Scanner(System.in);
            System.out.println("Digite um numero de 1 a 4.");

            escolha = entrada.nextInt();
                if(escolha >= 1 && escolha <= 4){
                    dc = true;
                }
        }catch(InputMismatchException e){
            dc = false;
            System.out.println("Digite um numero e nao letra");
        }
    }
    
    //RULE SWITCH DO JOGADOR 2
    Jogador j2 = new Jogador();
    switch(escolha) {
    
      case 1 -> {
          j2 = new Jogador(n2,p2r);
            }
      
      case 2 -> {
          j2 = new Jogador(n2,p2cl);
            }
      
      case 3 -> {
          j2 = new Jogador(n2,p2bl);
            }
      
      case 4 -> {
          j2 = new Jogador(n2,p2zg);
            }

    }

    Game game =  new Game(j1,j2);
    game.iniciarPartida(j1, j2);
    
    
    
    }

}
