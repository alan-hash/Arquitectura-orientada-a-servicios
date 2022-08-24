package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		MDB administradorBD =  new MDB();
		List<ArrayList<String>> datosObtenidos= new ArrayList<ArrayList<String>>();
		ArrayList<String> renglonObtenido = new ArrayList<String>();
		String leyenda;
                //insertar
               leyenda= administradorBD.registrarAlta("tbusuarios", "2, 'Jhon','20:46:53','23:46:53','Hacer Tarea','2022-08-23'");
	//	System.out.println(leyenda);
                
                //modificar

      //leyenda = administradorBD.modificarRegistro("tbusuarios", "nombre= 'Saul' , usuario='Sempai' ,  psw= '123547'", "id = 6");e
//     System.out.println(leyenda);
                
               
          //leyenda = administradorBD.borrarRegistro("TbUsuarios", "id = 6");
             System.out.println(leyenda);
		

        }
}
