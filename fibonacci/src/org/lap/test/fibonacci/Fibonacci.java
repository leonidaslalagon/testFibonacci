package org.lap.test.fibonacci;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public interface Fibonacci {
	@WebMethod int[] getFibonacciElement(int n);
}
