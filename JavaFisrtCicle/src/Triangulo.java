/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Triangulo extends Figura{
private double baser;
private double alturar;
private double hipotenusa;

public Triangulo (){}

    public Triangulo(double baser, double alturar, double hipotenusa) {
        this.baser = baser;
        this.alturar = alturar;
        this.hipotenusa=hipotenusa;
    }
    @Override
    public double area(){
      double ar=(baser*alturar)/2;
      return ar;
    }
    @Override
    public double perimetro(){
      double pr=baser+alturar+hipotenusa;
      return pr;
    }


    
    
}
