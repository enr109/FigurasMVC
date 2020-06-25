package Modelo;

/**
 *
 * @author Enrique
 */
public class Fabrica {
    public static Ifigura fabricar(int id){
        switch(id){
            case 0:
                return new Cuadrado();
            case 1: 
                return new Recatangulo();
            case 2:
                return new Triangulo();
            case 3:
                return new Circulo();
                default:
                    return null;
        }
    }
}
