package com.example.orderservice.service;

import com.example.orderservice.dto.ApiResponse;
import com.example.orderservice.dto.OrderDTO;
import com.example.orderservice.dto.OrderProductDTO;
import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.OrderProduct;
import com.example.orderservice.entity.Product;
import com.example.orderservice.entity.enums.OrderStatus;
import com.example.orderservice.entity.enums.PayType;
import com.example.orderservice.feign.AdminServiceFeign;
import com.example.orderservice.feign.ClientServiceFeign;
import com.example.orderservice.feign.ProductFeign;
import com.example.orderservice.repositroy.OrderProductRepository;
import com.example.orderservice.repositroy.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final AdminServiceFeign adminServiceFeign;
    private final ClientServiceFeign clientServiceFeign;
    private final ProductFeign productFeign;
    private final OrderRepository orderRepository;
    private final OrderProductRepository orderProductRepository;


    public ApiResponse saveOrder(OrderDTO orderDTO) {


        Order order=new Order();


        order.setOrderStatus(OrderStatus.NEW);

        order.setClient(clientServiceFeign.getOneClient(orderDTO.getClientId()).getData());
        order.setFilial(adminServiceFeign.getOneFilial(orderDTO.getFilialId()).getData());
        order.setDeliveryPrice(orderDTO.getBigDecimal());


        for (OrderProductDTO orderProductDTO : orderDTO.getOrderProductDTOS()) {
            OrderProduct orderProduct=new OrderProduct();
            orderProduct.setCount(orderProductDTO.getCount());
            ApiResponse<Product> oneProduct = adminServiceFeign.getOneProduct(orderProductDTO.getProductID());

            orderProduct.setProduct(oneProduct.getData());

            OrderProduct save = orderProductRepository.save(orderProduct);

        }

        order.setPayType(PayType.valueOf(orderDTO.getPayType()));
        return ApiResponse.builder()
                .success(true)
                .message("saved")
                .build();

    }

}
