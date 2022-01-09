package ru.iteco.stock.service;

import ru.iteco.stock.model.HistoricalQuotesData;
import ru.iteco.stock.model.StockData;

public interface StockService {
    StockData getStockData(String url);

    HistoricalQuotesData getHistoricalQuotesData(String url);
}

