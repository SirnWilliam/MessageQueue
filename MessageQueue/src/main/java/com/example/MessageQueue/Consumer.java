package com.example.MessageQueue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "email.queue")
	public void consume(String message) {
		System.out.println("Received Message: " + message);
	}
}
