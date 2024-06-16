package com.store.electronicStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.electronicStore.models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> 
{

}
