/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2B;

/**
 *
 * @author Roberto
 */
public class Shape 
{
    //Quizas lo mas conveniente sería crear shape como clase abstracta
    //ya que no tiene sentido crear un objeto de tipo shape
    private double  size;
    public Shape(double pSize) 
    {
        if(pSize > 0)
            size = pSize;
    }
    
    public double getSize() 
    { 
        return size; 
    }
}
