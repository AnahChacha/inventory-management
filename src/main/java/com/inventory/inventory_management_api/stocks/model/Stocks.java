package com.inventory.inventory_management_api.stocks.model;

import com.inventory.inventory_management_api.items.entity.Items;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stocks_tb")
public class Stocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
    private long stockId;

    @Column(name = "supplier_id")
    private long supplierId;

    @Column(name = "item_id")
    private long itemId;

    @Column(name = "stock_date")
    private LocalDateTime stockDate;

    @Column(name = "description")
    private String description;

    @Column(name = "stock_quantity")
    private int quantity;

    @Column(name = "stock")
    private int stock;


    @PrePersist
    public void init() {
        this.stockDate = LocalDateTime.now();
    }
}
