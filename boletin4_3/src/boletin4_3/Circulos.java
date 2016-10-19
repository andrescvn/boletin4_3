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
public class Circulos {
    private float radio;
    public final double pi=3.14;

public Circulos (){
    radio=0;   
}
public Circulos (float r){
    radio =r;      
}
public void setRadio(float ra){
    radio=ra;
}
public float calcularArea (){
    float area;
    area=(float) (pi*Math.pow(radio, 2));
    return area;
}
public double calcularLonxitude (){
double lonxitude;
lonxitude=2*pi*radio;
return lonxitude;
}
}
