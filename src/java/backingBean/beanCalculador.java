/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBean;

import controller.ControllerCalculadora;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author casa
 */
@ManagedBean
@RequestScoped
public class beanCalculador {

    /**
     * Creates a new instance of beanCalculador
     */
    public beanCalculador() {
    }
    
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    private int a;
    private int b;
    private int resultado;
    public ControllerCalculadora control = new ControllerCalculadora();
    
   

    public int calculaSuma(){
        int r = control.suma(a, b);
        setResultado(r);
        return r;
    }
    public int calculaResta(){
        int r = control.resta(a, b);
        setResultado(r);
        return r;
    }
    public int calculaMultiplicacion(){
        int r = control.multiplicacion(a, b);
        setResultado(r);
        return r;
    }
    public int calculaDivision(){
        int r = 0;
        if(b==0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        else{
            r = (int)control.division(a,b);
            setResultado(r);
            return r;
        }      
    }
    
}
