package com.inventory.inventory_management_api.stocks.controller;

import com.inventory.inventory_management_api.stocks.dto.StockDto;
import com.inventory.inventory_management_api.stocks.model.Stocks;
import com.inventory.inventory_management_api.stocks.services.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;
// /api/items/:id/purchases
    @PostMapping(value = "items/{itemId}/purchases")
    public ResponseEntity<Stocks> purchase(@RequestBody StockDto stockDto, @PathVariable long itemId) {
        return ResponseEntity.ok(stockService.purchase(stockDto, itemId));
    }

    @PostMapping(value = "items/{itemId}/sales")
    public ResponseEntity<Stocks>sales(@RequestBody StockDto stockDto,@PathVariable long itemId){
       return ResponseEntity.ok(stockService.sale(stockDto, itemId));
    }
}
