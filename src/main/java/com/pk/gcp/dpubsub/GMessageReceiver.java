package com.pk.gcp.dpubsub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.google.cloud.pubsub.v1.AckReplyConsumer;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.pubsub.v1.PubsubMessage;

@Component
public class GMessageReceiver implements MessageReceiver {
	
	private Log log = LogFactory.getLog(GMessageReceiver.class);

	@Override
	public void receiveMessage(PubsubMessage message, AckReplyConsumer consumer) {
		// TODO Auto-generated method stub
		log.info("Message Details......");
		log.info("Message ID : " + message.getMessageId());
		log.info("Data " +message.getData().toStringUtf8());
		//handle the msg 
		consumer.ack();
		
	}

}
