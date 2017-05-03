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
        newGame.drawBoard();
        //Checkers Game
        newGame = new Checkers();
        newGame.drawBoard();
        //Go Game
        newGame = new Go();
        newGame.drawBoard();
    }
    
}
