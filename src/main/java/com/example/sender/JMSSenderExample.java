package com.example.sender;

import org.springframework.context.support.GenericXmlApplicationContext;

public class JMSSenderExample {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:jms-sender-app-context.xml");
		ctx.refresh();
		
		MessageSender messageSender = ctx.getBean("messageSender", MessageSender.class);
		messageSender.sendMessage("One more mess");
		
		ctx.close();
	}

}
