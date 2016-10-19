/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author acomesanavila
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Circulos circulo=new Circulos ();
        circulo.setRadio(50);
        System.out.println("area = " + circulo.calcularArea() + " \nlonxitude = " + circulo.calcularLonxitude());
        Circulos circulo1=new Circulos (2);
         System.out.println("area = " + circulo1.calcularArea() + " \nlonxitude = " + circulo1.calcularLonxitude());       
    }
    
       
 
    
}
