package com.example.orderservice.feign;

import com.example.orderservice.dto.ApiResponse;
import com.example.orderservice.entity.Category;
import com.example.orderservice.entity.Filial;
import com.example.orderservice.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ADMINSERVICE" )
public interface AdminServiceFeign {



    @GetMapping("/filial/{id}")
    ApiResponse<Filial> getOneFilial(@PathVariable Long id);


    @GetMapping("/category/{id}")
    ApiResponse<Category> getOneCategory(@PathVariable Long id);


    @GetMapping("/product/{id}")
    ApiResponse<Product> getOneProduct(@PathVariable Long id);
}
