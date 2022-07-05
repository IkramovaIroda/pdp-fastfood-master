package com.example.adminservice.repositary;

import com.example.adminservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositary extends JpaRepository<Product,Long> {
    //TODO cleint list //clien/all
}
