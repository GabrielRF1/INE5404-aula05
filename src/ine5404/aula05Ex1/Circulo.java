/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.aula05Ex1;

import java.util.Scanner;

/**
 *
 * @author 17100518
 */
public class Circulo implements Figura_Geometrica {

    private double radius, area;

    public Circulo() {
        
    }

    
    @Override
    public double calculateArea() {
        area = radius * radius * Math.PI;
        return area;
    }

    public void setRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Raio do circulo: ");
        radius = sc.nextDouble();
    }

    public double getRadius() {
        return radius;
    }
    
}
