package ru.iteco.stock.model;

import lombok.Data;

import java.util.List;

@Data
public class HistoricalQuotesData {
    private Meta meta;

    private List<HistoricalInfo> data;
}
