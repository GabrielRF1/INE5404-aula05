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
public class Cilindro extends Plano_3D implements Figura3D{
    Circulo base;
    double altura,volume, area;

    public Cilindro(int x,int y,int z, Circulo base) {
        super(x, y, z);
        this.base = base;
    }
    
    
    @Override
    public double calVolume() {
        volume=base.calculateArea()*altura;
        return volume;
    }

    @Override
    public double calculateArea() {
        area= 2*base.calculateArea()+ 2*base.getRadius()*Math.PI*altura;
        return area;
    }
    public void askAltura(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Altura do cilindro: ");
        altura = sc.nextDouble();
    }
    
}
