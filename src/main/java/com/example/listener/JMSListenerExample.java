package com.example.listener;

import org.springframework.context.support.GenericXmlApplicationContext;

public class JMSListenerExample{

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:jms-listener-app-context.xml");
		ctx.refresh();
		while(true){
			
		}
	}
	
}
