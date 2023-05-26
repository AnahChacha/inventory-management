package com.inventory.inventory_management_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InventoryManagementApiApplicationTests {

    @Test
    void contextLoads() {
    }

/*
    quantity =purchases
    stock increases when the item is purchased
    stock decreases when the item is sold
    quantity=20
    stock is the one that has quantity
    when an item is purchased,stock increases by the purchased quantity
    when an item is sold,stock decreases by the purchased quantity
    for example when i purchase 20 qty of milk,milk stock will increase
    20milk
    stock depends on purchased quantities and sold quantities
    stock=current quantity + purchased qty
    stock=current qty-sold qty
*/

}
