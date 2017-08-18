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
public class Circulo extends PlanoCartesiano_2D implements Figura_Geometrica {

    private double radius;

    public Circulo(int x, int y) {
        super(x, y);
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
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
