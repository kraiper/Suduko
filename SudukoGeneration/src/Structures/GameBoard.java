/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

/**
 *
 * @author Kraiper
 */
public class GameBoard {
    public int board[][];
    
    private int size;
    
    public GameBoard(int _size)
    {
        size = _size;
        
        board = new int[size][size];
        
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                board[i][j] = 0;
            }
        }
    }
    
    public void printBoard()
    {
        for(int i = 0; i < size;i++)
        {
            String printString = new String();
            for(int j = 0; j < size; j++)
            {
                if (board[i][j] != 0)
                {
                    printString += Integer.toString(board[i][j]) + " ";
                }
                else
                {
                    printString += "  ";
                }
            }
            System.out.println(printString);
        }
        System.out.println("---------------------------------");
    }
    
}
