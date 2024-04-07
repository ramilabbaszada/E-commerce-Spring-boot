package com.portfolio.ecommercebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
