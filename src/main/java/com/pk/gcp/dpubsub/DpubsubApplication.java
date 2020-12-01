package com.pk.gcp.dpubsub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.cloud.ServiceOptions;
import com.google.cloud.pubsub.v1.Subscriber;
import com.google.pubsub.v1.ProjectSubscriptionName;

@SpringBootApplication
public class DpubsubApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpubsubApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner getCommandLineRunner() {
		return (args) -> {
			
			String PROJECT_ID = ServiceOptions.getDefaultProjectId();
			String SUBSCRIPTION_ID = "s-invoice";
			
			ProjectSubscriptionName subscriptionName = ProjectSubscriptionName.of(PROJECT_ID, SUBSCRIPTION_ID);
 
			Log log = LogFactory.getLog(DpubsubApplication.class);
			log.info(String.format("Project ID = %s ", PROJECT_ID));
			
			Subscriber subscriber = null;
			
		};
	}

}
