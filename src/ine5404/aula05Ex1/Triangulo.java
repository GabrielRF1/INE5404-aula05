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
public class Triangulo implements Figura_Geometrica{
    double b, h, area;

    public Triangulo() {
    }

    @Override
    public double calculateArea() {
    area= (b*h)/2;
    return area;
    }
    public void setB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Base do triângulo: ");
        b= sc.nextDouble();
   }
    public void setH(){
   Scanner sc = new Scanner(System.in);
        System.out.println("Altura do triângulo: ");
        h= sc.nextDouble();
    }
    
    
}
