package com.inventory.inventory_management_api.stocks.repository;

import com.inventory.inventory_management_api.stocks.model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StockRepo extends JpaRepository<Stocks,Long> {
  @Query("select max (stock)from Stocks ")
 Integer findStock();
}
