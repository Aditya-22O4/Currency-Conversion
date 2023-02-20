package com.currencyExchange.audit.models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
public class RatesExchangeDetails implements Comparable<RatesExchangeDetails> {
    private String Base_Currency;
    private String Conversion_Currency;
    private Double Rate;
    private Date timeStamp;

    @Override
    public int compareTo(RatesExchangeDetails o) {
        return Base_Currency.compareTo(o.Base_Currency);
    }
}