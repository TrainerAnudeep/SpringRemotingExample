package com.example.listener;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

public class SimpleMessageListener implements MessageListener {

	private static final Logger logger = Logger.getLogger(SimpleMessageListener.class);

	@Override
	public void onMessage(Message message) {

		TextMessage mess = (TextMessage) message;
		
		try{
			logger.info("Message received: "+ mess.getText());
		}catch(Exception e){
			logger.error(e);
		}
	}




}
