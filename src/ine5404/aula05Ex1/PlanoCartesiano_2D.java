/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.aula05Ex1;

/**
 *
 * @author Gabriel
 */
public abstract class PlanoCartesiano_2D {

    int x, y;

    public PlanoCartesiano_2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
    }

    @Override
    public String toString() {
        return "Plano Cartesiano:" + "x=" + x + ", y=" + y;
    }

}
