package com.inventory.inventory_management_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class InventoryManagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementApiApplication.class, args);

        System.out.println(inventoryManagement());
    }

    public static String inventoryManagement(){
        return "inventory management system";
    }

}
