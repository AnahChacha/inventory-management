package com.inventory.inventory_management_api.items.services;

import com.inventory.inventory_management_api.common.HelperClass;
import com.inventory.inventory_management_api.items.dto.ItemsDto;
import com.inventory.inventory_management_api.items.entity.Items;
import com.inventory.inventory_management_api.items.repository.ItemsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ItemsServiceImpl implements ItemsService{
    private final ItemsRepo itemsRepo;

    @Override
    public Items createItems(ItemsDto itemsDto) {
        Items items1=new Items();
        items1.setCode(HelperClass.generateExternalRef());
        items1.setCost(itemsDto.getCost());
        items1.setSalesPrice(itemsDto.getSale_price());
        items1.setName(itemsDto.getName());
        return itemsRepo.save(items1);
    }

    @Override
    public List<Items> getItems() {
        return itemsRepo.findAll();
    }

    @Override
    public Items getItemById(long itemId) {
        Items item=itemsRepo.findItemsByItemId(itemId).orElseThrow(() -> new RuntimeException("item does not exist"));
        return item;
    }

    @Override
    public Items updateItemById(ItemsDto itemsDto,long itemId) {
        Items item=itemsRepo.findItemsByItemId(itemId).orElseThrow(() -> new RuntimeException("item does not exist"));
        item.setName(itemsDto.getName());
        item.setCost(itemsDto.getCost());
        item.setSalesPrice(itemsDto.getSale_price());
        return itemsRepo.save(item);
    }

    @Override
    public Long deleteItem(long itemId) {
        Items item=itemsRepo.findItemsByItemId(itemId).orElseThrow(() -> new RuntimeException("item does not exist"));
        itemsRepo.delete(item);
        return itemId;
    }
}
