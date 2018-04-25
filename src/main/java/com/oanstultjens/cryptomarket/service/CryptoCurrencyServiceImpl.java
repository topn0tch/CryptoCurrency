package com.oanstultjens.cryptomarket.service;

import com.oanstultjens.cryptomarket.model.CryptoCurrency;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CryptoCurrencyServiceImpl implements CryptoCurrencyService {

    @Override
    public List<CryptoCurrency> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<CryptoCurrency>> cryptosResponse = restTemplate.exchange(
                "https://api.coinmarketcap.com/v1/ticker/",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<CryptoCurrency>>() {

                });
        List<CryptoCurrency> cryptoCurrencies = cryptosResponse.getBody();

        return cryptoCurrencies;
    }

    @Override
    public CryptoCurrency findByName(String name) {
        System.out.println("test");
        return null;
    }
}
