/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author jafhet
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {
    String num_tarjeta="123-456-789";
    String nom="Fernando";
    String cod_cvv="456";
    String id_pro="PR-1";
    int tot=1000;
    int num_productos=0;
    int pre=0;
    /**
     * Web service operation
     * @param numero_tarjeta
     * @param monto
     * @param nombre
     * @param codigo_CVV
     * @return 
     */
    @WebMethod(operationName = "pagar")
    public boolean pagar(@WebParam(name = "numero_tarjeta") String numero_tarjeta, @WebParam(name = "monto") int monto, @WebParam(name = "nombre") String nombre, @WebParam(name = "codigo_CVV") String codigo_CVV) {
        boolean comprobacion=false;
        if(num_tarjeta.equals(numero_tarjeta)){
            if(tot<=monto){
                if(nom.equals(nombre)){
                    if(cod_cvv.equals(codigo_CVV)){
                        comprobacion=true;
                    }else{
                        comprobacion=false;}
                }else{
                    comprobacion=false;}
            }else{
                comprobacion=false;}
        }else{
        comprobacion=false;}
        return comprobacion;
    }

    /**
     * @param id_producto
     * Web service operation
     * @param precio
     * @param numero_productos
     * @param total
     * @return 
     */
    @WebMethod(operationName = "comprar")
    public boolean comprar(@WebParam(name = "id_producto") String id_producto, @WebParam(name = "precio") int precio, @WebParam(name = "numero_productos") int numero_productos, @WebParam(name = "total") int total) {
        boolean comprobacion=true;
        if(id_pro.equals(id_producto)){
            tot=total;
            pre=precio;
            num_productos=numero_productos;
            comprobacion=true;
        }else{
            comprobacion=false;}
        return comprobacion;
    }

   
}
