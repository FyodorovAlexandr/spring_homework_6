package ru.iteco.currency.model;

import lombok.Data;

import java.util.Map;

@Data
public class AllCurrencyExchange {

    private String base;
    private String date;
    private Map<String, String> rates;
}

