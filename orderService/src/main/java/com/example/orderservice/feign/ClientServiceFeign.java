package com.example.orderservice.feign;

import com.example.orderservice.dto.ApiResponse;
import com.example.orderservice.entity.Human;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENTSERVICE")
public interface ClientServiceFeign {


    @GetMapping("/human/{id}")
    ApiResponse<Human> getOneClient(@PathVariable Long id);
}
