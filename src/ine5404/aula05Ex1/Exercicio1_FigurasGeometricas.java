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
        PlanoCartesiano_2D plano[] = new PlanoCartesiano_2D[1];
        int count = 0;
        do {
            criarObjetos(count, plano);
            verificarLotacao(plano);
            imprimir(plano);
        } while (3 == 3);
    }

    public static void criarObjetos(int count, PlanoCartesiano_2D plano[]) {

        int op = Integer.parseInt(JOptionPane.showInputDialog("                     "
                + "CRIAR EM UM PLANO:\n1-Circulo\n2-Cilindro\n3-Triângulo\n4-Retângulo\n5-Pirâmide(case retângular)\n6-bloco\nOutro-Sair\n"
                + "                          APENAS UMA FIGURA POR TIPO\n"
                + "    (FIGURAS IGUAIS SOBREESCREVERÃO AS ANTERIORES)"));
        switch (op) {
            case 1:
                Circulo c = new Circulo(0, 0);
                c.setRadius();
                plano[count] = c;
                System.out.printf("A área é: %.2f\n\n", c.calculateArea());
                count++;
                break;
            case 2:
                Circulo c2 = new Circulo(0, 0);
                c2.setRadius();
                c2.calculateArea();
                Cilindro si = new Cilindro(0, 0, 0, c2);
                si.askAltura();
                System.out.printf("A área é: %.2f \nO volume é: %.2f\n\n", si.calculateArea(), si.calVolume());
                count++;
                break;
            case 3:
                Triangulo tr = new Triangulo(0, 0);
                tr.setB();
                tr.setH();
                System.out.printf("A área é: %.2f\n\n", tr.calculateArea());
                count++;
                break;
            case 4:
                Retangulo rx = new Retangulo(0, 0);
                rx.setB();
                rx.setH();
                System.out.printf("Área: %.2f\n\n", rx.calculateArea());
                count++;
                break;
            case 5:
                Retangulo rt = new Retangulo(0, 0);
                rt.setH();
                rt.setB();
                rt.calculateArea();
                Piramide_baseQuadrado pqq = new Piramide_baseQuadrado(0, 0, 0, rt);
                pqq.askH();
                System.out.printf("área: %.2f \nVolume: %.2f\n\n", pqq.calculateArea(), pqq.calVolume());
                count++;
                break;
            case 6:
                Retangulo rr = new Retangulo(0, 0);
                rr.setB();
                rr.setH();
                rr.calculateArea();
                Bloco b = new Bloco(0, 0, 0, rr);
                b.askProfu();
                System.out.printf("Área: %.2f \nVolume: %.2f\n\n", b.calculateArea(), b.calVolume());
                count++;
                break;

            default:
                System.exit(0);
        }

    }

    public static void verificarLotacao(PlanoCartesiano_2D p2[]) {
        if (p2[p2.length - 1] != null) {
            PlanoCartesiano_2D p3[] = new PlanoCartesiano_2D[p2.length + 1];
            for (int i = 0; i < p2.length; i++) {
                p3[i] = p2[i];
            }
            p2 = p3;
        }
    }

    public static void imprimir(PlanoCartesiano_2D plano[]) {
        for (PlanoCartesiano_2D c : plano) {
            System.out.print(c.toString()+"\n");

        }
    }
}
