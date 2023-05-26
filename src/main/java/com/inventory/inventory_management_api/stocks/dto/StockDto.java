package com.inventory.inventory_management_api.stocks.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockDto {
    private String description;
    private int quantity;
   // private long itemId;
}
