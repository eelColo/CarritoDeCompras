package com.ShopAndStock.shoppingCart.repositories;

import com.ShopAndStock.shoppingCart.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
