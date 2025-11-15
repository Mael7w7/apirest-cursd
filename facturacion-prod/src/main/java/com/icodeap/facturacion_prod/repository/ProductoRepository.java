package com.icodeap.facturacion_prod.repository;

import com.icodeap.facturacion_prod.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
