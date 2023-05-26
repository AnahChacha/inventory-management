package com.inventory.inventory_management_api.items.entity;
import com.inventory.inventory_management_api.stocks.model.Stocks;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "items_tb")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long itemId;

    @Column(name = "supplier_id")
    private long supplierId;

    @Column(name = "item_name")
    private String name;

    @Column(name = "unique_code")
    private String code;

    @Column(name = "item_cost")
    private int cost;

    @Column(name = "sales_price")
    private int salesPrice;

    @OneToMany(mappedBy = "itemId",cascade = CascadeType.ALL)
    List<Stocks>stocks;
}
