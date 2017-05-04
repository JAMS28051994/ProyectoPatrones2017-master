/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import games.List.Checkers;
import games.List.Chess;
import games.List.Go;
import games.Interfaces.IGame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author gpalomox
 */
public class MindGames {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {        
        
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       IGame newGame;
       String opt, optSub = null;
       
        do{
         System.out.println("Chose a Game to play");
         System.out.println("1 Chess");
         System.out.println("2 Checkers");
         System.out.println("3 Go");
         System.out.println("4 Exit");
         opt = in.readLine();
         switch (opt) {
                 case "1":
                     while (!"3".equals(optSub)){
                        System.out.println("Chose an action for the game");
                        System.out.println("1 New Game");
                        System.out.println("2 Load Game");
                        System.out.println("3 Quite Game");
                        optSub = in.readLine();
                        switch (optSub) {
                             case "1":
                                 newGame = new Chess();
                                 newGame.createGame();
                                 System.out.println("Position for each pice of the board for Chess");
                                 newGame.drawBoard();
                                 newGame.addPice();
                                 newGame.printGame();
                                 newGame.movePice(0, 2);
                                 newGame.printGame();                                
                            case "2":
                                 
                            case "3":
                                
                                break;
                                 
                            default:System.out.println("Not a valid option\n");                            
                        }
                     }break;                    
                case "2":
                    newGame = new Checkers();
                    newGame.drawBoard();
                    
                case"3" :
                    newGame = new Go();
                    newGame.drawBoard();
                    
                case"4" : System.exit(0);
                    
                default:System.out.println("Not a valid option");
                
                }            
        }while(!"4".equals(opt));     

    }
}
