package com.iv.rewardpoint.rabbitmq.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "rewardpoint_rabbitmq")
public class RabbitCustomer {

	@RabbitHandler
	public void showMessage(String message) {
		System.out.println("从rabbitmq 接收到的消息：" + message);
		
	}
}
