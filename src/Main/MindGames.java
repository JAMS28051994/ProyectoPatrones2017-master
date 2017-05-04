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

/**
 *
 * @author gpalomox
 */
public class MindGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
         IGame newGame;
        
        //Chess Game
        newGame = new Chess();
        newGame.createGame();
        System.out.println("Position for each pice of the board for Chess");
        newGame.drawBoard();
        newGame.addPice();
        newGame.printGame();
        newGame.movePice(0, 2);
        newGame.printGame();
        
       /* for(int i=0; i<newGame.length; i++){
            for(int j=0; j<newGame.length; j++){
                System.out.println(newGame[i][j]);
            }
        }*/       
        
        //
        //Checkers Game
        newGame = new Checkers();
        newGame.drawBoard();
        //Go Game
        newGame = new Go();
        newGame.drawBoard();
    
    }
    
}
