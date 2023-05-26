package com.inventory.inventory_management_api.stocks.services;

import com.inventory.inventory_management_api.stocks.dto.StockDto;
import com.inventory.inventory_management_api.stocks.model.Stocks;

import java.util.List;

public interface StockService {
    Stocks purchase(StockDto stockDto, long itemId);

    Stocks sale(StockDto stockDto, long itemId);
}
