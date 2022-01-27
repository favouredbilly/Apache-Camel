package com.example.demo;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World in Camel");
	}
	

}
