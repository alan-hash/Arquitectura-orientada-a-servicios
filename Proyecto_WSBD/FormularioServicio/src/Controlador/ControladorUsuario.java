
package Controlador;
/**
 *
 * @author Angel Alan Gonzalez Escalona 
 */
//import Modelo.MDB;
import Modelo.ModeloUsuario;
import Modelo.Usuario;
import Vista.FrmCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
//import wssoap.WSBDatos;
//import wssoap.WSBDatos_Service;


public class ControladorUsuario implements ActionListener{
  private FrmCliente _view; //el formulario 
  private ModeloUsuario _model;//el manejador de bases de datos


    
    public ControladorUsuario(FrmCliente view, ModeloUsuario modelo){
      this._model=modelo;
       this._view=view;
       this._view.btnRegistrar.addActionListener(this);//se obtiene el control sobre el botón alta del formulario 
       this._view.btnModificar.addActionListener(this);
       this._view.btnBuscar.addActionListener(this);
       this._view.btnEliminar.addActionListener(this);//se obtiene el control de botón eliminar
       this._view.cmdLimpiar.addActionListener(this);
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.btnRegistrar){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        
         
       leyenda=_model.registrarAlta(" null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtEntrada.getText() + " ',' " +_view.txtSalida.getText() + " ',' " +_view.txtActividad.getText() + " ',' " +_view.txtFecha.getText()+"'");
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obtenindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
        
}if (e.getSource()==_view.btnModificar){
  String buscar="El dato se modifico exitosamente";
  
    try {
        buscar =_model.modificarRegistro("Nombre='"+_view.txtNombre.getText()+"',Entrada='"+_view.txtEntrada.getText()+"',Salida='"+_view.txtSalida.getText()+"',Actividad='"+_view.txtActividad.getText()+"',Fecha='"+_view.txtFecha.getText()+"'","IdAlumno="+_view.txtCondicion.getText());
     

//buscar =_model.modificarRegistro("tbusuarios","nombre='"+_view.txtNombre.getText()+"',Usuario='"+_view.txtUsuario.getText()+"',Psw='"+_view.txtpsw.getText()+_view.txtCondicion.getText());
    } catch (Exception ex) {  
} 
  JOptionPane.showMessageDialog(null, buscar);
  limpiar();
}
if (e.getSource()==_view.cmdLimpiar){ 
limpiar();
    }

if (e.getSource()==_view.btnBuscar){ //Si el botón presionado fue el de buscar
    Usuario Buscar =_model.consultarDatos("IdAlumno="+_view.txtCondicion.getText());
    
    try {
        _view.txtNombre.setText(Buscar.getNombre());
        _view.txtEntrada.setText(Buscar.getEntrada());
        _view.txtSalida.setText(Buscar.getSalida());
        _view.txtFecha.setText(Buscar.getFecha());
        _view.txtActividad.setText(Buscar.getActividad());
        
        } catch (Exception ex) { 
         String Eliminar="El ID : "+_view.txtCondicion.getText()+" No existe";
        
        
        }
        String Eliminar="El ID : "+_view.txtCondicion.getText()+" Fue encontrado exitosamente";
        JOptionPane.showMessageDialog(null, Eliminar);
  
}
if (e.getSource()==_view.btnEliminar){
    String Eliminar="Los datos del id"+_view.txtCondicion.getText()+"se eliminaron correctamente";
     try {
        Eliminar=_model.borrarRegistro("IdAlumno="+_view.txtCondicion.getText());
        
        } catch (Exception ex) { }
        JOptionPane.showMessageDialog(null, Eliminar);
       limpiar();  
}

        
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtNombre.setText(null);
_view.txtEntrada.setText(null);
_view.txtSalida.setText(null);

_view.txtFecha.setText(null);
_view.txtActividad.setText(null);

_view.txtCondicion.setText(null);

}



}
