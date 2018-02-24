/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

import java.util.Arrays;

/**
 *
 * @author Kraiper
 */
public class Board {
    
    public Cells board[][];
    
    private int size;
    
    public Board(int _size)
    {
        size = _size;
        
        board = new Cells[size][size];
        
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                board[i][j] = new Cells(i, j);
                board[i][j].AddNeighbours(i, j, size);
            }
        }
    }
    
    public void clearBoard()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                board[i][j].value = 0;
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
                printString += Integer.toString(board[i][j].value) + " ";
            }
            System.out.println(printString);
        }
        System.out.println("---------------------------------");
    }
    
}
