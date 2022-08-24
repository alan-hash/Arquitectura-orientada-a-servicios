
package pkgservicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSBDatos", targetNamespace = "http://pkgServicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSBDatos {


    /**
     * 
     * @param condicion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscar", targetNamespace = "http://pkgServicio/", className = "pkgservicio.Buscar")
    @ResponseWrapper(localName = "buscarResponse", targetNamespace = "http://pkgServicio/", className = "pkgservicio.BuscarResponse")
    @Action(input = "http://pkgServicio/WSBDatos/buscarRequest", output = "http://pkgServicio/WSBDatos/buscarResponse")
    public String buscar(
        @WebParam(name = "condicion", targetNamespace = "")
        String condicion);

    /**
     * 
     * @param sqlconsultaalta
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "baja", targetNamespace = "http://pkgServicio/", className = "pkgservicio.Baja")
    @ResponseWrapper(localName = "bajaResponse", targetNamespace = "http://pkgServicio/", className = "pkgservicio.BajaResponse")
    @Action(input = "http://pkgServicio/WSBDatos/bajaRequest", output = "http://pkgServicio/WSBDatos/bajaResponse")
    public String baja(
        @WebParam(name = "sqlconsultaalta", targetNamespace = "")
        String sqlconsultaalta);

    /**
     * 
     * @param sqlconsultaalta
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "altas", targetNamespace = "http://pkgServicio/", className = "pkgservicio.Altas")
    @ResponseWrapper(localName = "altasResponse", targetNamespace = "http://pkgServicio/", className = "pkgservicio.AltasResponse")
    @Action(input = "http://pkgServicio/WSBDatos/altasRequest", output = "http://pkgServicio/WSBDatos/altasResponse")
    public String altas(
        @WebParam(name = "sqlconsultaalta", targetNamespace = "")
        String sqlconsultaalta);

    /**
     * 
     * @param datos
     * @param condicion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifica", targetNamespace = "http://pkgServicio/", className = "pkgservicio.Modifica")
    @ResponseWrapper(localName = "modificaResponse", targetNamespace = "http://pkgServicio/", className = "pkgservicio.ModificaResponse")
    @Action(input = "http://pkgServicio/WSBDatos/modificaRequest", output = "http://pkgServicio/WSBDatos/modificaResponse")
    public String modifica(
        @WebParam(name = "datos", targetNamespace = "")
        String datos,
        @WebParam(name = "condicion", targetNamespace = "")
        String condicion);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://pkgServicio/", className = "pkgservicio.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://pkgServicio/", className = "pkgservicio.HelloResponse")
    @Action(input = "http://pkgServicio/WSBDatos/helloRequest", output = "http://pkgServicio/WSBDatos/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
