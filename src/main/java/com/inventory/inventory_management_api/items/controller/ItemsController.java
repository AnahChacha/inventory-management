package com.inventory.inventory_management_api.items.controller;

import com.inventory.inventory_management_api.items.dto.ItemsDto;
import com.inventory.inventory_management_api.items.entity.Items;
import com.inventory.inventory_management_api.items.services.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api")
public class ItemsController {
    private final ItemsService itemsService;

    @PostMapping(value = "/items")
    public ResponseEntity<Items>createItems(@RequestBody ItemsDto itemsDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(itemsService.createItems(itemsDto));
    }

    @GetMapping(value = "/items")
   public ResponseEntity<List<Items>>getItems(){
        return ResponseEntity.status(HttpStatus.OK).body(itemsService.getItems());
   }

   @GetMapping(value = "/items/{itemId}")
   public ResponseEntity<Items>findItemById(@PathVariable long itemId){
        return ResponseEntity.status(HttpStatus.OK).body(itemsService.getItemById(itemId));
   }

   @PutMapping(value = "/items/{itemId}")
   public ResponseEntity<Items>updateItemById(@RequestBody ItemsDto itemsDto,@PathVariable long itemId){
      return ResponseEntity.status(HttpStatus.OK).body(itemsService.updateItemById(itemsDto,itemId));
   }

   @DeleteMapping(value = "items/{itemId}")
   public ResponseEntity<Long>deleteItemById(@PathVariable long itemId){
        return ResponseEntity.ok(itemsService.deleteItem(itemId));
   }
}
