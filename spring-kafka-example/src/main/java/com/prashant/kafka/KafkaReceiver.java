package com.prashant.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {
	
	private static final Logger LOGGER =
		      LoggerFactory.getLogger(KafkaReceiver.class);
	
	@KafkaListener(topics = "MyTopic")
	  public void receive(String message) {
	    LOGGER.info("Received Message at Client Side ='{}'", message);
	   
	  }

}
