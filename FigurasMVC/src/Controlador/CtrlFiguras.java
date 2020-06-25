package Controlador;
import Modelo.*;
import Vista.Figuras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class CtrlFiguras implements ActionListener {
    private Fabrica modFab;
    private Ifigura modFig;
    private Circulo modCir;
    private Cuadrado modCu;
    private Recatangulo modRec;
    private Triangulo modTri;
    private Figuras frm;
    
    public CtrlFiguras(Fabrica modFab,Circulo modCir,Cuadrado modCu,Recatangulo modRec,Triangulo modTri,Figuras frm){
        this.modFab=modFab;
        this.modCir=modCir;
        this.modCu=modCu;
        this.modRec=modRec;
        this.modTri=modTri;
        this.frm=frm;
        this.frm.btncalcular.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Figuras");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float base,altura;
        if(e.getSource()==frm.btncalcular){
            base=Float.parseFloat(frm.txtbase.getText());
            altura=Float.parseFloat(frm.txtaltura.getText());
            Ifigura C= Fabrica.fabricar(frm.cmbfiguras.getSelectedIndex());
            frm.txtarea.setText(C.area(base, altura));
            frm.txtperimetro.setText(C.perimetro(base,altura));
            frm.txtdescripcion.setText(C.descripcion(base,altura));
        }
    }
    
    
}
