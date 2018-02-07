package org.lap.test.fibonacci;

import javax.jws.WebService;

@WebService(endpointInterface = "org.lap.test.fibonacci.Fibonacci")
public class FibonacciService implements Fibonacci{

	@Override
	public int[] getFibonacciElement(int n) {
		// TODO Auto-generated method stub
		int[]  a = new int[2];
		int t;
		
		a[0]=0;
		a[1]=1;
		
		if(n<=1){
			return a;
		}
		
		for (int k=0; k<n-1; k++){
			t=a[1];
			a[1]=a[1]+a[0];
			a[0]=t;
		}
		
		return a;
	}
	
}
