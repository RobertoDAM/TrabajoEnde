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
public class Right_triangle extends Shape {
    public Right_triangle(double pSize) {
        super(pSize);
    }
    public double area() {
        
        double size = getSize() ;
        return size*size/2; 
       
    }
}