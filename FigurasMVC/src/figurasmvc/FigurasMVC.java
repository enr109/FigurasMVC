package figurasmvc;
import Controlador.*;
import Modelo.*;
import Vista.*;
/**
 *
 * @author Enrique
 */
public class FigurasMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica modfab = new Fabrica();
        Circulo modcir = new Circulo();
        Cuadrado modcu = new Cuadrado();
        Recatangulo modrec = new Recatangulo();
        Triangulo modtri = new Triangulo();
        
        Figuras modfrmf = new Figuras();
        
        CtrlFiguras ctrl = new CtrlFiguras(modfab,modcir,modcu,modrec,modtri,modfrmf);
        ctrl.iniciar();
        modfrmf.setVisible(true);
        
        
        
    }
    
}
