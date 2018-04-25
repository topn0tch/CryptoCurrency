package com.oanstultjens.cryptomarket.service;

import com.oanstultjens.cryptomarket.model.CryptoCurrency;

import java.util.List;

public interface CryptoCurrencyService {
    List<CryptoCurrency> findAll();
    CryptoCurrency findByName(String name);
}
