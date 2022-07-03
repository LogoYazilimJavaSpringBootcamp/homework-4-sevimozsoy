package com.week3project.week3.service;

import com.week3project.week3.config.RabbitMQConfig;
import com.week3project.week3.dto.EmailDto;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private RabbitMQConfig config;
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendEmail(EmailDto email) {
        System.out.println("çalıştım");
        rabbitTemplate.convertAndSend("week3.email",email);
    }

}
