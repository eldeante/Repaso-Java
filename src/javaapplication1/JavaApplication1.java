/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import clases.clase1;

/**
 *
 * @author josee
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double num1=156;
        double num2=12;
        clase1 operacion=new clase1(num1,num2);
        
        System.out.print("SUMA: "+operacion.suma()+"\n");
        System.out.print("RESTA: "+operacion.resta()+"\n");        
        System.out.print("MULTIPLICACIÓN: "+operacion.multiplicacion()+"\n");
        System.out.print("DIVISIÓN: "+operacion.division()+"\n");        
    }
    
}
