package ru.iteco.stock.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.iteco.stock.model.HistoricalQuotesData;
import ru.iteco.stock.model.StockData;

@Component
public class StockServiceImpl implements StockService {

    @Override
    public StockData getStockData(String url){
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, StockData.class);
    }

    @Override
    public HistoricalQuotesData getHistoricalQuotesData(String url) {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, HistoricalQuotesData.class);
    }
}