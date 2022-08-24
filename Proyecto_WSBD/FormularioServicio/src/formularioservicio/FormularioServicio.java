/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioservicio;

import Controlador.ControladorUsuario;
import Modelo.ModeloUsuario;
import Vista.FrmCliente;

/**
 *
 * @author LALO
 */
public class FormularioServicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ModeloUsuario objModelo=new ModeloUsuario();
        FrmCliente objVista=new FrmCliente ();
        ControladorUsuario objController;
        
     
        objController = new ControladorUsuario(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
    }
}
