package com.inventory.inventory_management_api.stocks.services;

import com.inventory.inventory_management_api.items.repository.ItemsRepo;
import com.inventory.inventory_management_api.stocks.dto.StockDto;
import com.inventory.inventory_management_api.stocks.model.Stocks;
import com.inventory.inventory_management_api.stocks.repository.StockRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    private final StockRepo stockRepo;
    private final ItemsRepo itemsRepo;

    @Override
    public Stocks purchase(StockDto stockDto, long itemId) {
        Stocks stocks = new Stocks();
        Integer stock = stockRepo.findStock();
        if (stock == null) {
            stock = 0;
            int quantity = stockDto.getQuantity();
            stocks.setDescription(stockDto.getDescription());
            stocks.setQuantity(stockDto.getQuantity());
            stocks.setStock(stock + quantity);
            stocks.setItemId(itemId);
        }
        int quantity = stockDto.getQuantity();
        stocks.setDescription(stockDto.getDescription());
        stocks.setQuantity(stockDto.getQuantity());
        stocks.setStock(stock + quantity);
        stocks.setItemId(itemId);
        return stockRepo.save(stocks);
    }

    @Override
    public Stocks sale(StockDto stockDto, long itemId) {
        Stocks stocks=new Stocks();
        Integer stock = stockRepo.findStock();

        if (stock ==null){
            stock=0;
            int quantity=stockDto.getQuantity();
            stocks.setDescription(stockDto.getDescription());
            stocks.setItemId(itemId);
            stocks.setQuantity(quantity);
            stocks.setStock(stock-quantity);
        }

        int quantity=stockDto.getQuantity();
        stocks.setDescription(stockDto.getDescription());
        stocks.setItemId(itemId);
        stocks.setQuantity(quantity);
        stocks.setStock(stock-quantity);
        return stockRepo.save(stocks);
    }

    private String generateExternalRef() {
        RandomStringGenerator stringGenerator = new RandomStringGenerator.Builder()
                .withinRange('0', 'z')
                .filteredBy(CharacterPredicates.DIGITS, CharacterPredicates.DIGITS).build();
        String transactionNumber = stringGenerator.generate(5).toUpperCase();
        log.info("Transaction Number:{}", transactionNumber);
        return transactionNumber;

    }
}
