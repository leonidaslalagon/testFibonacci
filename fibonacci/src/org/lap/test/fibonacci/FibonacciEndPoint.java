package org.lap.test.fibonacci;

import javax.xml.ws.Endpoint;


public class FibonacciEndPoint {

	public static void main (String args[]){
		System.out.println("Starting service");
		Endpoint.publish("http://localhost:8081/fibonacci", new FibonacciService());
		System.out.println("Started service");
	}
	
}
