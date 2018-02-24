/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokugeneration.Generator;

import Generation.BoardStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Structures.Board;
import Structures.Coordinate;
import Structures.Neighbours;

/**
 *
 * @author Kraiper
 */

public class Generator extends BoardStatus{
    
    public Generator(int _size) {
        size = _size;
    }
            
    public void GenerateBoard(Board _board, int _size)
    {
        int largestList = boardPossitionStatus[0][0].size();
        Coordinate workingPosition = new Coordinate(0, 0);
      
        Random rand = new Random();
        
        while(largestList > 0)
        {
            for(int i = 0; i < _size; i++)
            {
                for(int j = 0; j < _size; j++)
                {
                    if(boardPossitionStatus[i][j].size() <= largestList && boardPossitionStatus[i][j].size() != 0)
                    {
                        largestList = boardPossitionStatus[i][j].size();
                        workingPosition = new Coordinate(i, j);
                    }
                }
            }

            int randomNumber = rand.nextInt(boardPossitionStatus[workingPosition.x][workingPosition.y].size());
            int choosenNumber = boardPossitionStatus[workingPosition.x][workingPosition.y].get(randomNumber);
            
            boardPossitionStatus[workingPosition.x][workingPosition.y].clear();

            _board.board[workingPosition.x][workingPosition.y].value = choosenNumber;
            
            for (Coordinate c : _board.board[workingPosition.x][workingPosition.y].neighbours)
            {
                boardPossitionStatus[c.x][c.y].remove(new Integer(choosenNumber));
            }
            
            largestList = 0;
            for(int i = 0; i < _size; i++)
            {
                for(int j = 0; j < _size; j++)
                {
                    if(boardPossitionStatus[i][j].size() > largestList)
                    {
                        largestList = boardPossitionStatus[i][j].size();
                    }
                }
            }
            if(largestList == 0)
            {
                int test = 0;
            }
        }
    }
}
    