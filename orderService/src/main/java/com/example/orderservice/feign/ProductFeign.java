package com.example.orderservice.feign;

import com.example.orderservice.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product",url ="http://localhost:8081/" )
public interface ProductFeign {


    @GetMapping("/product/{id}")
    Product getOneProduct(@PathVariable Long id);
}
