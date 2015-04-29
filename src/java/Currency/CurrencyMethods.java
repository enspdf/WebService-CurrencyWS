/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Currency;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author shackox
 */
@WebService(serviceName = "CurrencyMethods")
public class CurrencyMethods {

    /**
     * This is a sample web service operation
     * @param dollar
     * @return 
     */
    
    @WebMethod(operationName = "convertEuro")
    public Double convertEuro(@WebParam(name = "dollar") Double dollar){
        return dollar * EURO;
    }
    
    @WebMethod(operationName = "convertPound")
    public Double convertPound(@WebParam(name = "dollar") Double dollar){
        return dollar * POUND;
    }
    
    @WebMethod(operationName = "convertYen")
    public Double convertYen(@WebParam(name = "dollar") Double dollar){
        return dollar * YEN;
    }
    
    @WebMethod(operationName = "convertCDNDollar")
    public Double convertCanDollar(@WebParam(name = "dollar") Double dollar){
        return dollar * CDN_DOLLAR;
    }
    
    private static final double POUND = .56094;
    private static final double EURO = .7061;
    private static final double CDN_DOLLAR = 1.06957;
    private static final double YEN = 106.386;
}
