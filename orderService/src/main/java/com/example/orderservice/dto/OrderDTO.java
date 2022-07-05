package com.example.orderservice.dto;

import com.example.orderservice.entity.Filial;
import com.example.orderservice.entity.Human;
import com.example.orderservice.entity.enums.OrderStatus;
import com.example.orderservice.entity.enums.PayType;

import java.math.BigDecimal;
import java.util.List;


import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDTO {

    //Keladi
//    private Long curirerId;

    //Keladi
    private Long operatorId;


    private String payType;

    private List<OrderProductDTO> orderProductDTOS;

    private BigDecimal bigDecimal;

    //keladi
    private Long  filialId;

//    private OrderStatus orderStatus;

    //keladi
    private Long clientId;







}
