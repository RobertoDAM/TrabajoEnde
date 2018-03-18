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
public class Circle extends Shape {
    public Circle(double size) {
        super(size);
    }
    public double area() {
        
        double radio = getSize();
        return Math.PI*radio*radio;
    }
}
