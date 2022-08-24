package pkgServicio;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pkgFuncionalidad.Calculadora;
import pkgFuncionalidad.Suma;
/**
*
* @author jrodriguez
*/
@WebService(serviceName = "WSCalculadora")
public class WSCalculadora {
/**
* This is a sample web service operation
*/
@WebMethod(operationName = "hello")
public String hello(@WebParam(name = "name") String txt) {
return "Hello " + txt + " !";
}
/**
* Web service operation que encapsula a la suma
*/
@WebMethod(operationName = "suma")
public double suma(@WebParam(name = "numero1") int numero1, @WebParam(name
= "numero2") int numero2) {
//TODO write your implementation code here:
Calculadora objCalculadora=new Suma();
return (objCalculadora.calcular(numero1, numero2));
}
}
