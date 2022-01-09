package ru.iteco.stock.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Info {
    private String ticker;

    private String name;

    private String currency;

    private BigDecimal price;
}