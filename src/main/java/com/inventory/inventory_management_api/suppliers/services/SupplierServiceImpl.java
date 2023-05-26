package com.inventory.inventory_management_api.suppliers.services;

import com.inventory.inventory_management_api.suppliers.dto.SupplierDto;
import com.inventory.inventory_management_api.suppliers.model.Supplier;
import com.inventory.inventory_management_api.suppliers.repository.SupplierRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierServices{
    private final SupplierRepo supplierRepo;

    @Override
    public Supplier createSupplier(SupplierDto supplierDto) {
        Supplier supplier=new Supplier();
        supplier.setName(supplierDto.getName());
        return supplierRepo.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepo.findAll();
    }
}
