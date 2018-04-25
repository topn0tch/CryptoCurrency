package com.oanstultjens.cryptomarket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CryptoCurrency {
    private String id;
    private String name;
    private String symbol;
    private int rank;
    private BigDecimal price_usd;
    private BigDecimal price_btc;
    private BigDecimal usd_24h_volume;
    private BigDecimal usd_market_cap;
    private BigDecimal available_supply;
    private BigDecimal total_supply;
    private BigDecimal max_supply;
    private Double percent_change_1h;
    private Double percent_change_24h;
    private Double percent_change_7d;
    private Double last_updated;

    public CryptoCurrency() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public BigDecimal getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(BigDecimal price_usd) {
        this.price_usd = price_usd;
    }

    public BigDecimal getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(BigDecimal price_btc) {
        this.price_btc = price_btc;
    }

    public BigDecimal getUsd_24h_volume() {
        return usd_24h_volume;
    }

    public void setUsd_24h_volume(BigDecimal usd_24h_volume) {
        this.usd_24h_volume = usd_24h_volume;
    }

    public BigDecimal getUsd_market_cap() {
        return usd_market_cap;
    }

    public void setUsd_market_cap(BigDecimal usd_market_cap) {
        this.usd_market_cap = usd_market_cap;
    }

    public BigDecimal getAvailable_supply() {
        return available_supply;
    }

    public void setAvailable_supply(BigDecimal available_supply) {
        this.available_supply = available_supply;
    }

    public BigDecimal getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(BigDecimal total_supply) {
        this.total_supply = total_supply;
    }

    public BigDecimal getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(BigDecimal max_supply) {
        this.max_supply = max_supply;
    }

    public Double getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(Double percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public Double getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(Double percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public Double getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(Double percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public Double getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Double last_updated) {
        this.last_updated = last_updated;
    }

    @Override
    public String toString() {
        return "CryptoCurrency{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", rank=" + rank +
                ", price_usd=" + price_usd +
                ", price_btc=" + price_btc +
                ", usd_24h_volume=" + usd_24h_volume +
                ", usd_market_cap=" + usd_market_cap +
                ", available_supply=" + available_supply +
                ", total_supply=" + total_supply +
                ", max_supply=" + max_supply +
                ", percent_change_1h=" + percent_change_1h +
                ", percent_change_24h=" + percent_change_24h +
                ", percent_change_7d=" + percent_change_7d +
                ", last_updated=" + last_updated +
                '}';
    }
}
