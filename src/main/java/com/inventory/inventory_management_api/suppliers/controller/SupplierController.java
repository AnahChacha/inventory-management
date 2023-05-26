package com.inventory.inventory_management_api.suppliers.controller;

import com.inventory.inventory_management_api.suppliers.dto.SupplierDto;
import com.inventory.inventory_management_api.suppliers.model.Supplier;
import com.inventory.inventory_management_api.suppliers.services.SupplierServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
@RequiredArgsConstructor
public class SupplierController {
    private final SupplierServices supplierServices;

    @PostMapping(value = "/createSupplier")
    public ResponseEntity<Supplier>createSupplier(@RequestBody SupplierDto supplierDto){
        return ResponseEntity.ok(supplierServices.createSupplier(supplierDto));
    }

    @GetMapping(value = "/getSuppliers")
    public ResponseEntity<List<Supplier>>getAllSuppliers(){
        return ResponseEntity.ok(supplierServices.getAllSuppliers());
    }
}
