/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author acomesanavila
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurante restaurante=new Restaurante(6f,6f);
        restaurante.calcularClientes();
        System.out.println("clientes =" + restaurante.calcularClientes());
        restaurante.engadirPolbo(6);
        restaurante.amosarPolbo();
        System.out.println("clientes =" + restaurante.calcularClientes());
    }
    
}
