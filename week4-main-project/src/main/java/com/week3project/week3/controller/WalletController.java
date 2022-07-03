package com.week3project.week3.controller;

import com.week3project.week3.model.Card;
import com.week3project.week3.model.Wallet;
import com.week3project.week3.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    //customercontroller'da kullanılıyor. Müşteriye ait cüzdan oluşturur.
    @PostMapping
    public Wallet createWallet(@RequestBody Wallet requestWallet){
        return walletService.createWallet(requestWallet);
    }
//spesifik bir müşteriye ait cüzdana kart(lar) eklemesi yapar
    @PostMapping(path = "/wallet")
    public Wallet createCards(@RequestBody Card requestCard){
        return walletService.addCards(requestCard);
    }

}
