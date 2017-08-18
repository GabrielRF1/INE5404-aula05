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
public class Piramide_baseQuadrado extends Plano_3D implements Figura3D{
    Retangulo base;
    double h;

    public Piramide_baseQuadrado(int x, int y, int z, Retangulo base) {
        super(x,y,z);
        this.base = base;
    }
    
    @Override
    public double calVolume() {
    return (base.calculateArea()*h)/3;
    }

    @Override
    public double calculateArea() {
       return base.calculateArea()+ 2*(base.getAltura()*h)/2+ 2*(base.getBase()*h)/2;
    }
    
    public void askH(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Altura da piramide: ");
        h= sc.nextDouble();
    }

  
    
}
