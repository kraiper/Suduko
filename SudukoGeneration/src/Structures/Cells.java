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
public class Cells extends Neighbours{
    public int value;
    public Coordinate position;
    
    public Cells(int x, int y)
    {
        value = 0;
        
        position = new Coordinate(x, y);
        
    }
}
