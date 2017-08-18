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
public class Retangulo extends PlanoCartesiano_2D implements Figura_Geometrica {

    private double base, altura, area;

    public Retangulo(int x, int y) {
        super(x, y);
    }

    

    @Override
    public double calculateArea() {
        area = base * altura;
        return area;
    }

    public void setB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base do retângulo: ");
        base = sc.nextDouble();
    }

    public void setH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura do retângulo: ");
        altura = sc.nextDouble();
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

}
