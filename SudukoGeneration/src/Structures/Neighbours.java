/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

import java.util.ArrayList;

/**
 *
 * @author Kraiper
 */
public class Neighbours {
    public ArrayList<Coordinate> neighbours = new ArrayList<Coordinate>();
    
    public void AddNeighbours(int _row, int _column, int _size)
    {
        int squareRoot = (int) Math.sqrt(_size);
        for(int i = 0; i < _size; i++)
        {
            for(int j = 0; j < _size; j++)
            {
                if(i == _row && j != _column)
                {
                    neighbours.add(new Coordinate(i,j));
                }
                else if (i != _row && j == _column)
                {
                    neighbours.add(new Coordinate(i,j));
                }
                else if(_row/squareRoot == i/squareRoot && _column/squareRoot == j/squareRoot && _row != i && _column != j)
                {
                    neighbours.add(new Coordinate(i,j));
                }
            }
        }
    }
    
}
