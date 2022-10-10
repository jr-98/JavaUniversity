/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        double ar = ((Math.PI * Math.pow(radio, 2)) / 2);
        return ar;
    }

    @Override
    public double perimetro() {
        double pr = Math.PI * Math.pow(radio, 2);
        return pr;
    }

}
