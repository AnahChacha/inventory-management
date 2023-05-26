package com.inventory.inventory_management_api.suppliers.repository;

import com.inventory.inventory_management_api.suppliers.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier,Long> {

}
