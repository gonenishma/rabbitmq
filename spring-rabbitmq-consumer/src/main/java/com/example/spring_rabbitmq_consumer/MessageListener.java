package com.example.spring_rabbitmq_consumer;

import com.example.spring_rabbitmq_consumer.config.MQConfig;
import com.example.spring_rabbitmq_consumer.dao.MessageRepository;
import com.example.spring_rabbitmq_consumer.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    MessageRepository messagerepository;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
        messagerepository.save(message);
    }

}
