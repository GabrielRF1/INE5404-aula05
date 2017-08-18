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
public abstract class Plano_3D extends PlanoCartesiano_2D {

    int z;

    public Plano_3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public void moveTo(int newX, int newY, int newZ) {
        super.moveTo(newX, newY);
        z = newZ;
    }

    @Override
    public String toString() {

        return super.toString() + "," + "z=" + z;
    }

}
