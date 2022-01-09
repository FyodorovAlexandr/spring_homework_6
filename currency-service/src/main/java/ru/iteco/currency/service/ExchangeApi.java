package ru.iteco.currency.service;

import ru.iteco.currency.model.AllCurrencyExchange;
import ru.iteco.currency.model.ConvertResult;
import ru.iteco.currency.model.ConverterRequest;

public interface ExchangeApi {

    ConvertResult convert(ConverterRequest request);

    AllCurrencyExchange getAllCurrencyExchange();
}
