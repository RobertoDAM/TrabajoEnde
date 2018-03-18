/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2B;

/**
 *
 * @author 
 */
public class Square extends Shape {
    public Square(double pSize) {
        super(pSize);
    }
    public double area() {
        
        double lado = getSize() ;
        return lado*lado;
    }
}
