package org.lap.test.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class FibonacciTest {
	public static void main (String args[]){
		try {
			URL url = new URL("http://localhost:8081/fibonacci?wsdl");
			QName qn = new QName("http://fibonacci.test.lap.org/", "FibonacciServiceService");
			Service s = Service.create(url, qn);
			Fibonacci f = s.getPort(Fibonacci.class);
			
			int[] x;
			
			
			
			InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader (isr);
	        
			while(true){
				
				System.out.println("Input element number of fibonacci succession: ");
				String nstr = br.readLine();
				int n = Integer.parseInt(nstr);
				if(n<0){
					throw new Exception();
				}
				
				
				x = f.getFibonacciElement(n);
				System.out.println("Solution: (n -1, n) = (" + x[0] + ", " + x[1] + ")");
			}
			
			
			
		} catch (MalformedURLException  e) {
			
			System.out.println("Url failed");
			//e.printStackTrace();
		} catch (IOException e){
			System.out.println("Input failed");
		} catch (Exception e) {
			System.out.println("Input string isn't positive integer");
		}
	}

}
