package com.dumitruc.training.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: dumitruc
 * Date: 01/10/14
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
@WebService(name = "StockQuote", serviceName = "StockQuoteService")
public class StockQuoteImpl {

    @WebMethod(operationName = "getQuote")
    public double getQuote(String ticker) {
        System.out.println("Received a call = " + ticker);
        double result = 0.0;
        if (ticker.equals("MHP")) {
            result = 50.0;
        } else if (ticker.equals("IBM")) {
            result = 83.0;
        }
        return result;
    }

}