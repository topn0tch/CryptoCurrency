package com.oanstultjens.cryptomarket.controller;

import com.oanstultjens.cryptomarket.model.CryptoCurrency;
import com.oanstultjens.cryptomarket.service.CryptoCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    CryptoCurrencyService cryptoCurrencyService;

    @GetMapping("/")
    public String getIndex(Model model) {
        List<CryptoCurrency> cryptoCurrencyList = cryptoCurrencyService.findAll();
        model.addAttribute("allCryptoCurrencies", cryptoCurrencyList);
        model.addAttribute("current_time", System.currentTimeMillis());
        return "index";
    }
}
