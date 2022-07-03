package com.week3emailservice.week3emailservice.service;


import com.week3emailservice.week3emailservice.model.Email;
import com.week3emailservice.week3emailservice.dao.IEmailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailDataBaseService {

    @Autowired
    IEmailDao emailRepository;

public void saveEmail(Email email){
    emailRepository.save(email);
    System.out.println(email.getEmail() + "kayıt işlemi başarılı!");
}

public Email findEmailId(Email email){
    return emailRepository.findById(email.getId());
}
}
