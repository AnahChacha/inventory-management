package com.inventory.inventory_management_api.items.services;

import com.inventory.inventory_management_api.items.dto.ItemsDto;
import com.inventory.inventory_management_api.items.entity.Items;

import java.util.List;

public interface ItemsService {
    Items createItems(ItemsDto itemsDto);

    List<Items>getItems();

    Items getItemById(long itemId);

    Items updateItemById(ItemsDto itemsDto,long itemId);

    Long deleteItem(long itemId);
}
