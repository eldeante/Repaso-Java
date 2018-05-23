/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author josee
 */
public class clase1 {
    
    //Variables
    private double numb1;
    private double numb2;
    private double resultado;
    
    //Constructor
    public clase1(double num1, double num2)
    {
        this.numb1=num1;
        this.numb2=num2;
    }
    
    //Métodos
    public double suma()
    {
        this.resultado=this.numb1+this.numb2;
        return resultado;
    }
    
    public double resta()
    {
        if(this.numb1>=this.numb2)
        {
            this.resultado=this.numb1-this.numb2;            
        }
        
        else
        {
            this.resultado=this.numb2-this.numb1;                        
        }
        
        return resultado;
    }

    public double multiplicacion()
    {
        this.resultado=this.numb1*this.numb2;
        return resultado;
    }

    public double division()
    {
        if(this.numb1==0 || this.numb2==0)
        {
            return 0;
        }
                
        else
        {
            if(this.numb1>=this.numb2)
            {
                this.resultado=this.numb1/this.numb2;            
            }

            else
            {
                this.resultado=this.numb2/this.numb1;                        
            }
            
            return this.resultado;
        }
    }
}
