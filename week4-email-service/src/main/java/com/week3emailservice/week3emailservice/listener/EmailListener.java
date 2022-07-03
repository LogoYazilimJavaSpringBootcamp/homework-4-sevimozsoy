package com.week3emailservice.week3emailservice.listener;

import com.week3emailservice.week3emailservice.model.Email;
import com.week3emailservice.week3emailservice.service.EmailDataBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailListener {

    @Autowired
    EmailDataBaseService emailDataBaseService;

    @RabbitListener(queues = "week3.email")
    public void emailListener(Email email){

        log.info("email address: {}",email.getEmail());

        emailDataBaseService.saveEmail(email);

    }
}
