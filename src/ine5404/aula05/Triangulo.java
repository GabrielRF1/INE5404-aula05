/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.aula05;

import java.util.Scanner;

/**
 *
 * @author 17100518
 */
public class Triangulo implements Figura_Geometrica{
    double b, h, area;

    @Override
    public double calculateArea() {
    area= (b*h)/2;
    return area;
    }
    public void setB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        b= sc.nextDouble();
   }
    public void setH(){
   Scanner sc = new Scanner(System.in);
        System.out.println("Altura: ");
        h= sc.nextDouble();
    }
    
    
}
