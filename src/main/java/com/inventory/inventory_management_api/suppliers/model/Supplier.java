package com.inventory.inventory_management_api.suppliers.model;

import com.inventory.inventory_management_api.items.entity.Items;
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
@Table(name = "suppliers_tb")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private long supplierId;

    @Column(name = "supplier_name")
    private String name;

    @OneToMany(mappedBy = "supplierId", cascade = CascadeType.ALL)
    List<Stocks> stocks;

    @OneToMany(mappedBy = "supplierId", cascade = CascadeType.ALL)
    List<Items> items;
}
