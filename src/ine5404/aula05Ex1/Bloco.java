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
public class Bloco extends Plano_3D implements Figura3D{
    private Retangulo R;
    private double profundidade;

    public Bloco(int x,int y,int z,Retangulo R) {
        super(x,y,z);
        this.R = R;
    }
    
    @Override
    public double calVolume() {
        return R.calculateArea()*profundidade;
    }

    @Override
    public double calculateArea() {
        return (2*profundidade*R.getAltura())+(2*profundidade*R.getBase())+(2*R.getAltura()*R.getBase());
    }
    public void askProfu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Profundidade do Bloco: ");
        profundidade=sc.nextDouble();
     
    }
}
