package ru.iteco.stock.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.iteco.stock.model.HistoricalQuotesData;
import ru.iteco.stock.model.StockData;
import ru.iteco.stock.service.StockService;

@RestController
@RequestMapping("/stock-data")
public class StockServiceController {
    private final StockService stockService;

    public StockServiceController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/real-time")
    public ResponseEntity <StockData> getRealTimeStockData(){
        return ResponseEntity.ok(stockService.getStockData("https://api.stockdata.org/v1/data/quote?symbols=AAPL,TSLA,MSFT&api_token=8EfuMBEyvaG0SJNW8cqqTGUtMLyEbSClhGMhQLFo"));
    }

    @GetMapping("/historical")
    public ResponseEntity <HistoricalQuotesData> getHistoricalStockData(){
        return ResponseEntity.ok(stockService.getHistoricalQuotesData("https://api.stockdata.org/v1/data/eod?symbols=TSLA&api_token=8EfuMBEyvaG0SJNW8cqqTGUtMLyEbSClhGMhQLFo"));
    }
}

