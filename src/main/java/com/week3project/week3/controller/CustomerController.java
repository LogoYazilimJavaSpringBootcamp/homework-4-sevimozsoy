package com.week3project.week3.controller;


import com.week3project.week3.model.Card;
import com.week3project.week3.model.Customer;
import com.week3project.week3.model.Wallet;
import com.week3project.week3.service.CustomerService;
import com.week3project.week3.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Müşteri oluşturur.
    @PostMapping
    public Customer createCustomer(@RequestBody Customer requestCustomer) {
        return customerService.createCustomer(requestCustomer);
    }

    //Müşteriler için cüzdan oluşturur. Her müşterinin tek bir cüzdanı vardır.
    @PostMapping(path = "/{name}/wallet")
    public Customer createWalletForCustomer(@PathVariable String name, @RequestBody Wallet wallet){
        return customerService.createWalletForCustomer(name, wallet);
    }

    //Müşterinin cüzdanına kart eklemesi yapar. Birden fazla kart mevcut olabilir.
    @PostMapping(path = "/{name}/wallet/cards")
    public Customer createCardsForCustomer(@PathVariable String name, @RequestBody Card card){
        return customerService.createCardsForCustomer(name, card);
    }
//bütün müşteriler listelenir
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    //verilen isime sahip müşteri displaylenir
    @GetMapping(value = "/{name}")
    public List<Customer> findCustomerByName(@PathVariable String name) {
        return customerService.findCustomerByName(name);
    }

    //aktif bütün müşteriler listelenir
    @GetMapping(value = "/active")
    public List<Customer> isCustomerActive() {
        return customerService.isCustomerActive();
    }

    //pasif bütün müşteriler listelenir
    @GetMapping(value = "/passive")
    public List<Customer> isCustomerPassive() {
        return customerService.isCustomerPassive();
    }


}
