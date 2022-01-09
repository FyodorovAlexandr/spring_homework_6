package ru.iteco.currency.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.iteco.currency.model.AllCurrencyExchange;
import ru.iteco.currency.model.ConvertResult;
import ru.iteco.currency.model.ConverterRequest;
import ru.iteco.currency.service.ExchangeApi;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CurrencyController {

    private final ExchangeApi exchangeApi;

    @PostMapping("/convert")
    public ConvertResult convertAmount(@RequestBody ConverterRequest converterRequest,
                                       @RequestHeader("trace-id") String traceId) {
        log.info("Request with trace-id: {}", traceId);
        return exchangeApi.convert(converterRequest);
    }

    @GetMapping("/all-exchange")
    public AllCurrencyExchange getAllExchange(@RequestHeader("trace-id") String traceId) {
        log.info("Request with trace-id: {}", traceId);
        return exchangeApi.getAllCurrencyExchange();
    }
}