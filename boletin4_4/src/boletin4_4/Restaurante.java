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
public class Restaurante {
private float patacas;
private float polbo;

public Restaurante (float polbo, float patacas){
   this.patacas=patacas;
   this.polbo=polbo;
}
public float calcularClientes(){
  float clientes;
  clientes=(polbo/2*3);
  return clientes;  
}
public void engadirPolbo(int x ) {
   float polbototal;
    polbo=polbo+x;
}
public void engadirPatacas ( int x) {
 float patacastotal;
 patacastotal=patacas+x;
}
 public void amosarPolbo( ){
 System.out.println("polbo = "+ polbo);
 }
public void amosarPatacas ( ){
System.out.println ("patacas ="+ patacas);    
}
}
