package com.whr.demo;

import javax.xml.ws.Endpoint;

public class ServiceMain {
	 public static void main(String args[]){  
		 HelloWorldImpl hw = new HelloWorldImpl();  
	     Endpoint.publish("http://localhost:8089/whr", hw);  
	     System.out.println("Web Service发布成功");  
	}  
}
