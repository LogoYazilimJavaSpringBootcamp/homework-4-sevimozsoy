package com.week3emailservice.week3emailservice.dao;

import com.week3emailservice.week3emailservice.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmailDao extends JpaRepository<Email, String> {

    public List<Email> findAll();

    public Email findById(Integer id);

    public void deleteById(int id);
}
