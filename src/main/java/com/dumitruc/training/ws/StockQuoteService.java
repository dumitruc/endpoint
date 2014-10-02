package com.dumitruc.training.ws;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: dumitruc
 * Date: 01/10/14
 * Time: 21:29
 * To change this template use File | Settings | File Templates.
 */
public class StockQuoteService {
    private Endpoint endpoint = null;

    private static final String ENDPOINT_URL="http://localhost:1970/StockQuote/StockQuoteService";


    public StockQuoteService() {
        endpoint = Endpoint.create(new StockQuoteImpl());
        endpoint.getBinding().getHandlerChain();
    }
    private void publish() {
        endpoint.publish(ENDPOINT_URL);
    }

    public void stopService(){
        endpoint.stop();
        System.out.println("Service stopped!" + endpoint);
    }

    public static void main(String[] args) throws InterruptedException {
        StockQuoteService sqs = new StockQuoteService();
        sqs.publish();
        System.out.println(String.format("StockQuoteService is open for business at %s!",ENDPOINT_URL));
        Thread.sleep(5000);
//        sqs.stopService();
    }
}
