package com.example.ApacheCamelmicroservicea.routes.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FirstTimerRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		//queue--timer
		//transformation
		//database--log
		//
		from("timer:first-timer")//queue
		//.transform().constant("My Constnat message")
		.transform().constant("Time now is " + LocalDateTime.now())
		.to("log:first-timer");//database
		
		
	}

}
