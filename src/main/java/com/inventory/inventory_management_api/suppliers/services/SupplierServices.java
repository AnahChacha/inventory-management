package com.inventory.inventory_management_api.suppliers.services;

import com.inventory.inventory_management_api.suppliers.dto.SupplierDto;
import com.inventory.inventory_management_api.suppliers.model.Supplier;

import java.util.List;

public interface SupplierServices {
    Supplier createSupplier(SupplierDto supplierDto);

    List<Supplier>getAllSuppliers();
}
