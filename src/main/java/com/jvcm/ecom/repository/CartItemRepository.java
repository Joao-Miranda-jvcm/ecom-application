package com.jvcm.ecom.repository;

import com.jvcm.ecom.model.CartItem;
import com.jvcm.ecom.model.Product;
import com.jvcm.ecom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByUserAndProduct(User user, Product product);

    void deleteByUserAndProduct(User user, Product product);
}
