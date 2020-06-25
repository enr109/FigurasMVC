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
public class Cuadrado implements Ifigura {
    float areaC,perimetroC;

    @Override
    public String area(float base, float altura) {
        areaC=base*4;
        return "El area es: "+areaC;
    }

    @Override
    public String perimetro(float base, float altura) {
        perimetroC=base*base;
        return "El perimetro es: "+perimetroC;
    }

    @Override
    public String descripcion(float base, float altura) {
        return "Este es un cuadrado de: " + base+" x "+ base;
    }
    
}
