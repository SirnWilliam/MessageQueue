package com.example.MessageQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MessageQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageQueueApplication.class, args);
	}

}
