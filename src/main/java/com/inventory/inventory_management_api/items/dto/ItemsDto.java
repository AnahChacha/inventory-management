package com.inventory.inventory_management_api.items.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemsDto {
    private String name;
    private int cost;
    private int sale_price;
}
