/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public  class Rectangulo extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo (){}

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    @Override
    public double area() {
        double ar=base*altura;
        return ar;
    }

    @Override
    public double perimetro() {
      double pr= (2*base)+(2*altura);
      return pr;
    }
    
    
}
