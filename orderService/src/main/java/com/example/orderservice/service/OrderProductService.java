package com.example.orderservice.service;

import com.example.orderservice.dto.ApiResponse;
import com.example.orderservice.dto.OrderProductDTO;
import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.OrderProduct;
import com.example.orderservice.feign.ProductFeign;
import com.example.orderservice.repositroy.OrderProductRepository;
import com.example.orderservice.repositroy.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderProductService {


    private final OrderProductRepository orderProductRepository;
    private final OrderRepository orderRepository;
    private final ProductFeign productFeign;

    public ApiResponse saveOrderProduct(OrderProductDTO orderProductDTO){

        OrderProduct orderProduct=new OrderProduct();
        orderProduct.setCount(orderProductDTO.getCount());
        orderProduct.setProduct(productFeign.getOneProduct(orderProductDTO.getProductID()));
        orderProductRepository.save(orderProduct);
        return ApiResponse.builder()
                .message("saved")
                .success(true)
                .build();
    }



}
