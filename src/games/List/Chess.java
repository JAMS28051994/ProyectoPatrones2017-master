/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.List;

import games.Interfaces.IGame;
import games.Board.Board;
import games.Interfaces.IPiece;
import games.Pieces.Pawn;

/**
 *
 * @author gpalomox
 */
public class Chess implements IGame{
    
        Board chessBoard;
        IPiece pawnA = new Pawn();
        String posPiece [][];
        int mPos1, mPos2;
    
    @Override
    public void createGame() {
        chessBoard = new Board(8);
    }

    @Override
    public void saveGame() {
        
    }

    @Override
    public void loadGame() {
        
    }

    @Override
    public void checkMove(IPiece pPice) {
        
    }

    @Override
    public void printGame() {
        
        System.out.println("Pawn is on Position " + posPiece[0][1] + "?");
        System.out.println(chessBoard.getSpot(0, 1).isOccupied());
        System.out.println("Move pawn to " + posPiece[this.mPos1][this.mPos2]);
        
    }    

    @Override
    public void drawBoard() {        
        
        String mLetters[] = {"a","b","c","d","e","f","g","h"};
        posPiece = new String [8][8];
        int k=0;
        for(int i=1 ; i<9; i++){
            for(int j=0; j<8; j++){
               //chessBoard.getSpot(i, j).occupySpot(pawn);
               System.out.print(mLetters[j]+""+i+"|");  
               posPiece[k][j]=mLetters[j]+""+i+" ";
            }
            k++;
            System.out.println("");
        }        
    }

    @Override
    public void addPice() {
        chessBoard.getSpot(0, 1).occupySpot(pawnA);
        chessBoard.getSpot(2, 1).occupySpot(pawnA);
        chessBoard.getSpot(3, 1).occupySpot(pawnA);
        chessBoard.getSpot(4, 1).occupySpot(pawnA);
        chessBoard.getSpot(5, 1).occupySpot(pawnA);
        chessBoard.getSpot(6, 1).occupySpot(pawnA);
        chessBoard.getSpot(7, 1).occupySpot(pawnA);
        
        
    }
    
    @Override
    public void movePice(int pPos1, int pPos2){            
        pawnA.move(chessBoard, pawnA,pPos1, pPos2);
        this.mPos1=pPos1;
        this.mPos2=pPos2;

        chessBoard.getSpot(0, 1).releaseSpot();
    }
        @Override
     public void movePice(String pPos){            
        
        for(int i=0 ; i<8; i++){
            for(int j=0; j<8; j++){                
               if (posPiece[i][j].equals(pPos)){
                   this.mPos1=i;
                   this.mPos2=j;                   
               }
            }
        }
        pawnA.move(chessBoard, pawnA,mPos1, mPos2);
        chessBoard.getSpot(0, 1).releaseSpot();
    }
    
}
