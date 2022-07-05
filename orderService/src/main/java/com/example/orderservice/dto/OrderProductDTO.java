package com.example.orderservice.dto;

import lombok.*;

import javax.persistence.Entity;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderProductDTO {


    private Long productID;

    public Integer count;

}
