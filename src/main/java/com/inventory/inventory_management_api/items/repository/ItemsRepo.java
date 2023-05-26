package com.inventory.inventory_management_api.items.repository;

import com.inventory.inventory_management_api.items.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemsRepo extends JpaRepository<Items,Long> {
    Optional<Items>findItemsByItemId(long itemId);
}
