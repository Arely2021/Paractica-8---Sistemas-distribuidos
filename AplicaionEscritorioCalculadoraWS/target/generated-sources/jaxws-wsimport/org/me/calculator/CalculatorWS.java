
package org.me.calculator;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWS", targetNamespace = "http://calculator.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {


    /**
     * 
     * @param monto
     * @param numeroTarjeta
     * @param nombre
     * @param codigoCVV
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pagar", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Pagar")
    @ResponseWrapper(localName = "pagarResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.PagarResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/pagarRequest", output = "http://calculator.me.org/CalculatorWS/pagarResponse")
    public boolean pagar(
        @WebParam(name = "numero_tarjeta", targetNamespace = "")
        String numeroTarjeta,
        @WebParam(name = "monto", targetNamespace = "")
        int monto,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "codigo_CVV", targetNamespace = "")
        String codigoCVV);

    /**
     * 
     * @param precio
     * @param total
     * @param numeroProductos
     * @param idProducto
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "comprar", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Comprar")
    @ResponseWrapper(localName = "comprarResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.ComprarResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/comprarRequest", output = "http://calculator.me.org/CalculatorWS/comprarResponse")
    public boolean comprar(
        @WebParam(name = "id_producto", targetNamespace = "")
        String idProducto,
        @WebParam(name = "precio", targetNamespace = "")
        int precio,
        @WebParam(name = "numero_productos", targetNamespace = "")
        int numeroProductos,
        @WebParam(name = "total", targetNamespace = "")
        int total);

}