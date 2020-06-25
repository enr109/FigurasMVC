package Modelo;

/**
 *
 * @author Enrique
 */
public class Circulo implements Ifigura {
    double area,perimetro;

    @Override
    public String area(float base, float altura) {
        area = Math.PI*(base*base);
        return "El area de un circulo: "+ area;
    }

    @Override
    public String perimetro(float base, float altura) {
        perimetro = 2*Math.PI*base;
        return "El perimetro del circulo es:"+ perimetro;
    }

    @Override
    public String descripcion(float base, float altura) {
        return "El circulo tiene un radio de: " + base;
    }
}
