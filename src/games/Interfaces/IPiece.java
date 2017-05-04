/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.Interfaces;

import games.Board.Board;

/**
 *
 * @author gpalomox
 */
public interface IPiece {
    public abstract void move(Board board,IPiece pPiece,int pLocation, int pDestination); 
    public abstract boolean isAvailable();
    public abstract boolean isValid(Board board, int fromX, int fromY, int toX, int toY);
}
