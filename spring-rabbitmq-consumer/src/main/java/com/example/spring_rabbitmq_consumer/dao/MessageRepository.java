package com.example.spring_rabbitmq_consumer.dao;

import com.example.spring_rabbitmq_consumer.model.CustomMessage;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<CustomMessage, String> {
}
