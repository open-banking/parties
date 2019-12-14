package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class PartiesGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        String userId = "stevehu";
        String responseBody = null;
        if("stevehu".equals(userId)) {
            responseBody = "{\"Data\":{\"Party\":{\"PartyId\":\"PXSIF023\",\"PartyType\":\"Delegate\",\"Name\":\"Steve Hu\",\"EmailAddress\":\"steve.hu@gmail.com\"}},\"Links\":{\"Self\":\"https://api.alphabank.com/parties\"},\"Meta\":{\"TotalPages\":1}}";
        } else if("ericbroda".equals(userId)) {
            responseBody = "{\"Data\":{\"Party\":{\"PartyId\":\"PXSIF024\",\"PartyType\":\"Delegate\",\"Name\":\"Eric Broda\",\"EmailAddress\":\"ericbroda@rogers.com\"}},\"Links\":{\"Self\":\"https://api.alphabank.com/parties\"},\"Meta\":{\"TotalPages\":1}}";
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
