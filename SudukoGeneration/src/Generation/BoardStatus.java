/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kraiper
 */
public class BoardStatus {
    protected List<Integer> boardPossitionStatus[][];
    
    protected int size;
    
    public BoardStatus()
    {
        boardPossitionStatus = new ArrayList[size][size];
        ResetField();
    }
    
    protected void ResetField()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                boardPossitionStatus[i][j] = new ArrayList<>();
            }
        }
        
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                boardPossitionStatus[i][j].clear();
                for(int k = 1; k < 10; k++)
                {
                    boardPossitionStatus[i][j].add(k);
                }
            }
        }
    }
}
