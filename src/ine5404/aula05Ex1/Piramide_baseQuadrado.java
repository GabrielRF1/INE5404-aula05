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
public class Piramide_baseQuadrado implements Figura3D{
    Retangulo base;
    double h, volume, area;

    public Piramide_baseQuadrado(Retangulo base) {
        this.base = base;
    }
    
    @Override
    public double calVolume() {
    volume= (base.calculateArea()*h)/3;
    return volume;
    }

    @Override
    public double calculateArea() {
        area= base.calculateArea()+ 2*(base.getAltura()*h)/2+ 2*(base.getBase()*h)/2;
       return area;
    }
    
    public void askH(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Altura da piramide: ");
        h= sc.nextDouble();
    }

  
    
}
