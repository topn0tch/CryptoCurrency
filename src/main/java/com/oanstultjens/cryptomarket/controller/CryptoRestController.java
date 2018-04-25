package com.oanstultjens.cryptomarket.controller;

import com.oanstultjens.cryptomarket.model.CryptoCurrency;
import com.oanstultjens.cryptomarket.service.CryptoCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/crypto")
public class CryptoRestController {

    @Autowired
    CryptoCurrencyService cryptoCurrencyService;

    @GetMapping("/all")
    public List<CryptoCurrency> getAllCurrencies() {
        return cryptoCurrencyService.findAll();
    }

    @GetMapping("/name/{id}")
    public CryptoCurrency getCurrencyByName(@PathVariable String id) {
        return cryptoCurrencyService.findByName(id);
    }
}
