package com.whr.demo;

import javax.jws.WebService;

@WebService(endpointInterface="com.whr.demo.HelloWorldI",serviceName="HelloWorldWs")
public class HelloWorldImpl implements HelloWorldI {

	@Override
	public String sayHi(String name) {
		return "hello"+name;
	}

}
