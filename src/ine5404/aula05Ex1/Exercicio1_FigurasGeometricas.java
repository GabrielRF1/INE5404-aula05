/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.aula05Ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author 17100518
 */
public class Exercicio1_FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        do {
            int op = Integer.parseInt(JOptionPane.showInputDialog("1-Circulo\n2-Cilindro\n3-Triângulo\n4-Retângulo\n5-Pirâmide(case retângular)\n6-bloco\nOutro-Sair"));
            switch (op) {
                case 1:
                    Circulo c = new Circulo();
                    c.setRadius();
                    System.out.printf("A área é: %.2f", c.calculateArea());
                    break;
                case 2:
                    Circulo c2 = new Circulo();
                    c2.setRadius();
                    c2.calculateArea();
                    Cilindro si = new Cilindro(c2);
                    si.askAltura();
                    System.out.printf("A área é: %.2f \nO volume é: %.2f", si.calculateArea(), si.calVolume());
                    break;
                case 3:
                    Triangulo tr = new Triangulo();
                    tr.setB();
                    tr.setH();
                    System.out.printf("A área é: %.2f", tr.calculateArea());
                    break;
                case 4:
                    Retangulo rx = new Retangulo();
                    rx.setB();
                    rx.setH();
                    System.out.printf("Área: %.2f", rx.calculateArea());
                    break;
                case 5:
                    Retangulo rt = new Retangulo();
                    rt.setH();
                    rt.setB();
                    rt.calculateArea();
                    Piramide_baseQuadrado pqq = new Piramide_baseQuadrado(rt);
                    pqq.askH();
                    System.out.printf("área: %.2f \nVolume: %.2f", pqq.calculateArea(), pqq.calVolume());
                    break;
                case 6:
                    Retangulo rr = new Retangulo();
                    rr.setB();
                    rr.setH();
                    rr.calculateArea();
                    Bloco b = new Bloco(rr);
                    b.askProfu();
                    System.out.printf("Área: %.2f \nVolume: %.2f", b.calculateArea(), b.calVolume());
                    break;

                default:
                    System.exit(0);
            }

        } while (3 == 3);

    }
}
