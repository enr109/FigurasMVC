/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Enrique
 */
public class Recatangulo implements Ifigura{

    @Override
    public String area(float base, float altura) {
        return "El area de el Rectangulo es: "+Float.toString(base*altura);
    }

    @Override
    public String perimetro(float base, float altura) {
        return "El perimetro de el Rectangulo es :"+Float.toString(2*(base+altura));
    }

    @Override
    public String descripcion(float base, float altura) {
        return "Este es un Rectangulo con una base de: " + base+" x "+ altura+" de alto";
    }
    
}
