package ru.iteco.stock.model;

import lombok.Data;

import java.util.List;

@Data
public class StockData {
    private List<Info> data;
}