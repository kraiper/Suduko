/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudukogeneration;

import Structures.Board;
import Generation.Generator;
import Structures.GameBoard;

/**
 *
 * @author Kraiper
 */
public class SudukoGeneration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int boardSize = 4;
        
        Board solutionBoard = new Board(boardSize);
        Generator boardGenerator = new Generator(boardSize);
        
        boardGenerator.GenerateBoard(solutionBoard);
        
        solutionBoard.printBoard();
        
        GameBoard gameBoard = boardGenerator.SetBoard(solutionBoard, 6);
        
        gameBoard.printBoard();
    }
    
}
