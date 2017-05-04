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
import java.util.Scanner;


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
       String opt, optSub = null, picePostA, picePostB;
       Scanner s;
        s = new Scanner(System.in);
       int picePost1, picePost2;
       
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
                                 System.out.println("Pices added on the board to play");
                                 newGame.addPice();
                                 
                                 System.out.println("Enter position of pice to move ");
                                 picePostA=in.readLine();
                                 //picePost1 =Integer.parseInt(s.nextLine());
                                 System.out.println("Enter position to move pice ");
                                 picePostB=in.readLine();
                                 //picePost2 = Integer.parseInt(s.nextLine());                                 
                                 newGame.movePice(picePostB);
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
