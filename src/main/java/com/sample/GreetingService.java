package com.sample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="GreetingService")
public class GreetingService {

	@WebMethod
	public String sayHello(String name) {

		
		return "Hello " + name;

	}
}
